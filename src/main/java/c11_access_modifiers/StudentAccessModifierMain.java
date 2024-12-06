package c11_access_modifiers;

public class StudentAccessModifierMain {
    public static void main(String[] args) {
        StudentAccessModifier studentAccessModifier = new StudentAccessModifier();
        studentAccessModifier.setStudentCode(20241205);
        studentAccessModifier.setStudentName("황현덕");
        studentAccessModifier.setStudentAvg(100.0);

        // showInfo() 메서드를 통해 객체 정보를 출력
        studentAccessModifier.showInfo();

        // 새로운 객체를 student01로 생성하는데, 생성 시에 이름을 "여러분이름" 으로 만들어주세요.
        // 점수는 4.5. 학번은 10101
        StudentAccessModifier student01 = new StudentAccessModifier(10101,"황현덕",4.5);
        // 여러분의 이름을 "이일'로 고치세요.
        student01.setStudentName("이일");
        // 고친 이름을 콘솔창에서 확인하기 위해 getter를 사용하세요
        System.out.println(student01.getStudentName());
        // 이름이 "이일"로 고쳐졌다면, showInfo()를 통해 전체 정보를 콘솔에 출력하세요
        student01.showInfo();

        // 다 하신 분들은 새로운 패키지를 만들어주세요 -> c12_arrays -> class ArrayTest01 로 만들기
    }
}
