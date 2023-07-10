package guru.qa.springws.repository;

import guru.qa.springws.domain.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<UsersEntity, UUID> {

    UsersEntity findByUsername(String username);

}
