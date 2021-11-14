package riku.loppuprojekti.tuiskurikujava;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    CourseService CoursesService;
    
    @GetMapping("students")
    public List<Student> getstudents() {
        return CoursesService.getStudentList();
    }

    @GetMapping("courses")
    public List<Course> getcourses() {
        return CoursesService.getCourseList();
    }

    @GetMapping("onlineCourses")
    public List<Course> getOnlinecourses() {
        return CoursesService.getCourseList();
    }
    // @GetMapping("students/{id}")
    // }

    // @GetMapping("courses/{id}")
    // {  
    // }

    // @PostMapping("add")
    // {    
    // }
   
    

}
