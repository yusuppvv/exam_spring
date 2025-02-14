package com.company.Books;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BooksRepository {
    private List<Books> booksList = new ArrayList<>();

    public List<Books> getAll() {
        return booksList;
    }

    public String create(Books books) {
        for (Books b : booksList) {
            if (b.getId() == books.getId()) {
                return "Books already exists";
            }
        }
        booksList.add(books);
        return "Books created";
    }

    public String update(int id, Books books) {
        for (Books b : booksList) {
            if (b.getId() == id) {
                b.setTitle(books.getTitle());
                b.setAuthor(books.getAuthor());
                return "Books updated";
            }
        }
        return "Books not found or operation failed";
    }

    public String delete(int id) {
        for (Books b : booksList) {
            if (b.getId() == id) {
                booksList.remove(b);
                return "Books deleted";
            }
        }
        return "Books not found or operation failed";
    }


    public Books getById(int id) {
        for (Books b : booksList) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public String search(String title) {
        for (Books b : booksList) {
            if (b.getTitle().equals(title)) {
                return String.valueOf(b);
            }
        }
        return "There is no book like this title";
    }
}
