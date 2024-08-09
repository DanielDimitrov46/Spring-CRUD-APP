package bg.uktc.siteCrud.cats.model.entity;

import jakarta.persistence.*;

@Entity
@Table(schema = "cats")
public class CatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String catName;
    @ManyToOne
    private OwnerEntity owner;

    public Long getId() {
        return id;
    }

    public CatEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCatName() {
        return catName;
    }

    public CatEntity setCatName(String catName) {
        this.catName = catName;
        return this;
    }

    public OwnerEntity getOwner() {
        return owner;
    }

    public CatEntity setOwner(OwnerEntity owner) {
        this.owner = owner;
        return this;
    }
}
