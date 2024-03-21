package criational.builderUpprouch2;

import criational.builderUpprouch2.dtos.UserDto;
import criational.builderUpprouch2.dtos.UserDto.UserDtoBuilder;
import criational.builderUpprouch2.entities.Address;
import criational.builderUpprouch2.entities.User;

import java.time.LocalDate;

import static criational.builderUpprouch2.dtos.UserDto.getUserDtoBuilder;

public class BuilderStarter {
    public static void main(String[] args) {
        User user = creatUser();
        UserDtoBuilder builder = getUserDtoBuilder();

        UserDto dto = directBuildMethod2(builder, user);
        System.out.println(dto);

        dto = builder.getUserDto();
        System.out.println("____saved_dto");
        System.out.println(dto);
    }

    public static UserDto directBuildMethod2(UserDtoBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getDate())
                .withAddress(user.getAddress())
                .build();
    }

    public static User creatUser() {
        Address address = new Address("10", "Landay", "Kiyv", "63300");
        return new User("First", "Last", LocalDate.of(1990, 1, 23), address);
    }
}