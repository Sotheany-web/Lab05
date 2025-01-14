/**
 * Class: Session
 * Description: Represents study sessions of the day.
 * This class demonstrates proper naming conventions, limited global variables,
 * and exception handling for session duration.
 */
class Session {

    // Attributes
    private int startTime;
    private int endTime;

    // Constructor
    public Session(int startTime, int endTime) {
        setDuration(startTime, endTime);
    }

    // Getter for start time
    public int getStartTime() {
        return startTime;
    }

    // Getter for end time
    public int getEndTime() {
        return endTime;
    }

    // Method to set duration with exception handling
    public void setDuration(int startTime, int endTime) {
        if (startTime >= endTime) {
            throw new IllegalArgumentException("Start time must be less than end time.");
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage of Subject class
        try {
            Subject subject = new Subject("Mathematics", 4.0);
            System.out.println("Subject Name: " + subject.getName());
            System.out.println("Credit Hours: " + subject.getCreditHours());
            subject.setName("Physics");
            System.out.println("Updated Subject Name: " + subject.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Example usage of Session class
        try {
            Session session = new Session(10, 12);
            System.out.println("Session Start Time: " + session.getStartTime());
            System.out.println("Session End Time: " + session.getEndTime());
            session.setDuration(13, 14);
            System.out.println("Updated Session Start Time: " + session.getStartTime());
            System.out.println("Updated Session End Time: " + session.getEndTime());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
