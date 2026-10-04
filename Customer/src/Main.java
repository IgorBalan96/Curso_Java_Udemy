void main (){

    Customer tim = new Customer("Tim", 3000, "Tim@email.com");

    System.out.println("name " + tim.getName() + " credit Limit " + tim.getCreditLimit() + " email " + tim.getEmail());

    Customer bob = new Customer ();
    System.out.println("name " + bob.getName() + " credit Limit " + bob.getCreditLimit() + " email " + bob.getEmail());

    Customer jon = new Customer ("jon", "jon@email");
    System.out.println("name " + jon.getName() + " credit Limit " + jon.getCreditLimit() + " email " + jon.getEmail());
} 