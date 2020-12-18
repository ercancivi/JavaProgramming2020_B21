package day42_Inheritance.animalTask;

public class Fish extends Animal{

    public Fish (String name, String breed, char gender, int age, String color, String size) {
        setInfo(name, breed, gender, age, color,size);
    }

    public void swim() {
        System.out.println(name + " is swimming");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
