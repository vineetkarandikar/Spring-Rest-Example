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

 * @since 4/14/2016
 *
 */
@ControllerAdvice
public class DashboardExceptionControllerAdvice {

  @Autowired
  DashboardError error;

  private static final Logger LOGGER = LoggerFactory.getLogger(DashboardExceptionControllerAdvice.class);

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(DashboardException.class)
  @ResponseBody
  public DashboardError shareException(DashboardException exception) {
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
  public DashboardError shareException(DataAccessException exception) {
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
  public DashboardError shareException(IOException exception) {
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
  public DashboardError shareException(FileNotFoundException exception) {
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
  public DashboardError shareException(NullPointerException exception) {
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
  public DashboardError shareException(Exception exception) {
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error stack trace "
        + exception.getStackTrace().toString() + Constant.LOGGERMESSAGEEND);
    LOGGER.error(Constant.LOGGERMESSAGESTART + " Error cause " + exception.getMessage()
        + Constant.LOGGERMESSAGEEND);
    error.setErrormessage(exception.getMessage());
    error.setTrace(exception.getCause().toString());
    return error;
  }
}
