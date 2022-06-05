package com.bridgelabz.addressbookapp.dto;

/**
 * Create Response POJO Objects : Essentially Response DTO has the message and the model  Data Object.
 * The ResponseEntity ensure the ResponseDTO is converted to JSON Response on REST call
 */
public class ResponseDTO {
    private String firstname;
    private String message;
    private Object data;

    public ResponseDTO(String firstname, Object data) {
        this.firstname = firstname;
        this.message = message;
        this.data = data;
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
