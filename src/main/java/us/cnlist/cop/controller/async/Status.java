package us.cnlist.cop.controller.async;

import org.springframework.http.HttpStatus;

public class Status {
    private HttpStatus status;
    private String description;

    public Status(HttpStatus status, String description) {
        this.status = status;
        this.description = description;
    }
}
