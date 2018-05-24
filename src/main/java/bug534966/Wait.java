package bug534966;

import java.util.function.Function;

public interface Wait<F> {
	
	<T> T until(Function<? super F, T> isTrue);
	
}
