package exception;

public class GlobalExceptionHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Uncaught exception in thread: " + t.getName());
        System.out.println(e.getMessage().toString());;
    }
}
