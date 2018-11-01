package us.cnlist.cop.pgu.mos.api;

public class GetFlatResponse {
    private String errorMessage;

    private Result[] result;

    private String request_id;

    private String errorCode;

    private String execTime;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Result[] getResult() {
        return result;
    }

    public void setResult(Result[] result) {
        this.result = result;
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
        return "ClassPojo [errorMessage = " + errorMessage + ", result = " + result + ", request_id = " + request_id + ", errorCode = " + errorCode + ", execTime = " + execTime + "]";
    }

    public static class Result {
        private String address;

        private String flat_number;

        private String unad;

        private String name;

        private String flat_id;

        private String paycode;

        private String electro_account;

        private String unom;

        private String electro_device;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getFlat_number() {
            return flat_number;
        }

        public void setFlat_number(String flat_number) {
            this.flat_number = flat_number;
        }

        public String getUnad() {
            return unad;
        }

        public void setUnad(String unad) {
            this.unad = unad;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFlat_id() {
            return flat_id;
        }

        public void setFlat_id(String flat_id) {
            this.flat_id = flat_id;
        }

        public String getPaycode() {
            return paycode;
        }

        public void setPaycode(String paycode) {
            this.paycode = paycode;
        }

        public String getElectro_account() {
            return electro_account;
        }

        public void setElectro_account(String electro_account) {
            this.electro_account = electro_account;
        }

        public String getUnom() {
            return unom;
        }

        public void setUnom(String unom) {
            this.unom = unom;
        }

        public String getElectro_device() {
            return electro_device;
        }

        public void setElectro_device(String electro_device) {
            this.electro_device = electro_device;
        }

        @Override
        public String toString() {
            return "ClassPojo [address = " + address + ", flat_number = " + flat_number + ", unad = " + unad + ", name = " + name + ", flat_id = " + flat_id + ", paycode = " + paycode + ", electro_account = " + electro_account + ", unom = " + unom + ", electro_device = " + electro_device + "]";
        }
    }
}
