package bg.uktc.siteCrud.cats.model.dto;

import bg.uktc.siteCrud.cats.model.entity.OwnerEntity;

import java.util.List;

public class CreateOwnerDTO {
    private String ownerName;
    private List<String> catNames;

    public String getOwnerName() {
        return ownerName;
    }

    public CreateOwnerDTO setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public List<String> getCatNames() {
        return catNames;
    }

    public CreateOwnerDTO setCatNames(List<String> catNames) {
        this.catNames = catNames;
        return this;
    }
}
