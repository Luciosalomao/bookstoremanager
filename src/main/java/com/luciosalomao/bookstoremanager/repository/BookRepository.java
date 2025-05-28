package com.luciosalomao.bookstoremanager.repository;

import com.luciosalomao.bookstoremanager.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BookRepository extends JpaRepository<Books, Long> {

}
