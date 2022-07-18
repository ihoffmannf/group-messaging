package com.xcale.whatsback.groupmessaging.exception;

public class UnprocessableEntityException extends RuntimeException { // TODO: Podría extener de HTTPException pero no permite setear el mensaje de error
    public UnprocessableEntityException(String message) {
        super(message);
    }
}
