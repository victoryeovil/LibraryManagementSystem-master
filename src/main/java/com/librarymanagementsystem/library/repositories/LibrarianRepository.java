package com.librarymanagementsystem.library.repositories;

import com.librarymanagementsystem.library.models.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, Long> {
}
