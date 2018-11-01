package us.cnlist.cop.pgu.mos.api;

public class AuthContainer {
    private Device_info device_info;

    private Auth auth;

    private Info info;

    public Device_info getDevice_info() {
        return device_info;
    }

    public void setDevice_info(Device_info device_info) {
        this.device_info = device_info;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "ClassPojo [device_info = " + device_info + ", auth = " + auth + ", info = " + info + "]";
    }
}