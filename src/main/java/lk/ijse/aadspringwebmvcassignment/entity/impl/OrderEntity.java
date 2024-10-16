package lk.ijse.aadspringwebmvcassignment.entity.impl;

import jakarta.persistence.*;
import lk.ijse.aadspringwebmvcassignment.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "orders")
public class OrderEntity implements SuperEntity {
    @Id
    private String orderId;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity customer;
    private LocalDate date;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "order_items",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id")
    )
    private Set<ItemEntity> items;
}
