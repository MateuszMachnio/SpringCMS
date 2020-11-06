package pl.coderslab.app.repository;

import org.springframework.stereotype.Repository;
import pl.coderslab.app.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryDao {
    
    @PersistenceContext
    EntityManager entityManager;

    public void save(Category category) {
        entityManager.persist(category);
    }

    public Category findById(Long id) {
        return entityManager.find(Category.class, id);
    }

    public void update(Category category) {
        entityManager.merge(category);
    }

    public void remove(Category category) {
        entityManager.remove(entityManager.contains(category) ? category : entityManager.merge(category));
    }

    public List<Category> findAll() {
        TypedQuery<Category> query = entityManager.createQuery("SELECT c FROM Category c", Category.class);
        return query.getResultList();
    }

}
