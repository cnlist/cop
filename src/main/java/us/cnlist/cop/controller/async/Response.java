package us.cnlist.cop.controller.async;

import org.springframework.http.HttpStatus;

public class Response<T> {
    private T data;
    private Status status;

    public Response(T data, Status status) {
        this.data = data;
        this.status = status;
    }

    public Response(Status status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public static Response createErrorResponse(){
        return new Response(Status.ERROR);
    }
    public static Response createErrorResponse(String msg){
        return new Response(new Status(HttpStatus.BAD_REQUEST,msg));
    }

    public static Response createErrorResponse(Throwable e) {
        return new Response(new Status(HttpStatus.BAD_REQUEST, e.getLocalizedMessage()));
    }
    public static Response OK = new Response(Status.OK);
}
