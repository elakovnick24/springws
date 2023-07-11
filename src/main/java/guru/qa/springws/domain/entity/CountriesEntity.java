package guru.qa.springws.domain.entity;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "countries", schema = "public", catalog = "country-geo")
public class CountriesEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "country_code")
    private String countryCode;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountriesEntity that = (CountriesEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(countryName, that.countryName) && Objects.equals(countryCode, that.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, countryName, countryCode);
    }
}
