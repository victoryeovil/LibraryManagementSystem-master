package com.librarymanagementsystem.library.services.Librarian;

import com.librarymanagementsystem.library.models.Librarian;
import com.librarymanagementsystem.library.repositories.LibrarianRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibrarianImpl implements ILibrarianService{
    LibrarianRepository librarianRepository;

    public LibrarianImpl(LibrarianRepository librarianRepository) {
        this.librarianRepository = librarianRepository;
    }

    @Override
    public List<Librarian> list() {
        return librarianRepository.findAll();
    }

    @Override
    public Librarian get(Long id) {
        return  librarianRepository.getById(id);
    }

    @Override
    public Librarian create(Librarian student) {
        return  librarianRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        librarianRepository.deleteById(id);
    }

    @Override
    public Librarian update(Librarian student) {
        return librarianRepository.save(student);
    }
}
