package Com.interfaceelements;

public interface AddressPageInterfaceElements {
	
//	String address_xpath="//*[@class='action action-show-popup']";
	
	String company_xpath="(//*[@class='input-text'])[5]";
	
	String street_xpath="(//*[@class='input-text'])[6]";
	
	String city_xpath="(//*[@class='input-text'])[9]";
	
	String Country_xpath="//*[@name='country_id']";
	
	String state_xpath="//*[@name='region_id']";
	
	String Postalcode_xpath="(//*[@class='input-text'])[11]";
	
	String phoneno_xpath="(//*[@class='input-text'])[12]";
	
	String radiobtn_xpath="(//*[@class='radio'])[1]";
	
	String next_xpath="//span[text()='Next']";
	

}
