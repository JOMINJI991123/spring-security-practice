package com.example.SecurityTest.controller;

import com.example.SecurityTest.dto.JoinDTO;
import com.example.SecurityTest.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {

    @Autowired
    private JoinService joinService;

    @GetMapping("/join")
    public String join(){
        return "join";
    }

    @PostMapping("/joinProc")
    public String joinProcess(JoinDTO joinDTO){
        joinService.joinProcess(joinDTO);

        return "redirect:/login";
    }


}
