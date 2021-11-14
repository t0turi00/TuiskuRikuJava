package riku.loppuprojekti.tuiskurikujava;

public class Student {
    private static long studentId = 0;
    private long id;
    private String firstName;
    private String lastName;

    public Student(){
        this("", "");
    }

    public Student(String firstName, String lastName) {
        this.id = studentId++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() { return this.id; }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    @Override
    public String toString() {
        return "LastName="+this.getLastName() + " " + "FirstName="+this.getLastName();
    }

}
