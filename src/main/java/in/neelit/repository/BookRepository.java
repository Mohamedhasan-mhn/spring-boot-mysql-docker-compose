package in.neelit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.neelit.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
