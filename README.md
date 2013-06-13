#jgoogleanalytics

**JGoogleAnalytics** is a lightweight, unobtrusive Java utility for tracking usage information on Java applications through Google analytics. It can be used for gathering usage statistics on utilities, plugins(Eclipse, IntelliJ, Netbeans etc.), client-side, server-side, middleware, desktop or any Java based applications. Hence, allowing us to perform usage & trend analysis on the application of interest.


##Usage
If you have a registered [Google analytics](http://www.google.com/analytics) account, you can write a code snippet like below to capture the usage data. *FocusPoint* is a logical point of focus in the application. It can be events like application/module load, user actions, error events etc.

```java
  //Google analytics tracking code for Library Finder
  JGoogleAnalyticsTracker tracker = new JGoogleAnalyticsTracker("Library Finder","1.3.2","UA-2184000-1");

  FocusPoint focusPoint = new FocusPoint("PluginLoad");

  tracker.trackAsynchronously(focusPoint);
```

##Caveat
  * Google analytics does not update their reports in real time because of their high volume of subscribers. It usually gets updated every 24 hrs. If you are really curious to know if the tracking went fine, you can attach a *LoggingAdapter* to *JGoogleAnalyticsTracker* and see if you are seeing the success message.
  * JGoogleAnalytics would gracefully ignore errors and not collect statistics for the application running offline (without network connectivity)
