package c17_bean;

import lombok.Data;

@Data
/*
    정보를 담는 객체를 Entity Class라고 함.
    필드 -> 명사
    메서드 -> 동사로 짓는 편
 */
public class UserEntity {
    private String username;
    private String password;
    private String email;
    private String name;

}
