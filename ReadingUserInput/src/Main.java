//String getInputFromConsole (int currentYear){
//    return "";
//}

String getInputFromScanner(int currentYear) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Hi, What's your Name? ");
    String name = teclado.nextLine();

    System.out.println("Hi " + name + ", Thanks for taking the course!");

    System.out.println("What year were you born? ");
    String dateOfBirth = teclado.nextLine();

    int age= currentYear - Integer.parseInt(dateOfBirth);


    return "So you are " + age + " years old";
}

void main() {

    int currentYear = 2022;
    System.out.println(getInputFromScanner(currentYear));
}


