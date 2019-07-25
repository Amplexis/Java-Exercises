public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6, 3));
        System.out.println(calcFeetAndInchesToCentimeters(-45));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (! (feet >= 0 && (inches >=0 && inches <= 12))) return -1;
        //1 inch = 2.54 cm
        // 1 foot = 12 inches

        double newInches = (feet * 12) + inches;
        double centimeters = newInches * 2.54;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (! (inches >=0)) return -1;

        double feet = inches / 12;
        feet = Math.floor(feet);

        double remainingInches = inches % 12;
        double centimeters = calcFeetAndInchesToCentimeters(feet, remainingInches);

        return centimeters;

    }

}
