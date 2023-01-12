package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {

    @FindBy(className = "gLFyf")
    WebElement inputBuscador;

    @FindBy(className = "gNO89b")
    WebElement btnBuscar;

    @FindBy(xpath = "//input[contains(@data-ved,'0ahUKEwjEk7GzsL38AhVnHrkGHdHyDX4Q4dUDCAg')]")
    WebElement btnBuscarForce;

    @FindBy(className = "RNmpXc")
    WebElement btnTenerSuerte;

    public Google(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }

    public void ingresarBusqueda(String busqueda) {
        inputBuscador.sendKeys(busqueda);
    }

    public void clickBtnBuscar() {
        btnBuscar.click();
    }
}

