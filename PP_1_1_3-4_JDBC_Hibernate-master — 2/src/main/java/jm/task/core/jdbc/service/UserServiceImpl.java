package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoHibernateImpl userDaoHibernateImpl  = new UserDaoHibernateImpl();
    public void createUsersTable() throws SQLException {
        userDaoHibernateImpl.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        userDaoHibernateImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        userDaoHibernateImpl.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws SQLException {
        userDaoHibernateImpl.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return userDaoHibernateImpl.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        userDaoHibernateImpl.cleanUsersTable();
    }
}
