package Com.pageobjectmodel;

import java.awt.Window;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.base.Base_Class;
import Com.interfaceelements.AddressPageInterfaceElements;
import Com.utility.FileReaderManager;

public class AddressPage extends Base_Class implements AddressPageInterfaceElements {
	
	//@FindBy (xpath=address_xpath)
	private WebElement address;
	
	@FindBy (xpath=company_xpath)
	private WebElement company;
	
	@FindBy (xpath=street_xpath)
	private WebElement Street;
	
	@FindBy (xpath=city_xpath)
	private WebElement city;
	
	@FindBy (xpath=Country_xpath)
	private WebElement country;
	
	@FindBy (xpath=state_xpath)
	private WebElement state;
	
	@FindBy (xpath=Postalcode_xpath)
	private WebElement postalcode;
	
	@FindBy (xpath=phoneno_xpath)
	private WebElement phoneno;
	
	@FindBy (xpath=radiobtn_xpath)
	private WebElement radiobtn;
	
	@FindBy (xpath=next_xpath)
	private WebElement next;
	
	
	
	public AddressPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void validaddress() throws IOException {
		
		FileReaderManager data= new FileReaderManager();
	    clickElement(address);
		inputPass(company, data.getproperty("company"));
		inputPass(Street, data.getproperty("street"));
		inputPass(city, data.getproperty("city"));
		inputPass(country, data.getproperty("country"));
		inputPass(state, data.getproperty("state"));
		inputPass(postalcode, data.getproperty("postalcode"));
		scrollDown(-1500);
		inputPass(phoneno, data.getproperty("phoneno"));
		clickElement(radiobtn);
		clickElement(next);
		
	
	}

}
