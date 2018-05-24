# jdt-bug534966-reproducer

https://bugs.eclipse.org/bugs/show_bug.cgi?id=534966

The src/main/java/bug534966/ItsRed.java is red.

If src/main/java/bug534966/ExpectedCondition.java is changed to `extends` something with an `java.lang.FunctionalInterface` annotation, then it's fine.

Wasn't `@FunctionalInterface` meant to be only an _informative annotation_ ? ;-)

_However, the compiler will treat any interface meeting the
definition of a functional interface as a functional interface
regardless of whether or not a {@code FunctionalInterface}
annotation is present on the interface declaration._
