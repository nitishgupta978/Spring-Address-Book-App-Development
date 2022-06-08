package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

/**
 * Create Response POJO Objects : Essentially Response DTO has the message and the model  Data Object.
 * The ResponseEntity ensure the ResponseDTO is converted to JSON Response on REST call
 */
public @Data class ResponseDTO {
//    private String firstname;
    private String message;
    private Object data;

    public ResponseDTO(String message, Object data) {
//        this.firstname = firstname;
        this.message = message;
        this.data = data;
    }


}
