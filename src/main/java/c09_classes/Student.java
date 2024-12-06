package c09_classes;


/*
    학번, 이름, 점수(ABCDF) field 를 선언
    기본 생성자
    학번을 매개변수로 하는 생성자
    이름을 매개변수로 하는 생성자
    점수를 매개변수로 하는 생성자
    학번, 이름, 점수를 매개변수로 하는 생성자

    showInfo() 메서드를 정의
    학번 : 12345
    이름 : 이일
    점수 : A등급
 */
public class Student {

    int id;
    String name;
    String grade;

    Student(){
    }

    Student(int studentId){
        this.id = studentId;
    }

    Student(String studentName){
        this.name = studentName;
    }

    Student(int studentId, String studentName, String studentGrade){
        this.id = studentId;
        this.name = studentName;
        this.grade = studentGrade;
    }
    void showInfo(){
        System.out.println("학번 : "+id+"\n이름 : "+name+"\n점수 : "+grade+"등급");
    }
}
