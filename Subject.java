/**
 * Class: Subject
 * Description: Represents courses in Year 2 program.
 * This class demonstrates limited use of global variables, proper naming
 * conventions, and exception handling.
 */
public class Subject {

    // Constant
    private static final double DEFAULT_CREDIT_HOURS = 3.0;

    // Attributes
    private String name;
    private double creditHours;

    // Constructor
    public Subject(String name, double creditHours) {
        setName(name);
        this.creditHours = creditHours > 0 ? creditHours : DEFAULT_CREDIT_HOURS;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with exception handling
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    // Getter for credit hours
    public double getCreditHours() {
        return creditHours;
    }
}
