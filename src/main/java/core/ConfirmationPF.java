package core;

import org.openqa.selenium.WebDriver;

public class ConfirmationPF {
	
	public static void validate(WebDriver driver, String url) {
		
		CommonPF.open(url);
		
		CommonPF.pageValidationPF("03. Element [First Name (field)]: ", CommonPF.pf_el_07);
		
		}
}
