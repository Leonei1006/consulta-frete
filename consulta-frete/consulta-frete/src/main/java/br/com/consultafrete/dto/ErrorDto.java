package br.com.consultafrete.dto;

public class ErrorDto {

    private String message;
    private int error;

    public ErrorDto(String message, int error) {
        this.message = message;
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
}
