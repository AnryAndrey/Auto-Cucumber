package com.luxoft.dbdc.etsycom.pageobjects;

import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;

public class EtsyComPageObject extends BasePageObject{

    public EtsyComPageObject(WebDriver webDriver){
        super(webDriver);
        webDriver.get("http://etsy.com/uk");
    }

}
