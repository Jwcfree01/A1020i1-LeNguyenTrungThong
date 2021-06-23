package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Blog;
import vn.codegym.repository.BlogRepo;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepo blogRepo;

    @Override
    public void createBlog(Blog blog) {
        this.blogRepo.createBlog(blog);
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
