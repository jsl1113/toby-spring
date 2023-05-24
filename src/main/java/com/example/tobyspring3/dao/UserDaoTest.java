package com.example.tobyspring3.dao;

import com.example.tobyspring3.domain.User;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionMaker cm = new DConncectionMaker();
        UserDao userDao = new UserDao(cm);

        User user = new User();
        user.setId("9");
        user.setName("kyeongrok");
        user.setPassword("1234");
        userDao.add(user);


        User selectedUser = userDao.get("9");
        System.out.println(selectedUser.getId());
        System.out.println(selectedUser.getName());
        System.out.println(selectedUser.getPassword());
    }
}
