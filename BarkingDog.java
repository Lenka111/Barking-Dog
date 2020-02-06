//several short methods created in the same class
public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (!barking ||  hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23))
            return false;
        return true;
    }

// Checking for leap years
    public static boolean isLeapYear(int year){
        if (year< 1 || year >9999 )
            return false;
        return ((year % 4 == 0)&&(year % 100 != 0)|| (year % 400 == 0) );


    }
// Decimal Comparator
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        num1 = (int)(num1 * 1000);
        num2 = (int)(num2 *1000);
        System.out.println(num1 + " and " +  num2);

        return num1 == num2;

    }

    public static boolean hasTeen(int num1, int num2, int num3){
        if (num1< 1 || num2<1 || num3 < 1)
            return false;
        return (num1 >=13 && num1 <=19 && num2 >=13 && num2 <=19 && num3 >=13 && num3 <= 19);
    }
    public static boolean isTeen(int num1){
        return (num1 >=13 && num1 <=19);}


    public static void main(String[] args) {
        System.out.println(hasTeen(0,0,12));
        System.out.println(areEqualByThreeDecimalPlaces(3.1567, 3.1578));
        System.out.println(isLeapYear(1600));
        System.out.println(shouldWakeUp(true, 1));
    }
}
