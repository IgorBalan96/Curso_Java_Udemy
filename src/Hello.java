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
        if (novoValor ==50){
            System.out.println("Isto é verdadeiro");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("Isto nao é suposto acontecer");
        }

    }
}
