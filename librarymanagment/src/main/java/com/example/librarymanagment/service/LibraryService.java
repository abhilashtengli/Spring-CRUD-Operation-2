package com.example.librarymanagment.service;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

import com.example.librarymanagment.model.LibraryModel;

@Service
public class LibraryService {
    static ArrayList<LibraryModel> list = new ArrayList<>();

    static {
        list.add(new LibraryModel("library-1", "kushal nagar,Bengaluru", "564789123", true));
        list.add(new LibraryModel("library-2", "Gandhi nagar,Bengaluru", "987654321", true));
        list.add(new LibraryModel("library-3", "Indra nagar,Bengaluru", "456723891", true));
        list.add(new LibraryModel("library-4", "Vishal nagar,Bengaluru", "852147963", true));
        list.add(new LibraryModel("library-5", "Majestic,Bengaluru", "369741258", true));

    }

    public ArrayList<LibraryModel> getAll() {
        return list;
    }

    public void addLibrary(LibraryModel libraryModel) {
        list.add(libraryModel);
    }

    public LibraryModel getLibrary(String name) {
        return list.stream().filter(t -> t.getName().equals(name)).findFirst().get();
    }

    public void deletlib(String name) {
      LibraryModel libraryModel = getLibrary(name);
      list.remove(libraryModel);
    }
}
