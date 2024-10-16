package lk.ijse.aadspringwebmvcassignment.dto.impl;

import lk.ijse.aadspringwebmvcassignment.dto.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO implements OrderStatus {

    private String orderId;
    private String cusId;
    private LocalDate date;

}
