# jdt-bug534966-reproducer

https://bugs.eclipse.org/bugs/show_bug.cgi?id=534966

The [class ItsRed](src/main/java/bug534966/ItsRed.java) is red in Eclipse Photon Milestone 7 (4.8.0M7).  But when [class ExpectedCondition.java](src/main/java/bug534966/ExpectedCondition.java) is changed to `extends` something with an `java.lang.FunctionalInterface` annotation (such as `java.util.function.Function`, or [Guava 23.6's](https://github.com/google/guava/blob/v23.6/guava/src/com/google/common/base/Function.java) instead of [Guava 17's](https://github.com/google/guava/blob/v17.0/guava/src/com/google/common/base/Function.java) `Function`), then it's fine....

Wasn't `@FunctionalInterface` meant to be only an _informative annotation_ ? ;-)
_"However, the compiler will treat any interface meeting the
definition of a functional interface as a functional interface
regardless of whether or not a {@code FunctionalInterface}
annotation is present on the interface declaration."_
