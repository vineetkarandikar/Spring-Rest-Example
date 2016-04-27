package com.open.test.dashboard.common;

import org.springframework.stereotype.Component;

/**
 * @author vineet.karandikar.yash.com
 * @since 4/16/2016 
 * This class is responsible for transforming error/exception in generalized ones.
 * 
 *
 */
@Component
public class ClimateDashboardError {

  private String errormessage;

  private String trace = "NA";

  public String getErrormessage() {
    return errormessage;
  }

  public void setErrormessage(String errormessage) {
    this.errormessage = errormessage;
  }

  public String getTrace() {
    return trace;
  }

  public void setTrace(String trace) {
    this.trace = trace;
  }

}
