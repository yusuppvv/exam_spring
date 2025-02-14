package com.company.Books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BooksService booksService;

    @GetMapping("/get")
    public List<Books> getAll() {
        return booksService.getAll();
    }

    @GetMapping("/get/{id}")
    public Books getById(@PathVariable(name = "id") int id) {
        return booksService.getById(id);
    }

    @GetMapping("/search")
    public String search(@RequestParam(name = "title") String title) {
        return booksService.search(title);
    }

    @PostMapping("/create")
    public String create(@RequestBody Books product) {
        return booksService.create(product);
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable(name = "id") int id, @RequestBody Books product) {
        return booksService.update(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") int id) {
        return booksService.delete(id);
    }


}
