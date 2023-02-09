package com.example.librarymanagment.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarymanagment.model.LibraryModel;
import com.example.librarymanagment.service.LibraryService;

// import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/library/management")
public class LibraryController {
    @Autowired
    public LibraryService libraryService;

    @GetMapping("/getAll")
    public ArrayList<LibraryModel> getAll(){
       return  libraryService.getAll();
    }
    
    @PostMapping("/addLibraries")
    public void addLibrary(@RequestBody LibraryModel libraryModel){
        libraryService.addLibrary(libraryModel);
    }
    @GetMapping("/getLibrary/name/{name}")
    public LibraryModel getLibrary(@PathVariable String name){
        return libraryService.getLibrary(name);
    }

    @DeleteMapping("/delet/name/{name}")
    public void deletLib(@PathVariable String name){
        libraryService.deletlib(name);
    }
}
