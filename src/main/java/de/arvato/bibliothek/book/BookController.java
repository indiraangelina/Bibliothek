package de.arvato.bibliothek.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;

        @GetMapping("/book")
        List<Book> findAll() {
            return (List<Book>) bookRepository.findAll();
        }

        @PostMapping("/book")
        Book newBook(@RequestBody Book newBook) {
            return bookRepository.save(newBook);
        }

        @GetMapping("/book/{isbn}")
        Book one(@PathVariable String isbn) throws Exception {
            return bookRepository.findByIsbn(isbn)
                    .orElseThrow(() -> new Exception("unable to found book"));
        }

        @DeleteMapping("/book/{isbn}")
        void deleteBook(@PathVariable String isbn) {
            bookRepository.removeByIsbn(isbn);
        }
    }









