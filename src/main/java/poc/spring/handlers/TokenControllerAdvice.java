package poc.spring.handlers;

import java.util.Date;

import poc.spring.exception.RefreshTokenException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class TokenControllerAdvice {

  @ExceptionHandler(value = RefreshTokenException.class)
  @ResponseStatus(HttpStatus.FORBIDDEN)
  public ErrorResponse handleTokenRefreshException(RefreshTokenException ex, WebRequest request) {
    return new ErrorResponse(
        HttpStatus.FORBIDDEN.value(),
        new Date(),
        ex.getMessage(),
        request.getDescription(false));
  }
}
