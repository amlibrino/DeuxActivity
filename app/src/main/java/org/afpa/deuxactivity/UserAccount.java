package org.afpa.deuxactivity;


public class UserAccount {

    private String userName;
    private String userType;
    Boolean active = true;

    public UserAccount(String userName, String userType, Boolean active) {
        this.userName = userName;
        this.userType = userType;
        this.active = active;
    }

    @Override
    public String toString(){
        return this.userName+"("+this.userType+")";

    }
}
