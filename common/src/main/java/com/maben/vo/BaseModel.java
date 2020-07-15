package com.maben.vo;

import com.maben.pageutil.Page;

import java.util.Objects;

public class BaseModel<M> {
    private Integer uuid;
    private Page<M> page  = new Page<>();

    public Page<M> getPage() {
        return page;
    }

    public void setPage(Page<M> page) {
        this.page = page;
    }
    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        BaseModel that = (BaseModel) o;
        return Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
