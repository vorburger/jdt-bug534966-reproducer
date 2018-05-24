package bug534966;

import com.google.common.base.Function;

// Bug is fixed if we use java.util.function.Function 
// instead of Guava 17's com.google.common.base.Function, or if we use newer Guava such as 23.6-jre;
// both JUF as well as newer Guava have a java.lang.FunctionalInterface annotation.
public interface ExpectedCondition<T> extends Function<WebDriver, T> {}
