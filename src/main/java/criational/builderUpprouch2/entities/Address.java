package criational.builderUpprouch2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

    private String houseNumber;
    private String street;
    private String city;
    private String zip;
}
