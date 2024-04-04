package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        //userServiceImpl.dropUsersTable();
        //userServiceImpl.createUsersTable();
        //userServiceImpl.saveUser("Test1", "Test1", (byte) 1);
        //userServiceImpl.saveUser("Test2", "Test2", (byte) 2);
        //userServiceImpl.saveUser("Test3", "Test3", (byte) 3);
        //userServiceImpl.saveUser("Test4", "Test4", (byte) 4);
        //List<User> users = userServiceImpl.getAllUsers();
        //for (User user: users) {
        //    System.out.println(user.toString());
        //}
        //userServiceImpl.cleanUsersTable();
        //userServiceImpl.dropUsersTable();
    }
}
