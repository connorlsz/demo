package com.lsz.demo.dao;

import com.lsz.demo.entity.Person;

import java.util.List;

public interface PersonDao {
    //我是分支代码
    List<Person> queryPersonList();
}
