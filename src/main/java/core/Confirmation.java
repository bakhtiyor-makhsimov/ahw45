package core;

import org.openqa.selenium.WebDriver;

public class Confirmation {
	
	public static void validate(WebDriver driver, String url) {
		
		Common.open(url);
		
		Common.pageValidation("01. Element [Title]: ", 				Common.el_05);
		Common.pageValidation("02. Element [First Name (label)]: ",	Common.el_06);
		Common.pageValidation("03. Element [First Name (field)]: ", 	Common.el_07);
		Common.pageValidation("04. Element [Last Name (label)]: ",	Common.el_08);
		Common.pageValidation("05. Element [Last Name (field)]: ",	Common.el_09);
			
		Common.pageValidation("06. Element [Email (label)]: ", 		Common.el_10);
		Common.pageValidation("07. Element [Email (filed)]: ", 		Common.el_11);
		Common.pageValidation("08. Element [Phone (label)]: ", 		Common.el_12);
		Common.pageValidation("09. Element [Phone (field)]: ", 		Common.el_13);
		Common.pageValidation("10. Element [Genre (label)]: ", 		Common.el_14);
			
		Common.pageValidation("11. Element [Genre (field)): ", 		Common.el_42);
		Common.pageValidation("12. Element [Back (button)]: ", 		Common.el_43);	
		}
}
