package com.in28minutes.oops.level2;

public class Student extends Person{
    
    private String college;
    private String studentClass;
    
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public String getStudentClass() {
        return studentClass;
    }
    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

//    public Student(String name, String phone, String email, String college, String studentClass) {
//        super();
//        this.college = college;
//        this.studentClass = studentClass;
//    }

}
