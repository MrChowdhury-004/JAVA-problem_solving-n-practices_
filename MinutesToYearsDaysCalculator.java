public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0)
            System.out.println("Invalid Value");
        else{
            int day = 0;
            int year = (int) minutes / 525600;
            int remMinutes = (int) minutes % 525600;
            if (remMinutes > 0){
                 day = remMinutes / 1440;
            }
            System.out.println(minutes + " min = " + year
                    + " y and " + day + " d");
        }

    }
}
