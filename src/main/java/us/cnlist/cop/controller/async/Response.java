package us.cnlist.cop.controller.async;

import org.springframework.http.HttpStatus;

public class Response {
    private Object data;
    private Status status;

    public Response(Object data, Status status) {
        this.data = data;
        this.status = status;
    }

    public Response(Status status) {
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
    public static Response createErrorResponse(String msg){
        return new Response(new Status(HttpStatus.BAD_REQUEST,msg));
    }
}
