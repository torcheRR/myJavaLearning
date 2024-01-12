public class FileLogger extends BaseLogger {
    public FileLogger() {
    }

    public void Log(String message) {
        System.out.println("Logged to file : " + message);
    }
}