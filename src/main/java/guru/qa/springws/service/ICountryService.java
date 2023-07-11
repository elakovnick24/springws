package guru.qa.springws.service;

import guru.qa.springws.domain.Country;

import java.util.List;

public interface ICountryService {

    List<Country> getAllCountry();

    Country getByCountryCode(String code);

    Country getByCountryName(String name);
}
