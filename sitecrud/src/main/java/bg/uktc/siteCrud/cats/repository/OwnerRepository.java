package bg.uktc.siteCrud.cats.repository;

import bg.uktc.siteCrud.cats.model.entity.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<OwnerEntity, Long> {
}
