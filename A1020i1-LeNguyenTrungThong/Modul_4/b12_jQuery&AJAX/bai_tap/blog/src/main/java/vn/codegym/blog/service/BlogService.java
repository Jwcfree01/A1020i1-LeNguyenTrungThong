package vn.codegym.blog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.blog.model.Blog;

import java.util.List;

public interface BlogService {

    void createBlog (Blog blog);

    List<Blog> findAll();

    void updateBlog(Blog blog);

    void detailsBlog(int id);

    void deleteBlog (Blog blog);

    Blog findById (int id);

    Page<Blog> findAll(Pageable pageable);

    Page<Blog> searchByName(String kq, Pageable pageable);
}
