package com.open.test.dashboard.common;

/**
 * @author vineet.karandikar.yash.com
 * @since 4/14/2016
 * This is customized runtime exception for climate dash board.
 *
 */
public class ClimateDashboardException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public ClimateDashboardException() {
    super();
  }

  public ClimateDashboardException(String s) {
    super(s);
  }

  public ClimateDashboardException(String s, Throwable throwable) {
    super(s, throwable);
  }

  public ClimateDashboardException(Throwable throwable) {
    super(throwable);
  }
}
