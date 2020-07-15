package com.maben.dao;


import java.util.List;

public interface BaseDao<M,QM> {
    void create(M m);

    public void update(M m);

    public void delete(Integer uuid);

    public M getByUuid(Integer uuid);

    public List<M> getByConditionPage(QM c);
}
