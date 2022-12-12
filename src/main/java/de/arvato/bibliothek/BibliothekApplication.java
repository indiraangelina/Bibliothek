package de.arvato.bibliothek;

import de.arvato.bibliothek.book.Book;
import de.arvato.bibliothek.book.BookRepository;
import de.arvato.bibliothek.customer.Customer;
import de.arvato.bibliothek.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BibliothekApplication {
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BibliothekApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			 Customer indira = new Customer ("indira", "Gütersloh", 19);
			 Customer matthias = new Customer("Matthias", "Düsseldorf", 34 );
			 customerRepository.save(indira);
			 customerRepository.save(matthias);
			Book starwars = new Book ("George Lucas", "Star Wars", "galaxy war", "Marvel", "the fight between good and bad", 1978, "abc");
			Book cars = new Book("Darla Anderson", "Cars", "cars", "Pixar", "motor Race", 2006, "def");
			bookRepository.save(starwars);
			bookRepository.save(cars);
		};
	}

}
