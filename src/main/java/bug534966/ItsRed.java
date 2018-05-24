package bug534966;

import java.util.function.Function;

public class ItsRed {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		FluentWait<WebDriver> awaitWD = null;
		
		// workaround:
        awaitWD.withMessage("...").until((Function<? super WebDriver, Object>) ExpectedConditions.jsReturnsValue("..."));
 
        // NOK with Eclipse JDT due to https://bugs.eclipse.org/bugs/show_bug.cgi?id=534966 but OK in javac:
        awaitWD.withMessage("...").until(ExpectedConditions.jsReturnsValue("..."));
	}
	
}
