package com.librarymanagementsystem.library.repositories;

import com.librarymanagementsystem.library.models.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {
}
