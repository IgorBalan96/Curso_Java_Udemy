public class SecondsAndMinutes {


    public static void main (String [] args) {
    int segundos = 4000;

    System.out.println(getDurationString(3945));
    System.out.println(getDurationString(65,45));
    }

    public static String getDurationString (int seconds){
        //if (seconds >= 0){

//            int horas = seconds / 3600;
//            int restoHoras = seconds % 3600;
//            int minutos = restoHoras / 60;
//            int restanteSegundos = restoHoras % 60;
//
//            return horas + "h " + minutos + "m " + restanteSegundos + "s";


            int minutes = seconds / 60;
            return getDurationString(minutes,seconds);



//        }else
//            return "Invalid numbers!!";

    }

    public static String getDurationString (int minutes, int seconds){

        if (minutes >= 0 && (seconds >= 0 && seconds <=59)){

            int horas = minutes / 60;
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;

            return horas + "h " + remainingMinutes + "m " + remainingSeconds + "s";

        }else
            return "Invalid numbers!!";
    }
}


// XXh YYm ZZs

//1 h = 3600s
//1 h = 60min
// 1 min = 60s

// primeiro parametro segundo >= 0
// segundo parametro minutos >= 0 e segundos entre 0 e 59
