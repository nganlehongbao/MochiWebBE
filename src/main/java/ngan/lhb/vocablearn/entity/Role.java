package ngan.lhb.vocablearn.entity;

import jakarta.persistence.*;
import ngan.lhb.vocablearn.enums.ERole;

@Entity
@Table(name = "ROLES")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, name = "NAME")
    private ERole name;

    public Role(){}

    public Role(ERole name){
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }
}
