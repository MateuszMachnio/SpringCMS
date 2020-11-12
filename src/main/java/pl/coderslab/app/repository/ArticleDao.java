package pl.coderslab.app.repository;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;
import pl.coderslab.app.entity.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ArticleDao {

    @PersistenceContext
    EntityManager entityManager;

    public void save(Article article) {
        entityManager.persist(article);
    }

    public void update(Article article) {
        entityManager.merge(article);
    }

    public Article findById(Long id) {
        return entityManager.find(Article.class, id);
    }

    public Article findByIdWithCategories(Long id) {
        Article article = findById(id);
        Hibernate.initialize(article.getCategories());
        return article;
    }
    public void remove(Article article) {
        entityManager.remove(entityManager.contains(article) ? article : entityManager.merge(article));
    }

    public List<Article> findAll() {
        TypedQuery<Article> query = entityManager.createQuery("SELECT a FROM Article a", Article.class);
        return query.getResultList();
    }

    public List<Article> findAllDrafts() {
        TypedQuery<Article> query = entityManager.createQuery("SELECT a FROM Article a WHERE a.draft = true", Article.class);
        return query.getResultList();
    }

    public List<Article> getLastFiveArticles() {
        TypedQuery<Article> query = entityManager.createQuery("SELECT a FROM Article a ORDER BY a.created DESC", Article.class);
        query.setMaxResults(5);
        return query.getResultList();
    }

}
