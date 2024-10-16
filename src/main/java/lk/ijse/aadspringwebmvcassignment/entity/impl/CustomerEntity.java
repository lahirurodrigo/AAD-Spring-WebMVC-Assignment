package lk.ijse.aadspringwebmvcassignment.entity.impl;

import jakarta.persistence.*;
import lk.ijse.aadspringwebmvcassignment.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class CustomerEntity implements SuperEntity {
    @Id
    private String id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false, unique = true)
    private String email;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<OrderEntity> orders;
}
