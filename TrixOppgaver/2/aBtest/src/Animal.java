class Animal{
    public void makeSound(){
        System.out.println("This is an animal sound");
    }
}
class Pig extends Animal{
    public void makeSound(){
        System.out.println("hoink hoink");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("woof woof");
    }
}
class Main{
    public static void main(String[] args){
        Animal animal = new Animal();
        Animal pig = new Pig();
        Animal dog = new Dog();
        animal.makeSound();
        pig.makeSound();
        dog.makeSound();
    }
}