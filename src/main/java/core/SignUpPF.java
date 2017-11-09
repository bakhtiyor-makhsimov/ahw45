package core;

import org.openqa.selenium.WebDriver;

public class SignUpPF {
	
	public static void validate(WebDriver driver, String url) {
		
		CommonPF.open(url);
				
		CommonPF.pageValidationPF("01. Element [Quotes (dynamic)]: ", 	CommonPF.pf_el_01);
		CommonPF.pageValidationPF("02. Element [Current Location]: ", 	CommonPF.pf_el_02);
		CommonPF.pageValidationPF("03. Element [Weather Icon]: ", 		CommonPF.pf_el_03);
		CommonPF.pageValidationPF("04. Element [Quotes (dynamic)]: ",	CommonPF.pf_el_04);
		CommonPF.pageValidationPF("05. Element [Title]: ", 				CommonPF.pf_el_05);
		CommonPF.pageValidationPF("06. Element [First Name (label)]: ", CommonPF.pf_el_06);
		CommonPF.pageValidationPF("07. Element [First Name (field)]: ", CommonPF.pf_el_07);
		}
}
