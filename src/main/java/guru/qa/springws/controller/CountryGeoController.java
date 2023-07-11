package guru.qa.springws.controller;

import guru.qa.springws.domain.Country;
import guru.qa.springws.service.ICountryService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/internal")
public class CountryGeoController {
    private final ICountryService countryService;
    @Autowired
    public CountryGeoController(ICountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country/code")
    public Country getCountryByCode() {
        return countryService.getByCountryCode("GE");
    }

    @GetMapping("/country/name")
    public Country getCountryByName() {
        return countryService.getByCountryName("Georgia");
    }

    @GetMapping("/all")
    public List<Country> getAllCountries() {
        return countryService.getAllCountry();
    }

}
