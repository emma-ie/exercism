public class LogLevels {
    
    public static String message(String logLine) {
        String[] split = logLine.split(":"); 
        return split[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] split = logLine.split(":");
        System.out.println(split[0]);

        if (split[0].equals("[ERROR]")) {
            return "error";
        }
        else if (split[0].equals("[WARNING]")) {
            return "warning";
        }
        else {
            return "info";
        }
    }

    public static String reformat(String logLine) {
        return message(logLine) + " " + "(" + logLevel(logLine) + ")";
        
        /*
        String s1 = message(logLine);
        String s2 = logLevel(logLine);
        return (s1 + " " + "(" + s2 + ")");
        */
    }
}
