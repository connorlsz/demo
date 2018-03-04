package com.lsz.demo.dao;

import com.lsz.demo.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.Assert.*;
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class PersonDaoTest {
    @Autowired
    private PersonDao personDao;
//    @Test
//    public void queryPersonList() throws Exception {
//
//        List<Person> list  = personDao.queryPersonList();
//
//        assertEquals(1,list.size());
//    }

    public static void main(String[] agrs) {

        PersonDaoTest personDaoTest = new PersonDaoTest();

        // 获取类的类类型
        Class c = personDaoTest.getClass();

        // 获取类所有字段
        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {
            Class c1 = field.getType();
            System.out.println(c1.getSimpleName());
            System.out.println(field.getName());
        }

        // 获取类中的所有方法
        Method[] m = c.getDeclaredMethods();
        // 获取类申明的所有构造函数
        Constructor[] constructors = c.getDeclaredConstructors();


        for (Method method : m) {

            Class mc = method.getClass();
            System.out.println(method.getReturnType());
        }

        try {
            Method method = c.getDeclaredMethod("start", String.class);
            method.invoke(personDaoTest,"黎世洲");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    public String start(String str){
        System.out.println(str);
        return "";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonDaoTest that = (PersonDaoTest) o;

        return personDao != null ? personDao.equals(that.personDao) : that.personDao == null;
    }

    @Override
    public int hashCode() {
        return personDao != null ? personDao.hashCode() : 0;
    }
}