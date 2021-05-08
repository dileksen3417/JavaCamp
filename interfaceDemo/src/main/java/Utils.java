public class Utils {
    public static void runLoggers(Logger[] logger, String message){
        for (Logger loggers:logger){
            loggers.log(message);
        }
    }
}
