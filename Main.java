// Define a class for Eyeglass
class Eyeglass {
    private String color;

    // Constructor
    public Eyeglass(String color) {
        this.color = color;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }
}

// Define a class for Person
class Person {
    private String name;
    private Eyeglass eyeglass;

    // Constructor
    public Person(String name, Eyeglass eyeglass) {
        this.name = name;
        this.eyeglass = eyeglass;
    }

    // Method to get person's name
    public String getName() {
        return name;
    }

    // Method to get eyeglass color
    public String getEyeglassColor() {
        return eyeglass.getColor();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Eyeglass object with black color
        Eyeglass lanskartEyeglass = new Eyeglass("black");

        // Create a Person named Tarun with the Eyeglass
        Person tarun = new Person("Tarun", lanskartEyeglass);

        // Display Tarun's information
        System.out.println("Person: " + tarun.getName());
        System.out.println("Eyeglass Color: " + tarun.getEyeglassColor());
    }
}

