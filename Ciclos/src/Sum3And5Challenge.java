public class Sum3And5Challenge {

    public static void main(String[] args) {

        int i;
        int soma = 0;
        int ciclosVerdadeiros = 0; // vai contar quantas vezes realmente a conção do if é verdade

        for (i = 1; i <= 1000; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
               System.out.println(i);
               soma +=i;
               ciclosVerdadeiros++;
            }
            if (ciclosVerdadeiros ==5){
                break;
            }
        }
        System.out.println("O valor da soma dos numeros é : " + soma);
    }
}
