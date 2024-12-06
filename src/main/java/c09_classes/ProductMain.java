package c09_classes;

public class ProductMain {
    public static void main(String[] args) {
        // 1번 지시 사항 - 기본생성자 사용
        Product product1 = new Product();
        // 기본 생성자를 사용했다는 말은 객체 생성 시 속성에 아무런 값을 대입하지 않았다는 의미이므로
        // 추가적인 코드 작성을 통해 석속값을 대입해야만 함.
        product1.productNum = 1564;
        product1.productName = "LG제이패드";

        Product product2 = new Product(898798);
        product2.productName = "GS충전기";

        Product product3 = new Product("피치패드");
        product3.productNum = 48648;

        Product product4 = new Product(48489, "블루미플립6");

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();
    }
}
