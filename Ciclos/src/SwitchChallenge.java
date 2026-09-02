public class SwitchChallenge {

    public static void main (String [] args){

        //System.out.println(word ('A'));
        printDayOfWeek( 0 );
        printDayOfWeek( 1 );
        printDayOfWeek( 2 );
        printDayOfWeek( 3 );
        printDayOfWeek( 4 );
        printDayOfWeek( 5 );
        printDayOfWeek( 6 );
        printDayOfWeek( 7 );


    }

    public static String word (char charValue){
    switch (charValue) {
        case 'A':
            return "Able";
        case 'B':
            return "Baker";
        case 'C':
            return "Charlie";
        case 'D':
            return "Dog";
        case 'E':
            return "Easy";
        default:
            return "Letter " + charValue + " not found in the switch";

    }
    }

//    public static void printDayOfWeek (int day){
//
//        switch (day) {
//
//            case 1 -> System.out.println(day + " is Sunday");
//            case 2 -> System.out.println(day + " is Monday");
//            case 3 -> System.out.println(day + " is Tuesday");
//            case 4 -> System.out.println(day + " is Wednesday");
//            case 5 -> System.out.println(day + " is Thursday");
//            case 6 -> System.out.println(day + " is Friday");
//            case 7 -> System.out.println(day + " is Saturday");
//            default -> System.out.println(day + " is Invalid day");
//        }
//    }


    public static void printDayOfWeek (int day){

        String dayOfWeek = switch (day){
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println( day + " is " + dayOfWeek);
    }
}
