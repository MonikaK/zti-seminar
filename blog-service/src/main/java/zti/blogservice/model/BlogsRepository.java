package zti.blogservice.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogsRepository extends JpaRepository< Blog, Integer > {

}
