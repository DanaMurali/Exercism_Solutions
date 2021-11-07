public class LogLevels {

    public static String message(String logLine) {

        String[] splitString = logLine.split(" ", 2);
        String trimmedString = splitString[1].trim();
        return trimmedString;

    }

    public static String logLevel(String logLine) {
        if (logLine.contains("[ERROR]")) {
            return "error";
        } else if (logLine.contains("[WARNING]")) {
            return "warning";
        } else if (logLine.contains("[INFO]")) {
            return "info";
        } return null;
    }

    public static String reformat (String logLine){

        String[] splitString = logLine.split(" ", 2);
        String trimmedString = splitString[1].trim();
        if (logLine.contains("[ERROR]")) {
            return trimmedString + " (error)";
        } else if (logLine.contains("[WARNING]")) {
            return trimmedString + " (warning)";
        } else if (logLine.contains("[INFO]")) {
            return trimmedString + " (info)";
        } return null;

    }
}
