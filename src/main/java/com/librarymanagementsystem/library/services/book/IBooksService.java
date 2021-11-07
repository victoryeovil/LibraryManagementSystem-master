package com.librarymanagementsystem.library.services.book;

import com.librarymanagementsystem.library.models.Books;


import java.util.List;

public interface IBooksService {
    List<Books> list();
    Books  get(Long id);
    Books create(Books books);
    void delete(Long id);
    Books update(Books books);
}
