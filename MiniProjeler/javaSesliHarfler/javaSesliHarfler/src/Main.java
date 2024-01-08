public class Main {
    public static void main(String[] args) {
        char harf='a';

        switch (harf){
            case'A':
            case'a':
            case'I':
            case'ı':
            case'o':
            case'O':
            case'u':
            case'U':
                System.out.println("Kalın Sesli Harf.");
                break;
            default:
                System.out.println("İnce Sesli Harf.");

        }
    }
}