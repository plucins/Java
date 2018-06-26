package pl.sda.library.model;


import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;

import javax.persistence.*;
import java.util.Objects;

@NamedNativeQueries({
		@NamedNativeQuery(name = "bookByCategory",
				query = "SELECT * From Book b where b.category_id = :categoryId",
				resultClass = Book.class
		),
		@NamedNativeQuery(name = "bookByAuthor",
				query = "SELECT * From Book b where b.author_id = :authorId",
				resultClass = Book.class
		)
})

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	@OneToOne(cascade = CascadeType.ALL)
	private Category category;
	@OneToOne(cascade = CascadeType.ALL)
	private Author author;
	private int year;

	public Book() {

	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthors() {
		return author;
	}

	public void setAuthors(Author author) {
		this.author = author;
	}


	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Book book = (Book) o;
		return year == book.year &&
				Objects.equals(title, book.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, year);
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", title='" + title + '\'' +
				", author=" + author +
				", category=" + category +
				", year=" + year +
				'}';
	}
}
