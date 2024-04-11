package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserService userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("Test1", "Test1", (byte) 1);
        userService.saveUser("Test2", "Test2", (byte) 2);
        userService.saveUser("Test3", "Test3", (byte) 3);
        userService.saveUser("Test4", "Test4", (byte) 4);
        List<User> users = userService.getAllUsers();
        for (User user: users) {
            System.out.println(user.toString());
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
