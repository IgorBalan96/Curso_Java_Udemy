final int CURRENT_YEAR = 2026;
final int MAX_YEAR = 125;
final int INVALID_AGE = -1;

int checkData( String dateOfBirth){
    int dob = Integer.parseInt(dateOfBirth);
    int minimumYear = CURRENT_YEAR - MAX_YEAR;

    if (dob < minimumYear || dob > CURRENT_YEAR){
        return INVALID_AGE;
    }
    return(CURRENT_YEAR-dob);

}


String getInputFromScanner() {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Hi, What's your Name? ");
    String name = teclado.nextLine();

    System.out.println("Hi " + name + ", Thanks for taking the course!");

    //System.out.println("What year were you born? ");

    boolean validDOB = false;
    int age = 0;

    do{
        System.out.println("Enter a year of birth >= " + (CURRENT_YEAR - MAX_YEAR) + " and <= " + CURRENT_YEAR);
        try {
            age = checkData( teclado.nextLine());
            validDOB = (age != INVALID_AGE);
        }catch (NumberFormatException badUserData){
            System.out.println("Characters not allowerd!! Try again.");
        }
    }while (!validDOB);


    return "So you are " + age + " years old";
}



void main() {


    System.out.println(getInputFromScanner());
}


