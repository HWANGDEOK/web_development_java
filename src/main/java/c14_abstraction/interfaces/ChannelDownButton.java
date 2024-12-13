package c14_abstraction.interfaces;

public class ChannelDownButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 내립니다.");
    }
    @Override
    public void onUP() {
        System.out.println("채널을 계속 내립니다.");
    }
}
