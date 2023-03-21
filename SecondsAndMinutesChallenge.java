public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        //System.out.println(getDurationString(3945)); // 1st test case
        System.out.println(getDurationString(65, 145)); // 2nd test case
    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "invalid seconds! (" + seconds + "), minutes must be positive!";
        }
        int minutes = seconds / 60;
        return getDurationString(minutes,seconds % 60);
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0){
            return "invalid minutes( " + minutes + "(, must be positive!";
        }
        if(seconds >= 59 || seconds <= 0){
            return "Invalid Seconds! (" + seconds + "), must be between 0 and 59";
        }
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m "  + seconds + "s";
    }
}
