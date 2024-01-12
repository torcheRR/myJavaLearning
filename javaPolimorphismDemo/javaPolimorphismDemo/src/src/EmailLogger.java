public class EmailLogger extends BaseLogger {
    public EmailLogger() {
    }

    public void Log(String message) {
        System.out.println("Logged to email : " + message);
    }
}