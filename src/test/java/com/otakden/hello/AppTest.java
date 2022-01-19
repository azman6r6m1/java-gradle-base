package com.otakden.hello;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Azman Kudus
 */
public class AppTest {
  @Test
  public void appHasAGreeting() throws URISyntaxException, IOException {
    Path propertiesFile = Paths.get(App.class.getClassLoader().getResource("app.properties").toURI());
    Assert.assertNotNull(new App().getGreeting(propertiesFile), "app should have a greeting");
  }
}
