package collections.kit.serialization;

import java.io.Serializable;

public class Address implements Serializable {
    String streetName;
    String cityName;
    Long postalCode;

    public Address(String streetName, String cityName, Long postalCode) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.postalCode = postalCode;
    }
}
