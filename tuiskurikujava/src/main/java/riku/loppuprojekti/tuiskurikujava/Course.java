package riku.loppuprojekti.tuiskurikujava;

import java.util.ArrayList;
import java.util.List;

   abstract public class  Course {
    private static long courseId = 0;
    private long id;
    protected String courseName;
    protected String teacherName;
    private List<Student> studentList = new ArrayList<Student>();


    public Course(String courseName, String teacherName, List<Student> studentList) {
        this.id = courseId++;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.studentList = studentList;
    }

    public long getId() { return this.id; }
    public String getCourseName() { return this.courseName; }
    public String getTeacherName() { return this.teacherName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public void setTeacherName(String teacherName) { this.teacherName = teacherName; }

    public List<Student> getStudentList() {
        return new ArrayList<Student>(this.studentList);
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    
    public boolean addStudent(Student Student) {
        this.studentList.add(Student);
        return true;
    }
    public void removeStudent(Student Student){
        this.studentList.remove(Student);
    }

}