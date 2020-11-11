package pl.coderslab.app.entity;

import pl.coderslab.app.groupInterfaces.CompleteArticle;
import pl.coderslab.app.groupInterfaces.DraftArticle;

import javax.persistence.*;
import javax.validation.GroupSequence;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "articles")
//@GroupSequence({CompleteArticle.class, DraftArticle.class, Article.class})
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(groups = {CompleteArticle.class, DraftArticle.class})
    @Size(max = 200, groups = {CompleteArticle.class, DraftArticle.class})
    @Column(nullable = false, length = 200)
    private String title;

    @OneToOne
    @NotNull(message = "Proszę zaznaczyć autora", groups = CompleteArticle.class)
    @JoinColumn(name = "author_id")
    private Author author;

    @NotEmpty(message = "Proszę zaznaczyć przynajmniej jedną kategorię", groups = CompleteArticle.class)
    @OneToMany
    @JoinColumn(name = "article_id")
    private Set<Category> categories = new HashSet<>();

    @NotNull(groups = {CompleteArticle.class, DraftArticle.class})
    @Size(min = 50, groups = {CompleteArticle.class, DraftArticle.class})
    private String content;

//    @AssertFalse(groups = Article.class)
    @AssertTrue(groups = DraftArticle.class)
    private Boolean draft;

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

    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return id.equals(article.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
