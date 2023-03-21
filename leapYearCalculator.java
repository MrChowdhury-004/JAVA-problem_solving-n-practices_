public class leapYearCalculator {
    public static void main(String[] args) {
        isLeapYear(1924);
    }
    public static boolean isLeapYear(int year){
        //boolean result;
        if (year >= 1 && year <= 9999 ){
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0 ) {
                          return true;
                        //System.out.println(result);
                    }
                    else {
                         return false;
                        //System.out.println(result);
                    }
                }
                else {
                     return true;
                    //System.out.println(result);
                }
            }
            else{
                 return false;
                //System.out.println(result);
            }
        }
        else {
             return false;
            //System.out.println(result);
        }
        //System.out.println(result);
        //return result;
    }
}
