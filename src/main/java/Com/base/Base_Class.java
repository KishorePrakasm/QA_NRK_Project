package Com.base;

import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Base_Class {
	public static WebDriver driver;
	
	public static ExtentReports extentReports;
	
	public static File file;
	

	protected static WebDriver launchingBroweser(String browserName) {
//launchingbroweser

		try {
			if (browserName.equalsIgnoreCase("chrome")) {

				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {

				driver = new EdgeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING BROWSER LAUNCH");
		}
		driver.manage().window().maximize();
		return driver;
	}

//launchurlUrl
	protected static void launchUrl(String url) {
		try {
			driver.get(url);

		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING URL LAUNCH");
		}
	}

//closeBrowser
	protected static void closeBrowser(String type) {
		try {
			if (type.equalsIgnoreCase("close")) {

				driver.close();

			} else if (type.equalsIgnoreCase("quit")) {
				driver.quit();

			}

		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING BROWSER CLOSING");
		}
	}

//navigate
	protected static void navigate(String type) {

		try {
			if (type.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();

			} else if (type.equalsIgnoreCase("back")) {
				driver.navigate().back();

			} else if (type.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			}

		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING BROWSER NAVIGATE");
		}
	}

//navigateToURL
	protected static void navigateToURL(String url) {
		try {
			driver.navigate().to(url);

		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING NAVIGATE TO URL");
		}
	}

//alert
	protected static void alert(String type, String value) {
		try {
			if (type.equalsIgnoreCase("accept")) {

				driver.switchTo().alert().accept();

			} else if (type.equalsIgnoreCase("dismiss")) {

				driver.switchTo().alert().dismiss();
			}

		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING ALERT POPUP");
		}

	}

//clickElement
	protected static void clickElement(WebElement element) {

		try {
			element.click();

		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING CLICK ON ELEMENT");
		}
	}

//inputPass
	protected static void inputPass(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING VALUE ON PASSING");
		}

	}

//frame
	protected static void frame(WebElement element, String type, String value) {
		try {
			if (type.equalsIgnoreCase("nameorid")) {
				driver.switchTo().frame(value);

			} else if (type.equalsIgnoreCase("index")) {
				driver.switchTo().frame(Integer.parseInt(value));

			} else if (type.equalsIgnoreCase("element")) {

				driver.switchTo().frame(element);

			}

		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING SWITCH TO FRAME");
		}
	}

//get
	protected static void get(String type) {
		try {
			if (type.equalsIgnoreCase("currentUrl")) {
				System.out.println("Current Url: " + driver.getCurrentUrl());

			} else if (type.equalsIgnoreCase("getTitle")) {
				System.out.println("Titel: " + driver.getTitle());

			} else if (type.equalsIgnoreCase("pageSource")) {
				System.out.println("PageSource: " + driver.getPageSource());

			}

		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING GETTING TYPES");
		}

	}

//BrowserOptions
	protected static void BrowserOptions(WebElement element, String type) {

		try {

			if (type.equalsIgnoreCase("isSelected")) {

				boolean selected = element.isSelected();

				System.out.println("Element is Selected");

			} else if (type.equalsIgnoreCase("isDisplayed")) {

				boolean displayed = element.isDisplayed();

				System.out.println("Element is Displayed");

			} else if (type.equalsIgnoreCase("isEnabled")) {

				boolean enabled = element.isEnabled();

				System.out.println("Element is Enabled");

			}
		} catch (Exception e) {

			Assert.fail("Error: Occur during Browser Options");

		}

	}

	// wait
	protected static void implicitWait(String type, int time) {
		try {
			if (type.equalsIgnoreCase("seconds")) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

			} else if (type.equalsIgnoreCase("minutes")) {
				driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(time));
			}

		} catch (Exception e) {
			Assert.fail("Error: Occur during Browser wait");
		}

	}

//actionMethods
	protected static void actionMethods(WebElement element, String type) {
		try {
			Actions action = new Actions(driver);
			if (type.equalsIgnoreCase("click")) {

				action.click(element).perform();

			} else if (type.equalsIgnoreCase("doubleClick")) {

				action.doubleClick(element).perform();
			} else if (type.equalsIgnoreCase("contextClick")) {

				action.contextClick(element).perform();
			} else if (type.equalsIgnoreCase("clickAndHold")) {

				action.clickAndHold(element).perform();
			} else if (type.equalsIgnoreCase("release")) {

				action.release().perform();
			} else if (type.equalsIgnoreCase("moveToElement")) {

				action.moveToElement(element).perform();
			}

		} catch (Exception e) {
			Assert.fail("Error: Occur during USING ACTIONS METHODS");
		}
	}

//droupDown
	protected static void droupDown(WebElement element, String type, String value) {

		try {

			Select select = new Select(element);

			if (type.equalsIgnoreCase("value")) {

				select.selectByValue(value);

			} else if (type.equalsIgnoreCase("index")) {

				select.selectByIndex(Integer.parseInt(value));

			} else if (type.equalsIgnoreCase("text")) {

				select.selectByVisibleText(value);

			}

		} catch (Exception e) {

			Assert.fail("ERROR : OCCUR DURING VALUE SELECT");

		}
	}

//deSelect
	protected static void deSelect(WebElement element, String type, String value) {

		try {

			Select select = new Select(element);

			if (type.equalsIgnoreCase("value")) {

				select.deselectByValue(value);

			} else if (type.equalsIgnoreCase("index")) {

				select.deselectByIndex(Integer.parseInt(value));

			} else if (type.equalsIgnoreCase("text")) {

				select.deselectByVisibleText(value);

			}

		} catch (Exception e) {

			Assert.fail("ERROR: OCCUR DURING VALUE DESELECTED");

		}
	}

//getWindowHandels
	protected static void getWindowHandels(int num) {

		try {

			List<String> allWindow = new ArrayList<String>(driver.getWindowHandles());

			driver.switchTo().window(allWindow.get(num));

		} catch (Exception e) {

			Assert.fail("ERROR: OCCUR DURING WINDOW HANDLING");

		}
	}

	// takeScreenshot
//	protected static void takeScreenshot() {
//		try {
//			Date currentDate = new Date();
//
//			System.out.println(currentDate);
//
//			String dateFile = currentDate.toString().replace("", "").replace(":", "");
//
//			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//			FileHandler.copy(screenshot, new File(
//					"C:\\Users\\praka\\eclipse-workspace\\MavenProject\\mavenProject\\screenshot" + dateFile + ".png"));
//
//		} catch (Exception e) {
//			Assert.fail("ERROR: OCCUR DURING TAKEING SCREENSHOT");
//		}
//	}

	// keyBoard
	protected static void keyBoard(String type) {
		try {
			Robot robot = new Robot();
			if (type.equalsIgnoreCase("enter")) {
				robot.keyPress(KeyEvent.VK_ENTER);

			} else if (type.equalsIgnoreCase("backSpace")) {
				robot.keyPress(KeyEvent.VK_BACK_SPACE);

			}

		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING KEYBOARD ACTIONs");
		}
	}

	protected static void implicitWait(int duration) {

		try {

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));

		} catch (Exception e) {

			Assert.fail("ERROR OCCURED IN IMPLICIT WAIT METHOD");

		}

	}

	
	public void scrollDown(int pixels) {
	    try {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, arguments[0]);", pixels);
	    }catch (Exception e) {
			// TODO: handle exception
		}
	    	
	    }
	
	public static void extentReportStart(String location) {
	try {
		     extentReports = new ExtentReports();
		    file = new File(location);
		    ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		    extentReports.attachReporter(sparkReporter);
		    extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		    extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
		
	} 
	catch (Exception e) {
		
	}   
	}

	public static void extentReportTearDown(String location) throws IOException {
		try {  extentReports.flush();
	    file = new File(location);
	    Desktop.getDesktop().browse((file).toURI());
	}
		catch (Exception e) {
	}
	}
	

	public String takeScreenshots() throws IOException {
	   try {
		   TakesScreenshot screenshot = (TakesScreenshot) driver;
		    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		    File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		    File destFile = new File("Screenshot\\" + "Screenshot_" + timeStamp + ".png");
		    FileUtils.copyFile(srcFile, destFile);
		    return destFile.getAbsolutePath();
		
	}
	   catch (Exception e) {
		// TODO: handle exception
	}
	return null; 
	}


	}




