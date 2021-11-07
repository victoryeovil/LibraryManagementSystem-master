package com.librarymanagementsystem.library.services.Librarian;

import com.librarymanagementsystem.library.models.Librarian;

import java.util.List;

public interface ILibrarianService {

    List<Librarian> list();
    Librarian  get(Long id);
    Librarian create(Librarian librarian);
    void delete(Long id);
    Librarian update(Librarian librarian);
}
