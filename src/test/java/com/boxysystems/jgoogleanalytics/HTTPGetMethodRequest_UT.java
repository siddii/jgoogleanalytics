package com.boxysystems.jgoogleanalytics;

import junit.framework.TestCase;
import org.junit.Ignore;

import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * Created by IntelliJ IDEA.
 * User: shameed
 * Date: Mar 20, 2008
 * Time: 3:37:15 PM
 */
public class HTTPGetMethodRequest_UT extends TestCase {

  public void testRequest_Failure() throws Exception {
    MockHTTPGetMethod httpGetMethod = new MockHTTPGetMethod();
    httpGetMethod.setLoggingAdapter(new SystemOutLogger());
    httpGetMethod.request("http://www.BoxySystems1.com");
    assertTrue(httpGetMethod.responseCode != HttpURLConnection.HTTP_OK);
  }

  private class MockHTTPGetMethod extends HTTPGetMethod {
    int responseCode = 0;


    protected int getResponseCode(HttpURLConnection urlConnection) throws IOException {
      responseCode = super.getResponseCode(urlConnection);
      return responseCode;
    }
  }
}
