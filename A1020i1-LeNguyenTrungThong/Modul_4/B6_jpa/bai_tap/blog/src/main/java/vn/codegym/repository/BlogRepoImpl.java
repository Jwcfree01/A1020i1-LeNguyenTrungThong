package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.Blog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BlogRepoImpl implements BlogRepo{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createBlog(Blog blog) {
        this.entityManager.persist(blog);
    }

    @Override
    public List<Blog> findAll() {
        return null;
    }

    @Override
    public void updateBlog(Blog blog) {

    }

    @Override
    public void detailsBlog(int id) {

    }

    @Override
    public void deleteBlog(Blog blog) {

    }

    @Override
    public void findById(int id) {

    }
}
