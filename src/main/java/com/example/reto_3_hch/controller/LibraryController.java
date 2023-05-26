package com.example.reto_3_hch.controller;


import com.example.reto_3_hch.entities.Library;
import com.example.reto_3_hch.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/all")
    public List<Library> getAll(){
        return libraryService.getAll();
    }
    @PostMapping("/save")
    public Library save(@RequestBody Library p){
        return libraryService.save(p);
    }
}
