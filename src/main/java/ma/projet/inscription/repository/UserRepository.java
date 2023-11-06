package ma.projet.inscription.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.inscription.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
