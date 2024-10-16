package lk.ijse.aadspringwebmvcassignment.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {
    private String tel;
    private String name;
    private String address;
    private String email;
}
