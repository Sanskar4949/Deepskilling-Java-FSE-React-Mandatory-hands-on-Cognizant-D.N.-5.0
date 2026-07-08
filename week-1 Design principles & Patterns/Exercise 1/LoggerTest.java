public class LoggerTest {

    public static void main(String[] args) {

        System.out.println("Requesting first Logger instance...");
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started");

        System.out.println();
        System.out.println("Requesting second Logger instance...");
        Logger logger2 = Logger.getInstance();
        logger2.log("User logged in");

        System.out.println();
        System.out.println("Are logger1 and logger2 the same object? " + (logger1 == logger2));

        System.out.println();
        System.out.println("Total logs recorded (via logger1): " + logger1.getLogCount());
        System.out.println("Total logs recorded (via logger2): " + logger2.getLogCount());

    }

}
