package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Login {

    @FindBy(id = "imUname")
    WebElement fieldLogin;

    @FindBy(id = "imPwd")
    WebElement fieldPasswd;

    @FindBy(xpath = "//*[@id=\"imLogin\"]/form/div[3]/input")
    WebElement btnLogin;





    public Login(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }




    public void tipearDatosLogin(String user, String password) {
        fieldLogin.sendKeys(user);
        fieldPasswd.sendKeys(password);
    }



    public void clickBtnLogin() {
        btnLogin.click();
    }





}
