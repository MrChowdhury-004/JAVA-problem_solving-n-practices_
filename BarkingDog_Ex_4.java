public class BarkingDog_Ex_4 {
    public static void main(String[] args) {
        shouldWakeUp(true, 23);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
        if (barking) {
            if ((hourOfTheDay < 8) && (hourOfTheDay > -1) )  {
                barking = true;
            }
            else if ( hourOfTheDay < 0 ) {
                barking = false;
            }
            else if (hourOfTheDay > 22 && hourOfTheDay < 24) {
                barking = true;
            }
            else {
                barking = false;
            }
        }
          //System.out.println(barking);
        return barking;
    }
}
