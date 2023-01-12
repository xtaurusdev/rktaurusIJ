package testSuite;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClass.BusquedaAnimalesGoogle;


public class Prueba {

    EdgeDriver webDriver;
    String url = "https://www.google.cl/";


    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.edge.driver","driverEdge/msedgedriver.exe");
        webDriver = new EdgeDriver();
        webDriver.get(url);
    }


    @AfterTest
    public void closeDriver() {
        webDriver.close();
    }


    @Test
    public void buscarPerroEnGoogle() {
        BusquedaAnimalesGoogle busquedaAnimalesGoogle = new BusquedaAnimalesGoogle();
        busquedaAnimalesGoogle.busquedaPerro(webDriver);
    }


}
