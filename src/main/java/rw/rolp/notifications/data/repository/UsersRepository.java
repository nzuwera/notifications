package rw.rolp.notifications.data.repository;

import rw.rolp.notifications.data.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {
    Users getByEmailAddress(String emailAddress);
    Users getUsersByPhoneNumber(String phoneNumber);
}
