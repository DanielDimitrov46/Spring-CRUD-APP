package bg.uktc.siteCrud.cats.repository;

import bg.uktc.siteCrud.cats.model.entity.CatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<CatEntity, Long> {
}
