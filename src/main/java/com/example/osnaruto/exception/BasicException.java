package com.example.osnaruto.exception;

public class BasicException extends SecurityException{
    private String motivo;

    public BasicException(String motivo) {
        this.motivo = motivo;
    }

    public String getMotivo() {
        return motivo;
    }
}
