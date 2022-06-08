package kr.co.clozet.json;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName:kr.co.clozet.json
 * fileName        :DummyControllerTest.java
 * author          : sungsuhan
 * date            :2022-06-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-08           sungsuhan      최초 생성
 **/
@RestController
public class DummyControllerTest {
    @PostMapping("/dummy")
    public String join(String userId, String username, String password, String name, String birth, String nickname, String email, String phone) {
        System.out.println(userId);
        System.out.println(username);
        System.out.println(password);
        System.out.println(name);
        System.out.println(birth);
        System.out.println(nickname);
        System.out.println(email);
        System.out.println(phone);
        return "회원가입 완료";
    }


}
