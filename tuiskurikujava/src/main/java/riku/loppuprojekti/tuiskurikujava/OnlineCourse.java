package riku.loppuprojekti.tuiskurikujava;
import java.util.List;

public class OnlineCourse extends Course{
    private String websiteAddress;

    public OnlineCourse(String websiteAddress, String courseName, String teacherName, List<Student> studentList) {
        super(courseName, teacherName, studentList);
        this.websiteAddress = websiteAddress;
    }

    public String getWebsiteAddress() { return this.websiteAddress; }
    public void setWebsiteAddress(String websiteAddress) { this.websiteAddress = websiteAddress; }

    @Override
    public String toString() {
        return "OnlineCourse="+this.getCourseName() + " "+ "TeacherName="+this.getTeacherName() + " "+this.getWebsiteAddress();
    }
}
