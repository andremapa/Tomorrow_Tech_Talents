package com.andremapa.modulo3_POOII.exercicio3;

import com.andremapa.modulo3_POOII.exercicio3.domain.models.Book;
import com.andremapa.modulo3_POOII.exercicio3.domain.repositories.DatabaseRepositoryImpl;

public class ApplicationTest {

    public static void main(String[] args) {


        DatabaseRepositoryImpl repository = new DatabaseRepositoryImpl();

        Book book = new Book("test", 1, 10.0, new String[]{"X", "Y"}, "You", "Pc");
        repository.saveProduct(book);
        System.out.println(repository.updateById(1, new Book("testTrue", 1, 10.0, new String[]{"XX", "YY"}, "He", "I don't know")));
        System.out.println(repository.findByCategory(book));

    }
}
