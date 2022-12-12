package de.arvato.bibliothek.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Repository
public interface BookRepository extends JpaRepository < Book, Long > {
    List <Book> findByTitle(String title);

    Optional < Book > findByIsbn(String isbn);

    @Transactional
    void removeByIsbn(String isbn);
}
