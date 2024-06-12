package idusw.springboot.ldhblog.repository;

import idusw.springboot.ldhblog.entity.BlogEntity;
import idusw.springboot.ldhblog.model.BlogDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BlogRepository extends JpaRepository<BlogEntity, Long> { // interface 상속,
   Optional<BlogEntity> findByIdx(BlogDto dto);
}
