package testSuite;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClass.BusquedaAnimalesGoogle;
import testClass.LogearseNova;

import java.text.ParseException;


public class PruebaLogin {

    EdgeDriver webDriver;
    String url = "https://www.qanovagroup.com/piloto/";


    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.edge.driver","driverEdge/msedgedriver.exe");
        webDriver = new EdgeDriver();
        webDriver.get(url);
    }


    @AfterTest
    public void closeDriver() {
       // webDriver.close();
    }


    @Test
    public void loginTest() {
        LogearseNova logearseNova = new LogearseNova();
        logearseNova.credencialesLogin(webDriver);
    }

    @Test
    public void poblarTest() {
        LogearseNova logearseNova = new LogearseNova();
        logearseNova.credencialesLogin(webDriver);
        logearseNova.poblarCampos(webDriver);

    }

    @Test
    public void st() throws ParseException {
        LogearseNova logearseNova = new LogearseNova();
        logearseNova.credencialesLogin(webDriver);


    }




}
