package c16_object_classes;
/*
    모든 클래스는 Object 클래스를 상속 받는다. -> 우리가 정의한 것 말고 기존에 있는 class들을 의미

 */
public class ObjectTest extends  Object{
    private String name;
    private String address;

    // NoArgconstructor 정의
    public ObjectTest() {}

    // AllArgsConstructor 정의
    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }
    // Setter / Getter 정의
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    // displayInfo() 정의
    public void displayInfo(){
        System.out.println("이름 : " + getName() + "\n주소 : " + getAddress());
    }

    // showInfo()를 정의하는 sout말고 return 형으로 작성한 후, main에서 콘솔에 출력
    public String showInfo(){
        // 여기에 이렇게 쓰고 -> ObjectTestMain으로 이동
        return "이름 : " + name + "\n주소 : "+address;
    }

    // 즉 기본적으로 toString()이라는 메서드는 어떤 특정한 클래스의 안스턴스를 전부 다 String형태로 바꿔주는 것을 의미하며, 이느
    // Object 클래스의 메서드를 Override 했음을 확인할 수 있음.
    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;
    }
}
