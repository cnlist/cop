package us.cnlist.cop.controller.async;

public class Response {
    Object data;
    Status status;

    public Response(Object data, Status status) {
        this.data = data;
        this.status = status;
    }
}
