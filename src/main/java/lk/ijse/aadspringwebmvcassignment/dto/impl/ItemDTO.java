package lk.ijse.aadspringwebmvcassignment.dto.impl;

import lk.ijse.aadspringwebmvcassignment.dto.ItemStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDTO implements ItemStatus {
    private String id;
    private String name;
    private double price;
    private double qty;
}
