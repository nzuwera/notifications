package rw.rolp.notifications.repository;

import rw.rolp.notifications.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {
    Users getByEmailAddress(String emailAddress);
    Users getUsersByPhoneNumber(String phoneNumber);
}
