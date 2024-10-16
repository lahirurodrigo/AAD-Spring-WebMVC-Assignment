package lk.ijse.aadspringwebmvcassignment.customerStatusCode;

import lk.ijse.aadspringwebmvcassignment.dto.CustomerStatus;
import lk.ijse.aadspringwebmvcassignment.dto.ItemStatus;
import lk.ijse.aadspringwebmvcassignment.dto.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedCustomerItemOrderErrorStatus implements CustomerStatus, ItemStatus, OrderStatus {
    private int statusCode;
    private String statusMessage;
}
