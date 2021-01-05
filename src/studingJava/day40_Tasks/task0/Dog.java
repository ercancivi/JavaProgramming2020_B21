package studingJava.day40_Tasks.task0;

    /*
    Dog:
		variables:
				breed, size, gender, color, numberOfLegs, numberOfEyes, numberOfWings

		add constructor to initialize all fields

		methods:
			toString()
     */

public class Dog {

    public String breed, size, color;
    public char  gender;

    public static int numberOfLegs, numberOfEyes, numberOfWings;

    static {
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings = 0;
    }

    public Dog(String breed, String size, String color, char gender) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }
}
