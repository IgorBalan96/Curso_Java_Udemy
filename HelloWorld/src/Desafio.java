public class Desafio {
    public static void main (String[] args) {

    double firstVariable = 20.00d;
    double secondVariable = 80.00d;
    double resultado = (firstVariable + secondVariable) * 100.00d;
    double resto = resultado % 40.00d;

    boolean temRestoTeste = (resto == 0.00) ? true : false;
    System.out.println(temRestoTeste);

    if(!temRestoTeste){
        System.out.println("got some remainder");
    }

    }
}
