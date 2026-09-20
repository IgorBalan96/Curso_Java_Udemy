public class WhileLoopChallenge {

    public static void main (String [] args){

         int i = 5;
         int pares =0;
         int impares = 0;
         while( i <= 20){

             if (!isEvenNumber(i)){
                 impares++;
                 i++;
                 continue;
             }

             System.out.println("O numero é par: " + i);
             pares++;

             if (pares >=5){
                 break;
             }
             i++;
         }

         System.out.println("O numero de pares é: " + pares);
         System.out.println ("O numero de impares é: "+ impares);
    }

    public static boolean isEvenNumber (int number){
        return number % 2 == 0;
    }
}
