package com.rl.tests;

import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SwipableWebDriver extends RemoteWebDriver implements HasTouchScreen {
private RemoteTouchScreen touch;

    public SwipableWebDriver(URL remoteAddress, Capabilities desiredCapabilities) {
        super(remoteAddress, desiredCapabilities);
        touch = new RemoteTouchScreen(getExecuteMethod());
    }

    public TouchScreen getTouch() {
        return touch;
    }
}
