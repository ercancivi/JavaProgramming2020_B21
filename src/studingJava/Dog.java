package studingJava;

public class Dog {

    public String breed;
    public String size;
    public int age;
    public String color;


    public void setInfo(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void getInfo() {
        System.out.println("Breed: " + breed + " size: " + size + " age: " + age + " color: " + color);
    }

    public String toPrint() {
        return "Dog{" +"Breed: " + breed + " size: " + size + " age: " + age + " color: " + color + "}";
    }

    public void eat(String food) {
        System.out.println("Dog eats " + food);
    }

    public void drink(String drink) {
        System.out.println("Dog drinks " + drink);
    }

    public void sleep() {

    }

    public void sit() {

    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setInfo("Kangal","Large", 3, "Smoke");
        dog1.getInfo();
        System.out.println("dog1 = " + dog1.toPrint());
    }

}
