package us.cnlist.cop.pgu.mos.api;

public class Auth {
    private String guid;

    private String login;

    private String password;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ClassPojo [guid = " + guid + ", login = " + login + ", password = " + password + "]";
    }
}