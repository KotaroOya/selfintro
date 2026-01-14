package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 「これはWebの窓口担当です」という目印
public class HelloController {

    @GetMapping("/profile/tamakei")
    public String home(){
    	return "index";
    	
    	// ブラウザで /hello にアクセスした時
   
    }
}

