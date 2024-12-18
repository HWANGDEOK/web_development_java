package c20_colletions.students;

import java.util.ArrayList;
import java.util.List;

/*

 */
public class StudentList {
    public static void main(String[] args) {

        // 비어있는 List 선언
        List<Student> students = new ArrayList<>();

        // 20240001 강미경
        // 20240002 강준석
        // 20240003 김은수
        // 20240004 박경호
        // 20240005 박수빈
        // 을 추가하세요.
        students.add(new Student(20240001,"강미경"));
        students.add(new Student(20240002,"강준석"));
        students.add(new Student(20240003,"김은수"));
        students.add(new Student(20240004,"박경호"));
        students.add(new Student(20240005,"박수빈"));
        // 추가 후에 전체 리스트를 출력하세요.
        for(int i=0; i<students.size(); i++){
            System.out.println(students.get(i).getId() + " " + students.get(i).getName());
        }

    }
}
