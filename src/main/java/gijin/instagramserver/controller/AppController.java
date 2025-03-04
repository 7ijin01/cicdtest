package gijin.instagramserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController
{
    @GetMapping("/")
    public String home()
    {
        return "Hello GiJin World test!!!!!! \n 2025-03-04 확인 완료";
    }
}
