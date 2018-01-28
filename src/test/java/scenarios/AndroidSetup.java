package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class AndroidSetup {
  protected AndroidDriver driver;

  protected void prepareAndroidForAppium() throws MalformedURLException {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("appium-version", "1.0");
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("platformVersion", "5.1");
    capabilities.setCapability("deviceName", "micromax-micromax_e313-192.168.0.102:5555");//Micromax Micromax E313
    capabilities.setCapability("app", "/home/nimish/Downloads/Flipkart.apk");
    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  }
}