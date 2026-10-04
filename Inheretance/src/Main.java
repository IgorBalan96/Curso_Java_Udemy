
void doAnimalStuff (Animal animal, String speed){

    animal.makeNoise();
    animal.move(speed);
    System.out.println(animal);
    System.out.println("______");

}


void main (){

    Animal animal = new Animal ("Generica Animal", "huge", 400);
    doAnimalStuff(animal, "slow");

    Dog dog =new Dog();
    doAnimalStuff(dog, "fast");

}