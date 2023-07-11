package guru.qa.springws.domain;

import guru.qa.springws.domain.entity.CountriesEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    private UUID id;
    private String code;
    private String name;

    public static Country formCountriesEntity(CountriesEntity entity) {
        Country country = new Country();
        country.setId(entity.getId());
        country.setCode(entity.getCountryCode());
        country.setName(entity.getCountryName());
        return country;
    }



}
