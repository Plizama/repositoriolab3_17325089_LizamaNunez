package org.example;

public class User_17325089_LizamaNunez {
    private String nameUser;
    private boolean login;


    public User_17325089_LizamaNunez(String nameUser) {
        this.nameUser = nameUser;
        this.login = false;
    }


    @Override
    public String toString() {
        return "User{" +
                "nameUser='" + nameUser + '\'' +
                ", login=" + login +
                '}';
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public boolean isLogin() {
        return login;
    }
}