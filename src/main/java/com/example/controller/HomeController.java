package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

//어노테이션 아래는 컨트롤로 인식한다.
@Controller
public class HomeController {
    // 127.0.0.1:8080/home
    @GetMapping(value = "/home")
    public String homeGET() {
        // home.jsp를 표시하기

        return "home";
    }
    // @GetMapping(value = "/home")
    // public @ResponseBody String homeGET() {
    // // home.jsp를 표시하기
    // return "home";
    // }

    // 127.0.0.1:8080/join
    @GetMapping(value = "/join")
    public String joinGET() {
        // join.jsp 표시하기
        return "join";
    }

    @GetMapping(value = "/login")
    public String loginGET() {
        // join.jsp 표시하기
        return "login";
    }

    @GetMapping(value = "/board")
    public String boardGET() {
        // join.jsp 표시하기
        return "board";
    }
}
