package us.cnlist.cop.pgu.mos.api;

public class PostCounterResponse {
    private String errorMessage;

    private Object result;

    private String session_id;

    private String request_id;

    private String errorCode;

    private String execTime;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime;
    }

    @Override
    public String toString() {
        return "ClassPojo [errorMessage = " + errorMessage + ", result = " + result + ", session_id = " + session_id + ", request_id = " + request_id + ", errorCode = " + errorCode + ", execTime = " + execTime + "]";
    }
}
