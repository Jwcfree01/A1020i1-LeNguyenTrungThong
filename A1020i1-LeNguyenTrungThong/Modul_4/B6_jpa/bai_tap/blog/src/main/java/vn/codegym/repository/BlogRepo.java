package vn.codegym.repository;

import vn.codegym.model.Blog;

import java.util.List;

public interface BlogRepo {
    void createBlog (Blog blog);

    List<Blog> findAll();

    void updateBlog(Blog blog);

    void detailsBlog(int id);

    void deleteBlog (Blog blog);

    void  findById (int id);
}
