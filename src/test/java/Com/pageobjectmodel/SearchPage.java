package Com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.base.Base_Class;
import Com.interfaceelements.SearchPageInterfaceElements;

public class SearchPage extends Base_Class implements SearchPageInterfaceElements {

	@FindBy (xpath=men_xpath)
	private WebElement men;
	
	@FindBy (linkText=jakets_linkText)
	private WebElement jakets;
	
	@FindBy (xpath=montana_xpath)
	private WebElement montana;
	
	@FindBy (xpath=add_xpath)
	private WebElement add;
	
	@FindBy (id=size_id)
	private WebElement size;
	
	@FindBy (xpath=colour_xpath)
	private WebElement colour;
	
	@FindBy (xpath=addtoCart_xpath)
	private WebElement addtocart;
	
	@FindBy (xpath=carticon_xpath)
	private WebElement carticon;
	
	@FindBy (xpath=checkout_xpath)
	private WebElement checkout;
	
	public SearchPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchProduct() {
		
		clickElement(men);
		clickElement(jakets);
		clickElement(montana);
		clickElement(size);
		clickElement(colour);
		clickElement(addtocart);
		//takeScreenshot();
		clickElement(carticon);
		clickElement(checkout);
	}
	
}
