package service.impl;

import service.ICourseService;

public class CourseServiceImpl implements ICourseService {
    @Override
    public void getCourses() {
        System.out.println("Kurslar listelendi.");
    }
}
