package rw.rolp.notifications.data.repository;

import rw.rolp.notifications.data.entity.NotificationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationEntityRepository extends CrudRepository<NotificationEntity, String> {
    NotificationEntity getByName(String name);
}
