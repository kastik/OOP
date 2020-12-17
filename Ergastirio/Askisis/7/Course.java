package Askisi_1;
abstract class Course {
    String courseName;
    Course(String courseName){
        this.courseName=courseName;
    }
    abstract float TelikosVathmos();
}
