/**
 * 
 */
package com.open.test.dashboard.common;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * @author vineet.karandikar.yash.com
 * @since 4/14/2016
 *
 */
@ControllerAdvice
public class ClimateDshboardExceptionControllerAdvice {

  @Autowired
  ClimateDashboardError error;

  private static final Logger LOGGER = LoggerFactory.getLogger(ClimateDshboardExceptionControllerAdvice.class);

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(ClimateDashboardException.class)
  @ResponseBody
  public ClimateDashboardError shareException(ClimateDashboardException exception) {
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error stack trace "
        + exception.getStackTrace().toString() + Constant.LOGGERMESSAGEEND);
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error cause " + exception.getMessage()
        + Constant.LOGGERMESSAGEEND);
    error.setErrormessage(exception.getMessage());
    return error;
  }

  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(DataAccessException.class)
  @ResponseBody
  public ClimateDashboardError shareException(DataAccessException exception) {
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error stack trace "
        + exception.getStackTrace().toString() + Constant.LOGGERMESSAGEEND);
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error cause " + exception.getMessage()
        + Constant.LOGGERMESSAGEEND);
    error.setErrormessage(exception.getCause().getMessage());
    error.setTrace(null);
    return error;
  }

  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(IOException.class)
  @ResponseBody
  public ClimateDashboardError shareException(IOException exception) {
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error stack trace "
        + exception.getStackTrace().toString() + Constant.LOGGERMESSAGEEND);
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error cause " + exception.getMessage()
        + Constant.LOGGERMESSAGEEND);
    error.setErrormessage(exception.getMessage());
    error.setTrace(exception.getCause().toString());
    return error;
  }

  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(FileNotFoundException.class)
  @ResponseBody
  public ClimateDashboardError shareException(FileNotFoundException exception) {
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error stack trace "
        + exception.getStackTrace().toString() + Constant.LOGGERMESSAGEEND);
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error cause " + exception.getMessage()
        + Constant.LOGGERMESSAGEEND);
    error.setErrormessage(exception.getMessage());
    error.setTrace(exception.getCause().toString());
    return error;
  }

  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(NullPointerException.class)
  @ResponseBody
  public ClimateDashboardError shareException(NullPointerException exception) {
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error stack trace "
        + exception.getStackTrace().toString() + Constant.LOGGERMESSAGEEND);
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error cause " + exception.getMessage()
        + Constant.LOGGERMESSAGEEND);
    error.setErrormessage(exception.getMessage());
    error.setTrace(exception.getCause().toString());
    return error;
  }

  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(Exception.class)
  @ResponseBody
  public ClimateDashboardError shareException(Exception exception) {
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error stack trace "
        + exception.getStackTrace().toString() + Constant.LOGGERMESSAGEEND);
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error cause " + exception.getMessage()
        + Constant.LOGGERMESSAGEEND);
    error.setErrormessage(exception.getMessage());
    error.setTrace(exception.getCause().toString());
    return error;
  }
}
