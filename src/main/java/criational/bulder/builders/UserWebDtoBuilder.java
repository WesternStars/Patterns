package criational.bulder.builders;

import criational.bulder.dtos.UserDto;
import criational.bulder.dtos.UserWebDto;
import criational.bulder.entities.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDtoBuilder implements UserDtoBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDto userDto;

    @Override
    public UserDtoBuilder withFirstName(String fName) {
        firstName = fName;
        return this;
    }

    @Override
    public UserDtoBuilder withLastName(String lName) {
        lastName = lName;
        return this;
    }

    @Override
    public UserDtoBuilder withAddress(Address address) {
        this.address = String.format("%s, %s %s, %s", address.getCity(), address.getStreet(), address.getHouseNumber(), address.getZip());
        return this;
    }

    @Override
    public UserDtoBuilder withBirthday(LocalDate date) {
        Period period = Period.between(date, LocalDate.now());
        age = Integer.toString(period.getYears());
        return this;
    }

    @Override
    public UserDto build() {
        userDto = new UserWebDto(firstName + " " + lastName, age, address);
        return userDto;
    }

    @Override
    public UserDto getUserDto() {
        return userDto;
    }
}
