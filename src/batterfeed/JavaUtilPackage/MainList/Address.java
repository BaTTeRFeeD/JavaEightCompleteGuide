package batterfeed.JavaUtilPackage.MainList;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String name, String street, String city, String state, String code){
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}
