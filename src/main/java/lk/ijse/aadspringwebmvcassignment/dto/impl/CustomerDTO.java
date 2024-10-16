package lk.ijse.aadspringwebmvcassignment.dto.impl;

import lk.ijse.aadspringwebmvcassignment.dto.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO implements CustomerStatus {
    private String id;
    private String name;
    private String address;
    private String email;
}
