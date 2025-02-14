package com.company.Books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    @Autowired
    private BooksRepository booksRepository;

    public List<Books> getAll() {
        return booksRepository.getAll();
    }

    public String create(Books books) {
        return booksRepository.create(books);
    }

    public String update(int id, Books books) {
        return booksRepository.update(id, books);
    }

    public String delete(int id) {
        return booksRepository.delete(id);
    }

    public Books getById(int id) {
        return booksRepository.getById(id);
    }

    public String search(String title) {
        return booksRepository.search(title);
    }
}
