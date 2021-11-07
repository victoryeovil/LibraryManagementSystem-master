package com.librarymanagementsystem.library.services.book;

import com.librarymanagementsystem.library.models.Books;
import com.librarymanagementsystem.library.repositories.BooksRepository;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class BooksServicesImpl implements IBooksService {
    BooksRepository booksRepository;

    public BooksServicesImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public List<Books> list() {
        return booksRepository.findAll();
    }

    @Override
    public Books get(Long id) {
        return  booksRepository.getById(id);
    }

    @Override
    public Books create(Books books) {
        return  booksRepository.save(books);
    }

    @Override
    public void delete(Long id) {
        booksRepository.deleteById(id);
    }

    @Override
    public Books update(Books books) {
        return booksRepository.save(books);
    }
}
