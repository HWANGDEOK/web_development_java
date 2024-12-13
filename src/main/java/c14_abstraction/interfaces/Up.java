package c14_abstraction.interfaces;

public interface Up {
    // public void onUP();      -> 추상 메서드 쓸 때 이런 식으로 했었는데, 인터페이스에서는 상관없음
                                // interface에서의 method들은 전부 자동으로 public

    // 추상 메서드 선언
    void onUP();
}
