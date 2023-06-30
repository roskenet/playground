# Exceptions and Exception Handling

## Hierarchy

* Throwable, Exception, RuntimeException, Error

* Any Exception are moreoften "logical" subclasses to identify exception types.

---

Checked exceptions are intended to cover application-level problems, such as missing files and unavailable hosts. As good programmers (and upstanding citizens), we should design software to recover gracefully from these kinds of conditions. Unchecked exceptions are intended for system-level problems, such as “out of memory” and “array index out of bounds.” While these may indicate application-level programming errors, they can occur almost anywhere and usually aren’t possible to recover from. Fortunately, because they are unchecked exceptions, you don’t have to wrap every one of your array-index operations in a try/catch statement (or declare all of the calling methods as a potential source of them).

---

Because of the way the Java virtual machine is implemented, guarding against an exception being thrown (using a try) is free. It doesn’t add any overhead to the execution of your code. However, throwing an exception is not free. When an exception is thrown, Java has to locate the appropriate try/catch block and perform other time-consuming activities at runtime.

The result is that you should throw exceptions only in truly “exceptional” circumstances and avoid using them for expected conditions, especially when performance is an issue.
