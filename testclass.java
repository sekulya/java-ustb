package test;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

class Course{
    private String courseName;
    private int courseHour;
    OutputStream out =System.out;

    Course(String courseName, int courseHour) {
        this.courseName = courseName;
        this.courseHour = courseHour;
    }
    Course(){}

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(int courseHour) {
        this.courseHour = courseHour;
    }
    public void show() throws IOException {
        String str = this.courseName+"\t"+this.courseHour+"分\n";
        out.write(str.getBytes("utf8"));
        //System.out.println(str);
    }
}

class Student{
    private String name;
    private int grade;
    Course []course;
    OutputStream out =System.out;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    Student(){}

    public String getName() {
        return name;
    }

    public void setCourse(Course[] course){
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getHourse(){
        int sum = 0;
        for(int i=0;i<course.length;i++){
            sum += course[i].getCourseHour();
        }
        return sum;
    }
    public void showMessage() throws IOException {
        String str1 = this.name+" "+this.grade+"年级\n";
        String str2 = "选修的课程包括:\n";
        out.write(str1.getBytes("utf8"));
        out.write(str2.getBytes("utf8"));
        //System.out.println(str1);
        //System.out.println(str2);
        for(int i=0;i<course.length;i++){
            String str4 = "("+(i+1)+")";
            out.write(str4.getBytes("utf8"));
            course[i].show();
        }
        String str3 = "总学分:"+this.getHourse()+"\n";
        out.write(str3.getBytes("utf8"));
        //System.out.println(str3);
    }
}

public class TestClass {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n;
        n = scn.nextInt();
        Student stu[] = new Student[n];
        OutputStream out = System.out;
        int coursen = 0;
        for(int i = 0;i<n;i++){
            stu[i] = new Student();
            stu[i].setName(scn.next());
            stu[i].setGrade(scn.nextInt());
            coursen = scn.nextInt();
            Course course[] = new Course[coursen];
            for(int j = 0;j<coursen;j++){
                course[j] = new Course();
                course[j].setCourseName(scn.next());
                course[j].setCourseHour(scn.nextInt());
            }
            stu[i].setCourse(course);
        }

        for(int i = 0;i<stu.length;i++){
            String str = "第"+(i+1)+"学生信息如下:\n";
            out.write(str.getBytes("utf8"));
           // System.out.println(str);
            stu[i].showMessage();
        }
    }
}


