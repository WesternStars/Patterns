package criational.builderUpprouch2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private LocalDate date;
    private Address address;
}
