package vn.codegym.blog.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.blog.model.Blog;

public interface BlogRepo extends JpaRepository<Blog, Integer> {

}
