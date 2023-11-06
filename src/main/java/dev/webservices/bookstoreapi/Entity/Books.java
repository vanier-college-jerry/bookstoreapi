package dev.webservices.bookstoreapi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    @Id
    @GeneratedValue

    private Long id;
    private String title;
    private String author;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books [id=" + id + ", title=" + title + ", author=" + author + "]";
    }

}
