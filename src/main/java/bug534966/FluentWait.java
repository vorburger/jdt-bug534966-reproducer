package bug534966;

import java.util.function.Function;

public class FluentWait<T> implements Wait<T> {

	public FluentWait<T> withMessage(final String message) {
		// ...
		return this;
	}

	public <V> V until(Function<? super T, V> isTrue) {
		return null;
	}
}
