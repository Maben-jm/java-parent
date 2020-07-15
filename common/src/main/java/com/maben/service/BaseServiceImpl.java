package com.maben.service;

import com.maben.dao.BaseDao;
import com.maben.pageutil.Page;
import com.maben.vo.BaseModel;

import java.util.List;

public class BaseServiceImpl<M, QM extends BaseModel<M>> implements BaseService<M, QM> {

    private BaseDao baseDao;

    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public void create(M m) {
        baseDao.create(m);
    }

    @Override
    public void update(M m) {
        baseDao.update(m);
    }

    @Override
    public void delete(Integer uuid) {
        baseDao.delete(uuid);
    }

    @Override
    public M getByUuid(Integer uuid) {
        return (M) baseDao.getByUuid(uuid);
    }

    @Override
    public Page<M> getByConditionPage(QM qm) {
        List list = baseDao.getByConditionPage(qm);
        qm.getPage().setResult(list);
        return qm.getPage();
    }
}
