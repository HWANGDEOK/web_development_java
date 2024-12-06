package c10_getter_setter;

import java.util.Scanner;

public class Person {
    String name;
    int age;

    // 기본 생성자, 매개변수 생성자들 전부 만들어보세요.
    // PersonMain.java에서 해당 객체들을 만드세요
    // Person person1 = new Person();
    // Person person2 = new Person("여러분이름");
    // Person person3 = new Person(-100);
    // Person person4 = new Person("사실 나는 사람이 아니다",1000);

    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(int age) {
        this.age = age;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter 및 Getter 정의
    // set변수명() / get변수명()으로 사용한 편

    // 1. 외부에서 필드에 직접 접근을 하지 못하도록 접근 지정자를 설정함

    // 2. Setter의 구조
    //      메서드에 매개변수가 필수적으로 요구됨 -> 값을 변경하거나 대입할 argument가 필요하기 때문
    //      그리고 return값이 없음 -> void
    public void setName(String newName){
        this.name = newName;
    }

    // 3. Getter의 구조
    //      데이터를 조회만 하면 되기 때문에 매개변수가 요구되지 않음. 즉 () 형태로 마무리됨.
    //      대신 필드와 동일한 자료형의 return 값이 요구됨 -> void가 아니다.
    public String getName() {
        return name;
    }

    public void setAge(int newAge){
        // method이기 때문에 {} 내부에 코드를 작성할 수 있음.
        // -> 이를 통해 데이터 유효성 검증을 위한 부분을 추가할 수 있음.
        // 조건문을 적용을 해서 0이상의 값만 입력이 가능하게끔 코드를 작성하면 됩니다.
        // 150 미만의 값만 입력되게끔 코드를 추가
//        if(newAge<0){
//            this.age = -1;
//        }else{if(newAge>150){
//            this.age = -1;
//            }else{
//            this.age = newAge;
//            }
//        }

        // 중첩 if문을 줄이기 위한 && 연산자 사용 -> 여기에 while문을 붙여서 올바른 값만 반복하게끔 코드를 작성
        Scanner sc = new Scanner(System.in);
        while(newAge<0 || newAge>149){
                System.out.print("다시 입력하세요 : ");
                newAge = sc.nextInt();      // argument로 age를 받았지만, 값이 적절하지 않기 때문에 재입력을 받아서
                                            // age에 '재'대입하는 과정이 필요
        }
        this.age = newAge;
        System.out.println("나이가 정상적으로 업데이트 되었습니다.");
    }

    public int getAge(){
        return age;
    }
}
