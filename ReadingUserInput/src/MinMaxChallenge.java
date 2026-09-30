import java.util.Scanner;

//constantes
final String MAX_NUM = "O Maior numero é: ";
final String MIN_NUM = "O Menor numero é: ";
final String NO_DATA = "Sem dados!";
final String EXIT_MSG = "Saiu do programa.";
final String INSERT_MSG ="Introduza um numero, ou qualquer character para sair.";


//variaveis globais
int maxNum;
int minNum;
boolean temDados = false;

//variaveis de dominio
void initState (int inicio){
    maxNum = inicio;
    minNum= inicio;
    temDados = true;
}

void alterarValorMinMax (int numero) {
    if (!temDados){
        initState(numero);
    }else {
        if (numero < minNum)
            minNum = numero;
        if (numero > maxNum)
            maxNum = numero;
    }
}

//variaveis de interacao

int readIntLn(Scanner in){
    int value = in.nextInt();
    in.nextLine();
    return value;
}

void handleCenario(Scanner in){

    while (true) {
        System.out.println(INSERT_MSG);
        String nextEntry = in.nextLine();
        try {
            int value = Integer.parseInt(nextEntry);
            alterarValorMinMax(value);
        }catch (NumberFormatException nfe){
            break;
        }

    }
    System.out.println(EXIT_MSG);

    if (temDados) {
        System.out.println(MIN_NUM + minNum);
        System.out.println(MAX_NUM + maxNum);
    }else{
        System.out.println(NO_DATA);
    }
}

 /*void handleCenario (Scanner in){

    System.out.println(FIRST_NUM);

    if (in.hasNextInt()) {
        int primeiroNumero = readIntLn(in);
        initState(primeiroNumero);
    } else {
        in.nextLine();
        System.out.println(NO_DATA);
    }


    int value = 0;
    do {
        System.out.println(NEXT_NUM);
        if (in.hasNextInt()) {
            value = readIntLn(in);
            alterarValorMinMax(value);

        } else {
            in.nextLine();
            System.out.println(NO_DATA);
            break;
        }

    }while (value != EXIT_NUM);

    System.out.println(EXIT_MSG);
    System.out.println(MIN_NUM + minNum);
    System.out.println(MAX_NUM + maxNum);
} */

void main () {
    Scanner input = new Scanner(System.in);
    handleCenario(input);
    input.close();
}