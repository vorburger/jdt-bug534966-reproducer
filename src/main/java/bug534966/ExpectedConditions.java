package bug534966;

public class ExpectedConditions {

	public static ExpectedCondition<Object> jsReturnsValue(final String javaScript) {
		return new ExpectedCondition<Object>() {
			@Override
			public Object apply(WebDriver driver) {
				return null;
			}
		};
	}
}
