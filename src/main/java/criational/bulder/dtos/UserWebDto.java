package criational.bulder.dtos;

public class UserWebDto implements UserDto {

    private String name;
    private String age;
    private String address;

    public UserWebDto(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "UserWebDto{ " +
                "\nname='" + name + '\'' +
                ",\nage='" + age + '\'' +
                ",\naddress='" + address + '\'' +
                "\n}";
    }
}
