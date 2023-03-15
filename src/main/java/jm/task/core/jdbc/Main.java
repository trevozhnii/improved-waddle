package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl usi = new UserServiceImpl();

        usi.createUsersTable();
        usi.saveUser("Ulya", "Ivanova", (byte) 18);
        usi.saveUser("Olya", "Kazakova", (byte) 21);
        usi.saveUser("Alex", "Nizov", (byte) 45);
        usi.saveUser("Nikita", "ChegotoNePonimaushii", (byte) 60);
        usi.getAllUsers();
        usi.cleanUsersTable();
        usi.dropUsersTable();

    }
}
