public class ConsoleLogger extends BaseLogger {
    public ConsoleLogger() {
    }

    public void Log(String message) {
        System.out.println("Logged to console: " + message);
    }
}
