package pl.coderslab.app.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String title;

    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToMany
    @JoinColumn(name = "article_id")
    private Set<Category> categories = new HashSet<>();

    private String content;

    @Column(name = "created_on")
    private LocalDateTime created;

    @Column(name = "updated_on")
    private LocalDateTime updated;

    @PrePersist
    public void setCreatedTime() {
        this.created = LocalDateTime.now();
    }

    @PreUpdate
    public void setUpdatedTime() {
        this.updated = LocalDateTime.now();
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
