package guru.qa.springws.service;

import guru.qa.springws.domain.Country;
import guru.qa.springws.domain.entity.CountriesEntity;
import guru.qa.springws.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService implements ICountryService {

    private final CountryRepository cr;

    @Autowired
    public CountryService(CountryRepository cr) {
        this.cr = cr;
    }

    @Override
    public List<Country> getAllCountry() {
        List<CountriesEntity> countriesEntityList = cr.findAll();
        List<Country> countryList = new ArrayList<>();
        for (CountriesEntity countriesEntity : countriesEntityList) {
            countryList.add(Country.formCountriesEntity(countriesEntity));
        }
        return countryList;

    }

    @Override
    public Country getByCountryCode(String code) {
        return Country.formCountriesEntity(cr.getByCountryCode(code));
    }

    @Override
    public Country getByCountryName(String name) {
        return Country.formCountriesEntity(cr.getByCountryName(name));
    }

}
