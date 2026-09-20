public class DigitSumChallenge {

    public static void main (String[] args){

        System.out.println(sumDigits(1));
    }

    public static int sumDigits(int number){

        if (number <0){
            return -1;
        }

        int soma = 0;

        while (number>0){

            int resto = number %10;

            soma += resto;

            number/=10;
        }
        return soma;
    }
}
