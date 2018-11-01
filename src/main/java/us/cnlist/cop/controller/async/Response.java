package us.cnlist.cop.controller.async;

public class Response {
    private Object data;
    private Status status;

    public Response(Object data, Status status) {
        this.data = data;
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
