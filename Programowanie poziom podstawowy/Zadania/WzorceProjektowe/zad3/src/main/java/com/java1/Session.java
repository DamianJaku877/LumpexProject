package com.java1;

public class Session {

    private static Session session;
    private String loggedUser;

    private Session(){
    }

    public static Session getSession(){
        if(session == null){
            session = new Session();
        }
        return session;
    }

    public void loginUser(String loggedUser){
        this.loggedUser = loggedUser;
    }

    public String logoutUser() {
        return loggedUser;
    }
}
