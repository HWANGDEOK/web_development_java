package c08_method;

public class Overloading {
    /*
        method overloading
        매개변수의 형태가 다르면 동일한 메서드 명을 가지고 정의할 수 있다. -> return 타입 고정

        즉, 메서드 명은 동일하고, parameter 에 들어가는 자료형 및 변수명이 다름을 의미
     */

    // call1() 타입의 method 정의
    public static void add() {
        System.out.println("add()");
    }

    // call2() 타입의 method 정의 -> 메서드 명은 동일하게 가져가야 overloading에 해당
    public static void add(String s){
        System.out.println("add(String s)");
    }
    public static void add(int a, int b){
        System.out.println("add(int a, int b)");
        System.out.println("a + b = " + (a+b));
    }

    public static void add(String s, int a){
        System.out.println("add(String s, int b)");
    }

    public static void add(int a, String s){
        System.out.println("int a, String s)");
        System.out.println(a+" "+s);
    }

    public static void main(String[] args){
        add();
        add("String을 사용한 call2() 타입의 add(String s)입니다.");
        add(1,2);
        add("안녕",10);
        add(20,"잘가");
    }
}
