package Com.runner;

import java.io.IOException;

import Com.base.Base_Class;
import Com.pageobjectmanager.PageObjectManager;

public class LumaRunner extends Base_Class {

	public static void main(String[] args) throws IOException {

		PageObjectManager pageObjectManager = new PageObjectManager();
		launchingBroweser(pageObjectManager.getFileReader().getproperty("browser"));
		launchUrl(pageObjectManager.getFileReader().getproperty("url"));
		pageObjectManager.getLoginPage().validLogin();
		//takeScreenshot();
		pageObjectManager.getSearchpage().searchProduct();
		pageObjectManager.getAddressPage().validaddress();
		pageObjectManager.getPalceOrder().orderprodct();
		
	}

}
