package Com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.base.Base_Class;
import Com.interfaceelements.LoginPageInterfaceElements;
import Com.utility.FileReaderManager;

public class LoginPage extends Base_Class implements LoginPageInterfaceElements {
	
	@FindBy(xpath=signIn_xpath)
	private WebElement sigIn;
	
	@FindBy(id=mail_id)
	private WebElement mail;
	
	@FindBy(css=password_css)
	private WebElement password;
	
	@FindBy(xpath=logIn_xpath)
	private WebElement login;

public LoginPage() {
	PageFactory.initElements(driver, this);
}

public void validLogin() throws IOException {
	FileReaderManager data=new FileReaderManager();
	clickElement(sigIn); 
	inputPass(mail,data.getproperty("user"));
	inputPass(password, data.getproperty("password"));
	clickElement(login);
	implicitWait(3);
	//takeScreenshot();
	
}
}
