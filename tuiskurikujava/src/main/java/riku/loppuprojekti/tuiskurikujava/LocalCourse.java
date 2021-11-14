package riku.loppuprojekti.tuiskurikujava;

import java.util.ArrayList;
import java.util.List;

public class LocalCourse extends Course {
    private String classRoom;

    public LocalCourse(String classRoom,String courseName, String teacherName, List<Student> studentList) {
        super(courseName, teacherName, studentList);
        this.classRoom = classRoom;
    }

    public String getClassRoom() { return this.classRoom; }
    public void setClassRoom(String classRoom) { this.classRoom = classRoom; }

    @Override
    public boolean addStudent(Student Student){
        List<Student> students = new ArrayList<Student>();

        if(students.size() >= 25){
        return false;
        }
        else{
            students.add(Student);
            super.setStudentList(students);
            return true;
        }
        
    }

    @Override
    public String toString() {
        return "LocalCourse="+this.getCourseName() + "-" + "TeacherName="+this.getTeacherName() + "-" +"Classroom"+this.getClassRoom();
    }
}

