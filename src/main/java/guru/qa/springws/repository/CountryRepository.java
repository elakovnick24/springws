package guru.qa.springws.repository;

import guru.qa.springws.domain.entity.CountriesEntity;
import jakarta.annotation.Nonnull;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface CountryRepository extends CrudRepository<CountriesEntity, UUID> {

        List<CountriesEntity> getAll();
        CountriesEntity getByCountryCode(@Nonnull String code);
        CountriesEntity getByCountryName(@Nonnull String name);

}
