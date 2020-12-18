package day42_Inheritance.animalTask;

public class Eagle extends Animal{

    public Eagle(String name, String breed, char gender, int age, String color, String size){
        setInfo(name, breed,gender,age,color,size);
    }

    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
