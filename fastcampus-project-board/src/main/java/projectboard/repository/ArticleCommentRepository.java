package projectboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectboard.domain.ArticleComment;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}