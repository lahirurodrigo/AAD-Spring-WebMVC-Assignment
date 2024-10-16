package lk.ijse.aadspringwebmvcassignment.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO {

    private String orderId;
    private String cusId;
    private LocalDate date;

}
