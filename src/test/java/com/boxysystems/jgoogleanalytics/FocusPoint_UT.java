package com.boxysystems.jgoogleanalytics;

import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: shameed
 * Date: Mar 20, 2008
 * Time: 3:45:26 PM
 */
public class FocusPoint_UT extends TestCase {

  public void testGetContentURI_Simple() throws Exception{
    FocusPoint focusPoint = new FocusPoint("BoxySystems");
    String contentURI = focusPoint.getContentURI();
    assertNotNull(contentURI);
    assertEquals("/BoxySystems",contentURI);
  }

  public void testGetContentURI_OneLevel() throws Exception{
    FocusPoint parentFocusPoint = new FocusPoint("BoxySystems");
    FocusPoint childFocusPoint = new FocusPoint("LibraryFinder", parentFocusPoint);
    String contentURI = childFocusPoint.getContentURI();
    assertNotNull(contentURI);
    assertEquals("/BoxySystems/LibraryFinder",contentURI);
  }

  public void testGetContentURI_TwoLevel() throws Exception{
    FocusPoint parentFocusPoint = new FocusPoint("BoxySystems");
    FocusPoint child1FocusPoint = new FocusPoint("LibraryFinder", parentFocusPoint);
    FocusPoint child2FocusPoint = new FocusPoint("FindLibraryDialog", child1FocusPoint);
    String contentURI = child2FocusPoint.getContentURI();
    assertNotNull(contentURI);
    assertEquals("/BoxySystems/LibraryFinder/FindLibraryDialog",contentURI);
  }

  public void testGetContentURI_ThreeLevel() throws Exception{
    FocusPoint parentFocusPoint = new FocusPoint("BoxySystems");
    FocusPoint child1FocusPoint = new FocusPoint("LibraryFinder", parentFocusPoint);
    FocusPoint child2FocusPoint = new FocusPoint("FindLibraryDialog", child1FocusPoint);
    FocusPoint child3FocusPoint = new FocusPoint("RegexPattern", child2FocusPoint);
    String contentURI = child3FocusPoint.getContentURI();
    assertNotNull(contentURI);
    assertEquals("/BoxySystems/LibraryFinder/FindLibraryDialog/RegexPattern",contentURI);
  }

  public void testGetContentTitle_Simple() throws Exception{
    FocusPoint focusPoint = new FocusPoint("BoxySystems");
    String contentTitle = focusPoint.getContentTitle();
    assertNotNull(contentTitle);
    assertEquals("BoxySystems",contentTitle);
  }

  public void testGetContentTitle_OneLevel() throws Exception{
    FocusPoint parentFocusPoint = new FocusPoint("BoxySystems");
    FocusPoint childFocusPoint = new FocusPoint("LibraryFinder", parentFocusPoint);
    String contentTitle = childFocusPoint.getContentTitle();
    assertNotNull(contentTitle);
    assertEquals("BoxySystems-LibraryFinder",contentTitle);
  }

  public void testGetContentTitle_TwoLevel() throws Exception{
    FocusPoint parentFocusPoint = new FocusPoint("BoxySystems");
    FocusPoint child1FocusPoint = new FocusPoint("LibraryFinder", parentFocusPoint);
    FocusPoint child2FocusPoint = new FocusPoint("FindLibraryDialog", child1FocusPoint);
    String contentTitle = child2FocusPoint.getContentTitle();
    assertNotNull(contentTitle);
    assertEquals("BoxySystems-LibraryFinder-FindLibraryDialog",contentTitle);
  }

  public void testGetContentTitle_ThreeLevel() throws Exception{
    FocusPoint parentFocusPoint = new FocusPoint("BoxySystems");
    FocusPoint child1FocusPoint = new FocusPoint("LibraryFinder", parentFocusPoint);
    FocusPoint child2FocusPoint = new FocusPoint("FindLibraryDialog", child1FocusPoint);
    FocusPoint child3FocusPoint = new FocusPoint("RegexPattern", child2FocusPoint);
    String contentTitle = child3FocusPoint.getContentTitle();
    assertNotNull(contentTitle);
    assertEquals("BoxySystems-LibraryFinder-FindLibraryDialog-RegexPattern",contentTitle);
  }

}
