package c_19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
//@Data
@ToString
public
class ResponseData<T> {
    private String message;
    private T data;

    // 제네릭을 적용하기 위해서는 클래스명 옆에 <T>를 명시함

    // 이후 DataController.java로 이동
}
