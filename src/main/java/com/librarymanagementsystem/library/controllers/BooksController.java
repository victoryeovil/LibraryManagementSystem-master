package com.librarymanagementsystem.library.controllers;

import com.librarymanagementsystem.library.models.Books;
import com.librarymanagementsystem.library.services.book.IBooksService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BooksController {
    IBooksService iBooksService;

    public BooksController(IBooksService iBooksService) {
        this.iBooksService = iBooksService;
    }

    @GetMapping
    public List<Books> list() {
        return iBooksService.list();
    }

    @PostMapping
    public Books create(@RequestBody final Books books){
        return iBooksService.create(books);
    }


    @GetMapping(value = "{id}")
    public Books get(@PathVariable Long id){
        return iBooksService.get(id);

    }

    @RequestMapping(value = "{id}", method =RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        iBooksService.delete(id);
    }


    @RequestMapping(value="{id}", method = RequestMethod.PUT)
    public Books update(@PathVariable Long id, @RequestBody Books books){
        Books existingBooks =iBooksService.update(books);
        BeanUtils.copyProperties(books, existingBooks, "id");
        return iBooksService.update(existingBooks);
    }

}
