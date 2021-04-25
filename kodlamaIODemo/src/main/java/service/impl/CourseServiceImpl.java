package service.impl;

import entity.Course;
import entity.Student;
import service.ICourseService;

import java.util.List;

public class CourseServiceImpl implements ICourseService {
    @Override
    public void getCourses() {
        System.out.println("Kurslar listelendi.");
    }
}
