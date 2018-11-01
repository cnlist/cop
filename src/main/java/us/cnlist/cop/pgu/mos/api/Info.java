package us.cnlist.cop.pgu.mos.api;

public class Info {
    private String guid;

    private String session_id;

    private String user_agent;

    private String app_version;

    private String mobile;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "ClassPojo [guid = " + guid + ", session_id = " + session_id + ", user_agent = " + user_agent + ", app_version = " + app_version + ", mobile = " + mobile + "]";
    }
}