package com.ll.exam.app20230706.article.repository;

import com.ll.exam.app20230706.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
