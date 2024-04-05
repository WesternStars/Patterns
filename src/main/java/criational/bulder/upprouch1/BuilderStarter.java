package criational.bulder.upprouch1;

import criational.bulder.upprouch1.builders.UserDtoBuilder;
import criational.bulder.upprouch1.builders.UserWebDtoBuilder;
import criational.bulder.upprouch1.dtos.UserDto;
import criational.bulder.upprouch1.entities.Address;
import criational.bulder.upprouch1.entities.User;

import java.time.LocalDate;

public class BuilderStarter {
    public static void main(String[] args) {
        User user = creatUser();
        UserDtoBuilder builder = new UserWebDtoBuilder();

        UserDto dto = directBuild(builder, user);
        System.out.println(dto);
    }

    public static UserDto directBuild(UserDtoBuilder builder, User user) {
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
