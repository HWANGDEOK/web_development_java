package c14_abstraction.interfaces;

public class ChannelUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다.");
    }

    @Override
    public void onUP() {
        System.out.println("채널을 계속 올립니다.");
    }

    // ChannelDownButton.java 클래스를 생성하시고, inPressed()와 onDown()을 재정의 하시오
}
