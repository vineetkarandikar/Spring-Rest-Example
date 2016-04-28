package com.open.test.dashboard.common;

/**

 * @since 4/14/2016
 * This is customized runtime exception for climate dash board.
 *
 */
public class DashboardException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public DashboardException() {
    super();
  }

  public DashboardException(String s) {
    super(s);
  }

  public DashboardException(String s, Throwable throwable) {
    super(s, throwable);
  }

  public DashboardException(Throwable throwable) {
    super(throwable);
  }
}
