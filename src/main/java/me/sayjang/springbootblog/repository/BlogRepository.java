package me.sayjang.springbootblog.repository;

import me.sayjang.springbootblog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
