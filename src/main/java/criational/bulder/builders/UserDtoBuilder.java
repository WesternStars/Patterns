package criational.bulder.builders;

import criational.bulder.dtos.UserDto;
import criational.bulder.entities.Address;

import java.time.LocalDate;

public interface UserDtoBuilder {

    UserDtoBuilder withFirstName(String fName);

    UserDtoBuilder withLastName(String lName);

    UserDtoBuilder withAddress(Address address);

    UserDtoBuilder withBirthday(LocalDate date);

    UserDto build();

    UserDto getUserDto();
}
