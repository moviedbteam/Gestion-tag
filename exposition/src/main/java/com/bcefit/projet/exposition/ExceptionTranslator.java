package com.bcefit.projet.exposition;

import com.bcefit.projet.domain.ResourceAlreadyExistsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.stream.Collectors;

@ControllerAdvice
public class ExceptionTranslator extends ResponseEntityExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(ExceptionTranslator.class);

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException ex,
                                                                  final HttpHeaders headers, final HttpStatus status, final WebRequest request) {

        final String errors = ex.getBindingResult() //
                .getFieldErrors().stream() //
                .map(x -> x.getDefaultMessage()) //
                .collect(Collectors.joining(","));

        final ErrorModel apiError = ErrorModel.builder() //
                .code("") //
                .message(errors) //
                .description("Please check your parameters")//
                .build();

        LOG.info(ex.getMessage());
        return handleExceptionInternal(ex, apiError, headers, HttpStatus.BAD_REQUEST, request);
    }


    @ExceptionHandler(value = {ResourceAlreadyExistsException.class})
    @ResponseBody
    public ResponseEntity<Object> handleAlreadyExistingException(final ResourceAlreadyExistsException ex) {

        final ErrorModel apiError = ErrorModel.builder() //
                .message(ex.getLocalizedMessage()) //
                .code("409")
                .description("Resource existante")
                .build();

        LOG.info(ex.getMessage());
        return new ResponseEntity<Object>(apiError, new HttpHeaders(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ResponseEntity<Object> handleOthers(final Exception ex) {

        final ErrorModel apiError = ErrorModel.builder() //
                .code("err.internal") //
                .message(ex.getLocalizedMessage()) //
                .description("internal error occurred, please contact your administrator")//
                .build();

        LOG.error(ex.getMessage(), ex);

        return new ResponseEntity<Object>(apiError, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

