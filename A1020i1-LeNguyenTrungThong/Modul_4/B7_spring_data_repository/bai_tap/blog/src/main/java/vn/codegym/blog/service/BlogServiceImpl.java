package vn.codegym.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.blog.model.Blog;
import vn.codegym.blog.repository.BlogRepo;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepo blogRepo;

    @Override
    public void createBlog(Blog blog) {
        this.blogRepo.save(blog);
    }

    @Override
    public List<Blog> findAll() {
        return this.blogRepo.findAll();
    }

    @Override
    public void updateBlog(Blog blog) {
        this.blogRepo.save(blog);
    }

    @Override
    public void detailsBlog(int id) {

    }

    @Override
    public void deleteBlog(Blog blog) {
        this.blogRepo.delete(blog);
    }

    @Override
    public Blog findById(int id) {
        return this.blogRepo.findById(id).orElse(null);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return this.blogRepo.findAll(pageable);
    }

    @Override
    public Page<Blog> searchByName(String kq, Pageable pageable) {
        return null;
    }
}
