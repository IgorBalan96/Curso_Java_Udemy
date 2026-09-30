import java.util.Scanner;

final String INV_NUMBER_MSG ="Invalid number";
final String MSG_NUMB = "Enter number #";
final String DOIS_PONTOS = ":";
final String FINAL_SUM = "A Soma dos numeros é: ";
final int MAX_NUMBERS = 5;



//metodos do dominio

double somar(double num1, double num2){
    return num1+num2;
}


//metodos de interacao

double readDoubleLn (Scanner in){
    double value = in.nextDouble();
    in.nextLine();
    return value;
}

void handleCenario (Scanner in){


    int contador = 1;
    double sum = 0;
    do{
        System.out.println( MSG_NUMB+ contador + DOIS_PONTOS);


        if (in.hasNextDouble()){
            double numberInsert = readDoubleLn(in);
            sum = somar(numberInsert,sum);
            contador++;

        } else {
            in.nextLine();
            System.out.println(INV_NUMBER_MSG);
        }

    }while (contador <=MAX_NUMBERS);
    System.out.println(FINAL_SUM + sum);
}


void main (){
 Scanner input = new Scanner(System.in);
 handleCenario(input);
 input.close();
}