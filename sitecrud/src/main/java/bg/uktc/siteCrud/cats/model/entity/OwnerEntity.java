package bg.uktc.siteCrud.cats.model.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "owners")
public class OwnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String ownerName;

    @OneToMany(
            mappedBy = "owner",
            cascade = CascadeType.ALL
    )
    private List<CatEntity> cats = new ArrayList<>();

    public OwnerEntity addCat(CatEntity cat){
        cats.add(cat);
        return this;
    }

    public Long getId() {
        return id;
    }

    public OwnerEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public OwnerEntity setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public List<CatEntity> getCats() {
        return cats;
    }

    public OwnerEntity setCats(List<CatEntity> cats) {
        this.cats = cats;
        return this;
    }
}
