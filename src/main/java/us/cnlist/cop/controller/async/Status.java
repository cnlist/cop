package us.cnlist.cop.controller.async;

import org.springframework.http.HttpStatus;

public class Status {
    private HttpStatus status;
    private String description;

    public Status(HttpStatus status, String description) {
        this.status = status;
        this.description = description;
    }

    public Status(HttpStatus status) {
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
