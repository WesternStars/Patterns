package criational.builderUpprouch2.dtos;

import criational.builderUpprouch2.entities.Address;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter(AccessLevel.PRIVATE)
public class UserDto {

    private String name;
    private String age;
    private String address;

    public static UserDtoBuilder getUserDtoBuilder() {
        return new UserDtoBuilder();
    }

    @Override
    public String toString() {
        return "UserDto\n{ " +
                "\nname='" + name + '\'' +
                ",\nage='" + age + '\'' +
                ",\naddress='" + address + '\'' +
                "\n}";
    }

    public static class UserDtoBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private String address;
        @Getter
        private UserDto userDto;

        public UserDtoBuilder withFirstName(String fName) {
            firstName = fName;
            return this;
        }

        public UserDtoBuilder withLastName(String lName) {
            lastName = lName;
            return this;
        }

        public UserDtoBuilder withAddress(Address address) {
            this.address = String.format("%s, %s %s, %s", address.getCity(), address.getStreet(), address.getHouseNumber(), address.getZip());
            return this;
        }

        public UserDtoBuilder withBirthday(LocalDate date) {
            Period period = Period.between(date, LocalDate.now());
            age = Integer.toString(period.getYears());
            return this;
        }

        public UserDto build() {
            userDto = new UserDto();
            userDto.setName(firstName + " " + lastName);
            userDto.setAge(age);
            userDto.setAddress(address);
            return userDto;
        }
    }
}
