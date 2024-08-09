package bg.uktc.siteCrud.cats.Service.impl;

import bg.uktc.siteCrud.cats.Service.OwnerService;
import bg.uktc.siteCrud.cats.model.dto.CreateOwnerDTO;
import bg.uktc.siteCrud.cats.model.entity.CatEntity;
import bg.uktc.siteCrud.cats.model.entity.OwnerEntity;
import bg.uktc.siteCrud.cats.repository.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl implements OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public void createOwner(CreateOwnerDTO createOwnerDTO) {
        OwnerEntity owner = new OwnerEntity().setOwnerName(createOwnerDTO.getOwnerName());
        createOwnerDTO.getCatNames().forEach(name -> {
            CatEntity cat = new CatEntity().setCatName(name).setOwner(owner);
            owner.addCat(cat);
        });
        ownerRepository.save(owner);
    }

}
