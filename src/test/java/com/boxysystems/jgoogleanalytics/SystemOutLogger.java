package com.boxysystems.jgoogleanalytics;

/**
 * Created by IntelliJ IDEA.
 * User: SHAMEED
 * Date: Mar 29, 2008
 * Time: 1:18:37 PM
 */
public class SystemOutLogger implements LoggingAdapter {

    public void logError(String errorMessage) {
      System.out.println("errorMessage = "+errorMessage);
    }

    public void logMessage(String message) {
      System.out.println("message = " + message);
    }
  }

