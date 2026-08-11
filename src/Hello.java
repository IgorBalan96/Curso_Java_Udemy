public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Igor");

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore < 90) {
            System.out.println("O ou funciona");
        }

        int novoValor = 50;
        if (novoValor == 50) {
            System.out.println("Isto é verdadeiro");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("Isto nao é suposto acontecer");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar != "Volkswagen");
       // boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is imported";

        System.out.println(s);


        //        int idade = 20;
//        String estatuto = (idade >=18) ? "Maior de idade" : "Menor de idade";
//        System.out.println(estatuto);

        //boolean isDomestic = (makeOfCar != "Volkswagen");


    }
}
