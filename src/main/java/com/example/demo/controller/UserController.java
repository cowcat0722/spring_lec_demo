package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// @RestController // 리턴시에 그 문자를 그대로 응답한다.
@Controller // 리턴시에 파일을 응답한다.
public class UserController {

    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm"; // dispatcher가 리턴받을때 /templates/joinForm.mustache 를 찾아줌
    }

    @PostMapping("/join")
    public String join(String username, String password, String email) {
        // 파라미터에 HttpServletRequest request 해서 아래 코드 적는게 1번
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String email = request.getParameter("email");

        // 파라미터에 바로 username, password, email 적는게 2번

        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("email = " + email);

        if (username.length() > 10) {
            return "error-404";
        }
        return "redirect:/main";
    }
}
