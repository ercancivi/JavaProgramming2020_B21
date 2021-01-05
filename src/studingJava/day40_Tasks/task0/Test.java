package studingJava.day40_Tasks.task0;

public class Test {

    public static void main(String[] args) {

        Employee employee = new Employee("Jon","123456",24,'M',120000);
        System.out.println("employee.salary = " + employee.salary);
        System.out.println("employee.gender = " + employee.gender);
        System.out.println("employee.SSN = " + employee.SSN);
        System.out.println("employee.age = " + employee.age);
        System.out.println(employee);

        System.out.println("===============================================");

        Item item = new Item("Printer",149.99,2);
        System.out.println("item.name = " + item.name);
        System.out.println("item.unitPrice = " + item.unitPrice);
        System.out.println("item.quantity = " + item.quantity);
        System.out.println("item.totalCost = " + item.totalCost);
        System.out.println(item);

        System.out.println("===============================================");

        Dog dog = new Dog("Kangal","Large", "Smoke", 'M');
        System.out.println("dog.breed = " + dog.breed);
        System.out.println("dog.size = " + dog.size);
        System.out.println("dog.color = " + dog.color);
        System.out.println("dog.gender = " + dog.gender);
        System.out.println(dog);

        System.out.println("===============================================");

        Cat cat = new Cat("Van","Medium","white",'F');
        System.out.println("cat.breed = " + cat.breed);
        System.out.println("cat.size = " + cat.size);
        System.out.println("cat.color = " + cat.color);
        System.out.println("cat.gender = " + cat.gender);
        System.out.println(cat);

        System.out.println("===============================================");

        Iphone iphone = new Iphone("Apple","10","Large",799.99);
        System.out.println("iphone.brand = " + iphone.brand);
        System.out.println("iphone.model = " + iphone.model);
        System.out.println("iphone.size = " + iphone.size);
        System.out.println("iphone.price = " + iphone.price);
        System.out.println(iphone);

        System.out.println("===============================================");

        Circle circle = new Circle(5);
        System.out.println("circle.radius = " + circle.radius);
        System.out.println("circle.diameter = " + circle.diameter);
        System.out.println("circle.perimeter = " + circle.perimeter);
        System.out.println("circle.area = " + circle.area);
        System.out.println(circle);


    }

}
