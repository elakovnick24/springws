package guru.qa.springws.controller;

import guru.qa.springws.domain.Country;
import guru.qa.springws.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/internal")
public class CountryGeoController {
    private final ICountryService countryService;
    @Autowired
    public CountryGeoController(ICountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable("code") String code) {
        return countryService.getByCountryCode(code);
    }

    @GetMapping("/country/{name}")
    public Country getCountryByName(@PathVariable("name") String name) {
        return countryService.getByCountryName(name);
    }

    @GetMapping("/all")
    public List<Country> getAllCountries() {
        return countryService.getAll();
    }

}
