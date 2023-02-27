package br.com.consultaendereco.exception;

import br.com.consultaendereco.dto.ErrorDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ErroApiHandler {

    @ExceptionHandler(value = {EnderecoNaoEncontradoException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorDto handleEnderecoNaoEncontradoException(EnderecoNaoEncontradoException ex) {
        return new ErrorDto( ex.getMessage(), HttpStatus.NOT_FOUND.value());
    }

    @ExceptionHandler(value = {HttpClientErrorException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorDto handleGenericException(Exception ex) {
        return new ErrorDto("CEP não encontrado!", HttpStatus.NOT_FOUND.value());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException rnfe, HttpServletRequest request){
        List<ErrorDto> listaErrorDetalhes = new ArrayList<>();
        List<FieldError> fieldErrors = rnfe.getBindingResult().getFieldErrors();

        fieldErrors.forEach(
                e -> {
                    ErrorDto detalhes = new ErrorDto(e.getDefaultMessage(), HttpStatus.BAD_REQUEST.value());
                    listaErrorDetalhes.add(detalhes);
                });
        return new ResponseEntity<>(listaErrorDetalhes, null, HttpStatus.BAD_REQUEST);
    }
}

