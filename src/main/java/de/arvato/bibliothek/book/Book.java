package de.arvato.bibliothek.book;

import javax.persistence.*;

@Entity
public class Book {
    private String author;
    private String title;
    private String theme;
    private String publishingCompany;
    private String description;
    private  int publishingYear;

    @Column(unique = true)
    private String isbn;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Book(){

    }

    public Book(String author, String title, String theme, String publishingCompany, String description, int publishingYear, String isbn) {
        this.author = author;
        this.title = title;
        this.theme = theme;
        this.publishingCompany = publishingCompany;
        this.description = description;
        this.publishingYear = publishingYear;
        this.isbn = isbn;
    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getTheme() {
        return theme;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public String getDescription() {
        return description;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public Long getId() {return id;}

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
