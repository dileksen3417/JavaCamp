package core;

import entity.Course;
import service.ICourseService;
import service.impl.CourseServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Course course1 = new Course(
                1, "Yazılım Geliştirici Yetiştirme Kampı C# + Angular", "Sektörün yükseklerine", "Engin Demiroğ");
        Course course2 = new Course(
                2, "Yazılım Geliştirici Yetiştirme Kampı Java + React", "Sektörün en yükseklerine", "Engin Demiroğ");

        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);

        for (Course course : courses) {
            System.out.println("Kurs id: " + course.getId());
            System.out.println("Kurs adı: " + course.getCourseName());
            System.out.println("Kurs eğitmeni: " + course.getInstructorName());
        }

        CourseServiceImpl courseService = new CourseServiceImpl();
        courseService.getCourses();

    }
}
