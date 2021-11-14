package riku.loppuprojekti.tuiskurikujava;

import java.util.List;

public interface ICourseService  {
    //Get list of students
    List<Student> getStudentList();

    //Get list of courses
    List<Course> getCourseList();

    //Gets student by ID. Returns null if student is not found.
    Student getStudentById(long studentId);

    //Gets course by ID. Returns null if course is not found.
    Course getCourseById(long courseId);

    //Gets list of courses that the student is registered in
    List<Course> getCoursesOfStudent(long studentId);

    //Registers the student in the course
    //@Return true if the registration was successful
    boolean addStudentToCourse(long studentId, long courseId);

}
