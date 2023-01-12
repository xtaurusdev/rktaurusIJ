package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.mustache.Value;

import java.util.Date;

public class CargarInformacion {

    @FindBy(id = "imObjectForm_1_2")
    WebElement txtField;

    @FindBy(id = "imObjectForm_1_4")
    WebElement txtFieldLarge;

    @FindBy(id = "imObjectForm_1_3")
    WebElement txtFieldEmail;

    @FindBy(id = "imObjectForm_1_5_container")
    WebElement txtDate;

    @FindBy(id = "imObjectForm_1_6")
    WebElement txtDropdownList;

    @FindBy(id = "imObjectForm_1_submit")
    WebElement btnEnviarDatos;

    @FindBy(id = "imObjectForm_1_reset")
    WebElement btnResetearDatos;



    @FindBy(id = "imObjectForm_1_7_2")
    WebElement chckbx3;

    @FindBy(id = "imObjectForm_1_7_1")
    WebElement chckbx2;

    @FindBy(id = "imObjectForm_1_7_0")
    WebElement chckbx1;

    @FindBy(id = "imObjectForm_1_8_0")
    WebElement radioButton1;

    @FindBy(id = "imObjectForm_1_8_1")
    WebElement radioButton2;

    @FindBy(id = "imObjectForm_1_8_2")
    WebElement radioButton3;








    public String waitTimeLogin(WebDriver webDriver) {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 30);
        webDriverWait.until(ExpectedConditions.visibilityOf(txtField));
        String texto = txtField.getText();
        return texto;
    }
    public CargarInformacion(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }


    public void ingresarTexto(String texto){
        txtField.sendKeys(texto);
    }

    public void ingresarTextoLargo(String textoLargo){
        txtFieldLarge.sendKeys(textoLargo);
    }

    public void ingresarEmail(String textoEmail){
        txtFieldEmail.sendKeys(textoEmail);
    }

    public void ingresarTextoFecha(String textoFecha){
        txtDate.sendKeys(textoFecha);
    }

    public void ingresarDpSelect(String valor){
        Select select = new Select(txtDropdownList);
        select.selectByVisibleText(valor);
    }

    public  void seleccionMultiple(int indicador){
        switch (indicador) {
            case 1:
                chckbx1.click();
                break;
            case 2:
                chckbx2.click();
                break;
            case 3:
                chckbx3.click();
                break;
            default:
                System.out.println("Valor no procesable");
        }
    }

    public  void rbSeleccionMultiple(int indicador){
        switch (indicador) {
            case 1:
                radioButton1.click();
                break;
            case 2:
                radioButton2.click();
                break;
            case 3:
                radioButton3.click();
                break;
            default:
                System.out.println("Valor no procesable");
        }
    }

    public void enviarDatosBtnClick(){
        btnEnviarDatos.click();
    }

    public void resetearDatosClick(){
        btnResetearDatos.click();
    }

}
