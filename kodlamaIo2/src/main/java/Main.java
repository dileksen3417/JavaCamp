public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setFirstName("Dilek");
        student.setLastName("Şen");
        student.setUserName("dsen");
        student.setAddress("İstanbul");
        student.setIdentityNumber("005562");
        student.setProgressScore(95);

        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setUserName("edemirog");
        instructor.setAddress("Ankara");
        instructor.setIdentityNumber("000100");
        instructor.setScore(98);

        UserManager userManager = new StudentManager();
        userManager.login(student);
        userManager.logout(student);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.login(instructor);
        instructorManager.createLesson();
    }
}
