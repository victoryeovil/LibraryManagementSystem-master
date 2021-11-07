package com.librarymanagementsystem.library.controllers;


import com.librarymanagementsystem.library.models.Librarian;
import com.librarymanagementsystem.library.services.Librarian.ILibrarianService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/librarian")
public class LibrarianController {
    ILibrarianService iLibrarianService;

    public LibrarianController(ILibrarianService iLibrarianService) {
        this.iLibrarianService = iLibrarianService;
    }

    @GetMapping
    public List<Librarian> list() {
        return iLibrarianService.list();
    }

    @PostMapping
    public Librarian create(@RequestBody final Librarian librarian){
        return iLibrarianService.create(librarian);
    }


    @GetMapping(value = "{id}")
    public Librarian get(@PathVariable Long id){
        return iLibrarianService.get(id);

    }

    @RequestMapping(value = "{id}", method =RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        iLibrarianService.delete(id);
    }


    @RequestMapping(value="{id}", method = RequestMethod.PUT)
    public Librarian update(@PathVariable Long id, @RequestBody Librarian librarian){
        Librarian existingLibrarian =iLibrarianService.update(librarian);
        BeanUtils.copyProperties(librarian, existingLibrarian, "id");
        return iLibrarianService.update(existingLibrarian);
    }

}
