package domain;

public class Course {
    private long id;
    private String courseName;
    private String courseDescription;
    private String instructorName;

    public Course() {
        //default ctor
    }

    public Course(long id, String courseName, String courseDescription, String instructorName) {
        this.id = id;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.instructorName = instructorName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
