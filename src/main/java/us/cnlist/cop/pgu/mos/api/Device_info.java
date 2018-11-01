package us.cnlist.cop.pgu.mos.api;

public class Device_info {
    private String guid;

    private String app_version;

    private String user_agent;

    private String mobile;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "ClassPojo [guid = " + guid + ", app_version = " + app_version + ", user_agent = " + user_agent + ", mobile = " + mobile + "]";
    }
}
			