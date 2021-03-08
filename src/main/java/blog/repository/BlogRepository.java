package blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import blog.model.Post;

public interface BlogRepository extends JpaRepository<Post, Long> {
    
}
