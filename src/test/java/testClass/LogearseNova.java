package testClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.CargarInformacion;
import page.Login;



public class LogearseNova {

    private Login login;
    private CargarInformacion cargarInformacion;



    public void credencialesLogin(WebDriver webDriver) {
        login = new Login(webDriver);
        login.tipearDatosLogin("nvivas","qanova");
        login.clickBtnLogin();
    }

    public void poblarCampos(WebDriver webDriver) {
        cargarInformacion = new CargarInformacion(webDriver);
        cargarInformacion.waitTimeLogin(webDriver);
        cargarInformacion.ingresarTexto("Pepito");
        cargarInformacion.ingresarTextoLargo("ASDASDASDASDASHDGASHDGASHDGHASDHGASHDGASHDGASGHDASH");
        cargarInformacion.ingresarEmail("asdasddas@gmail.com");
        cargarInformacion.ingresarDpSelect("valor 1");
        cargarInformacion.seleccionMultiple(2);
        cargarInformacion.rbSeleccionMultiple(3);
        cargarInformacion.enviarDatosBtnClick();
    }


}
