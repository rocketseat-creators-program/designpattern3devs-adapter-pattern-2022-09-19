package hexagonalArchitecture.core.ports;


import hexagonalArchitecture.core.model.User;

import java.util.List;

public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
