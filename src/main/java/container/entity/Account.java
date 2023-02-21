package container.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Account {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
}
