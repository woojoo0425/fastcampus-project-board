package projectboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectboard.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}