package Com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.base.Base_Class;
import Com.interfaceelements.PleaceOrderInterfaceElements;
import Com.utility.FileReaderManager;

public class PlaceOrder extends Base_Class implements PleaceOrderInterfaceElements{

	@FindBy(xpath=placeorder_xpath)
	private WebElement palceorder;
	
	@FindBy(id=email_id)
	private WebElement email;
	
	@FindBy(id=password_id)
	private WebElement password;
	
	@FindBy(xpath=logIn_xpath)
	private WebElement login;
	
	public PlaceOrder() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void orderprodct() throws IOException {
		FileReaderManager data=new FileReaderManager();
		clickElement(palceorder);
		inputPass(email,data.getproperty("user") );
		inputPass(password,data.getproperty("password") );
		clickElement(login);
		
	}
	
	
}
