package rw.rolp.notifications.business.domain;

public class NotificationBusiness {
    private long id;
    private long notificationObjectId;
    private long userId;
    private  int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNotificationObjectId() {
        return notificationObjectId;
    }

    public void setNotificationObjectId(long notificationObjectId) {
        this.notificationObjectId = notificationObjectId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
