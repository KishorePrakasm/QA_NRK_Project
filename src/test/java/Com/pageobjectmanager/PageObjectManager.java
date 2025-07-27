package Com.pageobjectmanager;

import Com.pageobjectmodel.AddressPage;
import Com.pageobjectmodel.LoginPage;
import Com.pageobjectmodel.PlaceOrder;
import Com.pageobjectmodel.SearchPage;
import Com.utility.FileReaderManager;

public class PageObjectManager {
	
	private LoginPage loginPage;
	private FileReaderManager fileReader;
	private SearchPage searchpage;
	private AddressPage addressPage;
	private PlaceOrder palceOrder;
	public LoginPage getLoginPage() {
		if (loginPage==null) {
			loginPage=new LoginPage();
			}
		return loginPage;
	}
	public PlaceOrder getPalceOrder() {
		if (palceOrder==null) {
			palceOrder =new PlaceOrder();
			
		}
		return palceOrder;
	}
	public FileReaderManager getFileReader() {
		if (fileReader==null) {
			fileReader=new FileReaderManager();	
		} 
		return fileReader;
	}
	public SearchPage getSearchpage() {
		if (searchpage==null) {
			
			searchpage=new SearchPage();
			
		}
		return searchpage;
	}
	public AddressPage getAddressPage() {
		if (addressPage==null) {
			
			addressPage=new AddressPage();	
		}
		return addressPage;
	}

}
