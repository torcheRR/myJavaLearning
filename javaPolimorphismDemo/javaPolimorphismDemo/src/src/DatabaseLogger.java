public class DatabaseLogger extends BaseLogger {
    public DatabaseLogger() {
    }

    public void Log(String message) {
        System.out.println("Logged to databes : " + message);
    }
}