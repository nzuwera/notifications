package rw.rolp.notifications.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.rolp.notifications.data.repository.NotificationChangeRepository;
import rw.rolp.notifications.data.repository.NotificationEntityRepository;
import rw.rolp.notifications.data.repository.NotificationsRepository;
import rw.rolp.notifications.data.repository.UsersRepository;

import java.util.ArrayList;

@Service
public class NotificationService {
    private UsersRepository usersRepository;
    private NotificationsRepository notificationsRepository;
    private NotificationEntityRepository notificationEntityRepository;
    private NotificationChangeRepository notificationChangeRepository;

    @Autowired
    public NotificationService(UsersRepository usersRepository, NotificationsRepository notificationsRepository, NotificationEntityRepository notificationEntityRepository, NotificationChangeRepository notificationChangeRepository) {
        this.notificationChangeRepository = notificationChangeRepository;
        this.notificationEntityRepository = notificationEntityRepository;
        this.notificationsRepository = notificationsRepository;
        this.usersRepository = usersRepository;
    }

    public ArrayList<Integer> getNotifications() {
        ArrayList<Integer> responseList = new ArrayList<Integer>();
        responseList.add(1); //,2,3];
        responseList.add(2);
        responseList.add(3);
        responseList.add(4);
        // return responseList;
        return responseList;
    }
}
