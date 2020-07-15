package com.maben.service;

import com.maben.pageutil.Page;

public interface BaseService<M,QM> {
    void create(M m);

    public void update(M m);

    public void delete(Integer uuid);

    public M getByUuid(Integer uuid);

    public Page<M> getByConditionPage(QM c);
}
