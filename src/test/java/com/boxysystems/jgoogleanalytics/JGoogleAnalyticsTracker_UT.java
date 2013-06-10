package com.boxysystems.jgoogleanalytics;

import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: SHAMEED
 * Date: Mar 23, 2008
 * Time: 5:52:35 PM
 */
public class JGoogleAnalyticsTracker_UT extends TestCase {

  private FocusPoint parentFocusPoint = new FocusPoint("JGoogleAnalyticsTest");
  private FocusPoint syncChildFocuPoint = new FocusPoint("TrackingSynchronously", parentFocusPoint);
  private FocusPoint asyncChildFocuPoint = new FocusPoint("TrackingAsynchronously", parentFocusPoint);


  public void testTrackSynchronously_LibraryFinder() throws Exception {
    JGoogleAnalyticsTracker tracker = new JGoogleAnalyticsTracker("JGoogleAnalytics", "v0.1", "UA-4017644-1");
    tracker.setLoggingAdapter(new SystemOutLogger());
    tracker.trackSynchronously(syncChildFocuPoint);
  }

  public void testTrackAsynchronously_LibraryFinder() throws Exception {
    JGoogleAnalyticsTracker tracker = new JGoogleAnalyticsTracker("JGoogleAnalytics", "v0.1", "UA-4017644-1");
    tracker.setLoggingAdapter(new SystemOutLogger());
    tracker.trackAsynchronously(asyncChildFocuPoint);
    Thread.sleep(3000);
  }

}
