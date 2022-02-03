package CarClass;

public class Driver{
    public String name;
    public int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;

    }



    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
