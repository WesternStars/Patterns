package criational.bulder.upprouch1.builders;

import criational.bulder.upprouch1.dtos.UserDto;
import criational.bulder.upprouch1.entities.Address;

import java.time.LocalDate;

public interface UserDtoBuilder {

    UserDtoBuilder withFirstName(String fName);

    UserDtoBuilder withLastName(String lName);

    UserDtoBuilder withAddress(Address address);

    UserDtoBuilder withBirthday(LocalDate date);

    UserDto build();

    UserDto getUserDto();
}
