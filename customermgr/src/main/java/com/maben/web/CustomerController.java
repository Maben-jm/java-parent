package com.maben.web;

import com.maben.json.JsonHelper;
import com.maben.pageutil.Page;
import com.maben.service.CustomerService;
import com.maben.vo.CustomerModel;
import com.maben.vo.CustomerQueryModel;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "toAdd", method = RequestMethod.GET)
    public String toAdd() throws Exception {
        return "customer/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute("customerModel") CustomerModel customerModel) throws Exception {
        customerModel.setRegisterTime(DateFormatUtils.format(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss"));
        customerService.create(customerModel);
        return "customer/success";
    }

    @RequestMapping(value = "toUpdate/{customerUuid}", method = RequestMethod.GET)
    public String toUpdate(Model model, @PathVariable("customerUuid") int uuid) throws Exception {
        CustomerModel customerModel = customerService.getByUuid(uuid);
        model.addAttribute("cm", customerModel);
        return "customer/update";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(@ModelAttribute("customerModel") CustomerModel customerModel) throws Exception {
        customerService.update(customerModel);
        return "customer/success";
    }

    @RequestMapping(value = "toDelete/{customerUuid}", method = RequestMethod.GET)
    public String toDelete(Model model, @PathVariable("customerUuid") int uuid) throws Exception {
        CustomerModel customerModel = customerService.getByUuid(uuid);
        model.addAttribute("cm", customerModel);
        return "customer/delete";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String delete(@RequestParam("uuid") int uuid) throws Exception {
        customerService.delete(uuid);
        return "customer/success";
    }

    @RequestMapping(value = "toList", method = RequestMethod.GET)
    public String toList(@ModelAttribute("cwm") CustomerWebModel cwm, Model model) throws Exception {
        CustomerQueryModel cqm = null;
        if (cwm == null || cwm.getQueryJsonStr() == null || cwm.getQueryJsonStr().trim().length() == 0) {
            cqm = new CustomerQueryModel();
        } else {
            cqm = (CustomerQueryModel) JsonHelper.str2Object(cwm.getQueryJsonStr(), CustomerQueryModel.class);
        }
        int nowPage = cwm.getNowPage();
        cqm.getPage().setNowPage(nowPage);
        Page<CustomerModel> modelPage = customerService.getByConditionPage(cqm);
        model.addAttribute("wm", cwm);
        model.addAttribute("page", modelPage);
        return "customer/list";
    }

    @RequestMapping(value = "toQuery", method = RequestMethod.GET)
    public String toQuery() {
        return "customer/query";
    }

}
