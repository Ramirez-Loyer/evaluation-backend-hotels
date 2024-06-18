package fms.fr.eval_fullstack_backend.web;

import fms.fr.eval_fullstack_backend.entities.ErrorResponse;
import fms.fr.eval_fullstack_backend.exception.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelExceptionHandler {

    private String INCORRECT_REQUEST = "INCORRECT_REQUEST";
    private String BAD_REQUEST = "BAD_REQUEST";

    /**
     * Exception handler for RecordNotFoundException.
     *
     * @param ex      the exception.
     * @param request the web request.
     * @return ResponseEntity containing the error response.
     */
    @ExceptionHandler(RecordNotFoundException.class)
    public final ResponseEntity<ErrorResponse> handleUserNotFoundException(RecordNotFoundException ex, WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        ErrorResponse error = new ErrorResponse(INCORRECT_REQUEST, details);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    /**
     * Exception handler for MissingRequestHeaderException.
     *
     * @param ex      the exception.
     * @param request the web request.
     * @return ResponseEntity containing the error response.
     */
    @ExceptionHandler(MissingRequestHeaderException.class)
    public final ResponseEntity<ErrorResponse> handleInvalidTraceIdException(MissingRequestHeaderException ex, WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        ErrorResponse error = new ErrorResponse(BAD_REQUEST, details);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    /**
     * Exception handler for MaxUploadSizeExceededException.
     *
     * @param exc the exception.
     * @return ResponseEntity containing the error response.
     */
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<Map<String, String>> handleMaxSizeException(MaxUploadSizeExceededException exc) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "La taille du fichier dépasse la limite autorisée !");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
