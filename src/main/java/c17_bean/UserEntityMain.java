package c17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntityLombok user1 = new UserEntityLombok();
        /*
            username에 abcdef
            password 1234
            email a@test.com
            name 자기이름

            콘솔에 출력해보세요.
         */
        user1.setUsername("adbasd");
        System.out.println(user1.getUsername() );
        user1.setPassword("1234");
        user1.setEmail("a@test.com");
        user1.setName("황현덕");
    }
}
