package c17_bean;

public class PersonMain {
    public static void main(String[] args) {
        // Person 객체 생성 객체명 person1으로 작명, 이름은 "여러분 이름" 으로 만들기
        Person person1 = new Person("황현덕"); // final 때문에 new Person();으로 생성 불가능

        // PersonLombok 객체 생성
        PersonLombok personLombok1 = new PersonLombok("김이");

        // 이상의 코드에서 확인할 수 있는 것은
        // Person 클래스에서 alt + insert를 통해 하나하나 생성자를 만들었던 것을
        // PersonLombok 클래스에서 두 개의 애너테이션을 통해서 자동으로 생성자를 만들었고,
        // 그 기능이 동일하다는 점
    }
}
