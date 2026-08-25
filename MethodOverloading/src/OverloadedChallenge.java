public class OverloadedChallenge {

    public static void main (String[] args){

        int myFoot = 6;
        int myInches = 3;

       // System.out.println("Your height is " + convertToCentimeters(convertToCentimeters(myFoot, myInches)) + " cm");



    }

    public static double convertToCentimeters (int height) {


        return (double) (height * 2.54);
    }

    public static double convertToCentimeters (int feet, int inches){

        double allInches = (double) ((feet * 12) + inches);
        return allInches;

    }
}
// 1 inch = 2.54 cm
// 1 foot = 12 inch