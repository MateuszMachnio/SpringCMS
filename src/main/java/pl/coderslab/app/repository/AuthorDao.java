package pl.coderslab.app.repository;

import org.springframework.stereotype.Repository;
import pl.coderslab.app.entity.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AuthorDao {

    @PersistenceContext
    EntityManager entityManager;

    public void save(Author author) {
        entityManager.persist(author);
    }

    public Author findById(Long id) {
        return entityManager.find(Author.class, id);
    }

    public void update(Author author) {
        entityManager.merge(author);
    }

    public void remove(Author author) {
        entityManager.remove(entityManager.contains(author) ? author : entityManager.merge(author));
    }

    public List<Author> findAll() {
        TypedQuery<Author> query = entityManager.createQuery("SELECT a FROM Author a", Author.class);
        return query.getResultList();
    }

}
