package riku.loppuprojekti.tuiskurikujava;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CourseService implements ICourseService{
	public List<Student> allStudents = new ArrayList<>();
    public List<Course> allCourses = new ArrayList<>();
     


    //Get list of students
    public List<Student> getStudentList(){
	  return this.allStudents;
	}

    //Get list of courses
    public List<Course> getCourseList(){
		return this.allCourses;

	}

    //Gets student by ID. Returns null if student is not found.
    public Student getStudentById(long studentId){
		List<Student> idStudentFound = new ArrayList<Student>();

        for(Student Student : this.allStudents) {
        if(Student.getId() == studentId) 
        {
            idStudentFound.add(Student);
        }
		else{
			idStudentFound.add(null);
		}
		
	}
	    return idStudentFound.get(0);

	}

    //Gets course by ID. Returns null if course is not found.
    public Course getCourseById(long courseId){
		List<Course> idCourseFound = new ArrayList<Course>();

        for(Course Course : this.allCourses) {
        if(Course.getId() == courseId) 
        {
            idCourseFound.add(Course);
        }
		else{
			idCourseFound.add(null);
		}
		
	}
	    return idCourseFound.get(0);

	}
    //Gets a list of online courses 
	public String getOnlineCourses(){
		List<String> idOnlineCourseFound = new ArrayList<String>();

        for(Course Course : getCourseList()) {
        if(Course instanceof OnlineCourse)  { idOnlineCourseFound.add(Course.getCourseName());}	
	    }
	      return String.join("<br>", idOnlineCourseFound);
        }

    //Gets list of courses that the student is registered in
    public List<Course> getCoursesOfStudent(long studentId){
		List<Course> courseFound = new ArrayList<Course>();

        for(Course course : this.allCourses) {
           for(Student student : course.getStudentList()){
			   if(student.getId() == studentId){
				   courseFound.add(course);
			   }
		   } 
	     }
	          return courseFound;
	 }
    //Registers the student in the course
    //@Return true if the registration was successful
    public boolean addStudentToCourse(long studentId, long courseId){
		
		return this.getCourseById(courseId).addStudent(this.getStudentById(studentId));
		
	}
}

