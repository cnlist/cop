package us.cnlist.cop.pgu.mos.api;

public class AuthResponse {
    private float errorCode;
    Result ResultObject;
    private String errorMessage;
    private float execTime;
    private String request_id;
    private String session_id;


    // Getter Methods

    public float getErrorCode() {
        return errorCode;
    }

    public Result getResult() {
        return ResultObject;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public float getExecTime() {
        return execTime;
    }

    public String getRequest_id() {
        return request_id;
    }

    public String getSession_id() {
        return session_id;
    }

    // Setter Methods

    public void setErrorCode(float errorCode) {
        this.errorCode = errorCode;
    }

    public void setResult(Result resultObject) {
        this.ResultObject = resultObject;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setExecTime(float execTime) {
        this.execTime = execTime;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public static class Result {
        private String session_id;
        private String name;
        private String surname;
        private boolean is_filled;


        // Getter Methods

        public String getSession_id() {
            return session_id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public boolean getIs_filled() {
            return is_filled;
        }

        // Setter Methods

        public void setSession_id(String session_id) {
            this.session_id = session_id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setIs_filled(boolean is_filled) {
            this.is_filled = is_filled;
        }
    }
}
