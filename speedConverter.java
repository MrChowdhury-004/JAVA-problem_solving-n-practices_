public class speedConverter {
    public static void main(String[] args) {
        //toMilesPerHour(1.5);
    }
    public static long toMilesPerHour(double kilometersPerHour){


        if (kilometersPerHour < 0 )
            return -1;

        double milesPerHour = kilometersPerHour / 1.609;
        long rounded = Math.round(milesPerHour);
        return rounded;
    }
    public static void printConversion(double kilometersPerHour){

        if(kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else{
            long milesPerHour = toMilesPerHour(kilometersPerHour) ;
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
