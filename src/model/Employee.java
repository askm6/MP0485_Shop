package model;

import main.Logable;

public class Employee extends Person implements Logable {

    private final static int EMPLOYEE_ID = 123;
    private final static String PASSWORD = "test";

    @Override
    public boolean login(int user, String password) {
        return ((user == this.EMPLOYEE_ID) && (password.equals(this.PASSWORD)));
    }

}
