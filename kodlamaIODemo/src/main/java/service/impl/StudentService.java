package service.impl;

import service.IStudentService;

public class StudentService implements IStudentService {
    @Override
    public void getStudent(long id) {
        System.out.println(id + "\tnolu öğrenci getirildi.");
    }
}
