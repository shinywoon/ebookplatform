package com.example.EbookEc.Cotroller;

import com.example.EbookEc.Entity.Ebook;
import com.example.EbookEc.Service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;

@Controller
public class ebookController {

    @Autowired
    EbookService ebookService;

    @GetMapping("/mainview")
    public String mainView(){

        return "mainView";
    }



}
