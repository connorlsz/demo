package com.lsz.demo.dao;

import com.lsz.demo.entity.Person;

import java.util.List;

public interface PersonDao {
    // 我是主干代码
    List<Person> queryPersonList();
}
