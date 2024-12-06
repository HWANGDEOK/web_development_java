package c09_classes;
/*
    여러가지 생성자를 정의하세요
    기본 생성자
    매개변수 생성자

    showInfo()
    실행 예

    1. 기본 생성자 사용

    "해당 제품의 시리얼 넘버는 1564이고,
    제품명은 LG제이패드입니다.

    2. 시리얼넘버 사용한 객체 생성

    해당 제품의 시리얼 넘버는 898798이고,
    제품명은 GS충전기입니다.

    3. 제품명을 사용한 객체 생성

    해당 제품의 시리얼넘버는 48648이고,
    제품명은 피치패드입니다.

    4. 시리얼넘버 및 제품명을 사용한 객체 생성

    해당 제품의 시리얼넘버는 48648이고,
    제품명은 블루미플립6입니다.

    ProdcutMain.java를 생성하고, 객체 생성한 다음
 */
public class Product {
    //필드 선언
    int productNum;
    String productName;

    Product() {
    }

    Product(int productNum) {
        this.productNum = productNum;
    }

    Product(String productName) {
        this.productName = productName;
    }


    Product(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }
    void showInfo(){
        System.out.println("해당 제품의 시리얼넘버는"+ productNum+"이고\n 제품명은"+ productName+"입니다.");
    }
}
