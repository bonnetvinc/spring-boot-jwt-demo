package poc.spring.handlers;

import java.util.Date;

public class ErrorResponse {
  private int errorCode;
  private Date timestamp;
  private String message;
  private String description;

  public ErrorResponse(int errorCode, Date timestamp, String message, String description) {
    this.errorCode = errorCode;
    this.timestamp = timestamp;
    this.message = message;
    this.description = description;
  }

  public int getErrorCode() {
    return errorCode;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public String getMessage() {
    return message;
  }

  public String getDescription() {
    return description;
  }
}