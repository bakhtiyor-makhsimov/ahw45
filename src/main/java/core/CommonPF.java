package core;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPF {

	static WebDriver driver;

	public static void open(String url) {
		String USERAGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:55.0) Gecko/20100101 Firefox/55.0";
		Logger.getLogger("").setLevel(Level.OFF);
		driver = new HtmlUnitDriver();
		PageFactory.initElements(driver, CommonPF.class);
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		((HtmlUnitDriver) driver).getBrowserVersion().setUserAgent(USERAGENT);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("UserAgent: " + (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;"));
		System.out.println("Page URL: " + driver.getCurrentUrl());
	}
	
	public static void quite() {
		driver.quit();
	}

	public static boolean isPresent(By by) {
		if (driver.findElements(by).size() > 0) return true;
		else return false;
	}
	
    public static boolean isPresentPF(WebElement element) {
//    	if (element.getTagName() != null) return true; else return false;
        try {element.getTagName(); return true;}
        		catch (NoSuchElementException e) {return false;}
    }

	public static boolean isVisible(By by) {
		if ((driver.findElements(by).size() > 0) && driver.findElement(by).isDisplayed()) return true;
		else return false;
	}
	
public static void pageValidation(String test_case, By el) {
		System.out.println(test_case +	(Common.isPresent(el) ? "Exists" : "Not exist")); 
}

public static void pageValidationPF(String test_case, WebElement element) {
	System.out.println(test_case +	(isPresentPF(element) ? "Exists" : "Not exist")); 
}

	static By el_01 = By.id("id_quotes");						// signup
	@FindBy(id="id_quotes") @CacheLookup static WebElement pf_el_01;
	
	static By el_02 = By.id("id_current_location");				// signup
	@FindBy(id="id_current_location") @CacheLookup static WebElement pf_el_02;
	
	static By el_03 = By.id("id_weather_icon");					// signup
	@FindBy(id="id_weather_icon") @CacheLookup static WebElement pf_el_03;
	
	static By el_04 = By.id("id_temperature");					// signup
	@FindBy(id="id_temperature") @CacheLookup static WebElement pf_el_04;
	
	static By el_05 = By.id("id_f_title");						// signup & confirmation
	@FindBy(id="id_f_title") @CacheLookup static WebElement pf_el_05;

	static By el_06 = By.id("id_f_label_fn");					// signup & confirmation
	@FindBy(id="id_f_label_fn") @CacheLookup static WebElement pf_el_06;
	
	static By el_07 = By.id("id_fname");							// signup & confirmation
	@FindBy(id="id_fname") @CacheLookup static WebElement pf_el_07;

	static By el_08 = By.id("id_f_label_ln");					// signup & confirmation
	static By el_09 = By.id("id_lname");							// signup & confirmation

	static By el_10 = By.id("id_f_label_ea");					// signup & confirmation
	static By el_11 = By.id("id_email");							// signup & confirmation

	static By el_12 = By.id("id_f_label_pn");					// signup & confirmation
	static By el_13 = By.id("id_phone");							// signup & confirmation

	static By el_14 = By.id("id_rb_label_g");					// signup & confirmation

	static By el_15 = By.id("id_rb_label_m");					// signup
	static By el_16 = By.id("id_gender_male");					// signup

	static By el_17 = By.id("id_rb_label_f");					// signup
	static By el_18 = By.id("id_gender_female");					// signup

	static By el_19 = By.id("id_f_label_s");						// signup & confirmation
	static By el_20 = By.id("id_state");							// signup & confirmation
	static By el_21 = By.xpath("//*[@id='id_state']/option[6]"); 	// signup

	static By el_22 = By.id("id_cb_label_t");					// signup & confirmation
	static By el_23 = By.id("id_terms");							// signup & confirmation

	static By el_24 = By.id("id_img_facebook");					// signup
	static By el_25 = By.id("id_img_twitter");					// signup
	static By el_26 = By.id("id_img_flickr");					// signup
	static By el_27 = By.id("id_img_youtube");					// signup

	static By el_28 = By.id("id_reset_button");					// signup
	static By el_29 = By.id("id_submit_button");					// signup

	static By el_30 = By.id("timestamp");						// signup
	static By el_31 = By.id("copyright");						// signup & confirmation
	static By el_32 = By.id("os_browser");						// signup

	static By el_33 = By.id("ErrorLine");						// signup
	static By el_34 = By.id("fname_error");						// signup
	static By el_35 = By.id("lname_error");						// signup
	static By el_36 = By.id("email_error");						// signup
	static By el_37 = By.id("phone_error");						// signup
	
	static By el_38 = By.xpath("//*[@id='fname_error']/img");		// signup
	static By el_39 = By.xpath("//*[@id='lname_error']/img");		// signup
	static By el_40 = By.xpath("//*[@id='email_error']/img");		// signup
	static By el_41 = By.xpath("//*[@id='phone_error']/img");		// signup
	
	static By el_42 = By.id("id_gender");						//confirmation
	static By el_43 = By.id("id_back_button");					//confirmation
	
}
