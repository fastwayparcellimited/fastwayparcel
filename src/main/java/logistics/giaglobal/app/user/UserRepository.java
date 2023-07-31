package logistics.giaglobal.app.user;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	public Optional<User> findByUserNameAndPassword(String userName, String password);

}
