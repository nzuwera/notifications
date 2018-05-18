-- Entity
CREATE TABLE IF NOT EXISTS entity (
	id INT AUTO_INCREMENT PRIMARY KEY,
	NAME VARCHAR(64)
);
-- Entity TYPE
CREATE TABLE IF NOT EXISTS entity_type (
	id INT AUTO_INCREMENT PRIMARY KEY,
	entity_id INT UNSIGNED NOT NULL,
	NAME VARCHAR(64)
);


CREATE INDEX fk_entity_id ON entity_type(entity_id);
ALTER TABLE entity_type ADD FOREIGN KEY (entity_id) REFERENCES entity(id);

-- Notification object
CREATE TABLE IF NOT EXISTS notification_object (
  id INT AUTO_INCREMENT PRIMARY KEY,
  entity_type_id INT UNSIGNED NOT NULL,
  entity_id INT UNSIGNED NOT NULL,
  created_on DATETIME NOT NULL,
  status TINYINT NOT NULL
);
 
-- Notification
CREATE TABLE IF NOT EXISTS notification (
  id INT AUTO_INCREMENT PRIMARY KEY,
  notification_object_id INT UNSIGNED NOT NULL,
  notifier_id INT UNSIGNED NOT NULL,
  status TINYINT NOT NULL
  );
 
-- Notification change
CREATE TABLE IF NOT EXISTS notification_change (
  id INT AUTO_INCREMENT PRIMARY KEY,
  notification_object_id INT UNSIGNED NOT NULL,
  actor_id INT UNSIGNED NOT NULL
  );
  
-- Users
CREATE TABLE IF NOT EXISTS Users (
  UserId INT AUTO_INCREMENT PRIMARY KEY,
  firstName VARCHAR(64),
  lastName VARCHAR(64),
  emailAddress VARCHAR(64),
  address VARCHAR(64),
  country VARCHAR(32),
  state VARCHAR(12),
  phoneNumber VARCHAR(24)
);

CREATE INDEX fk_notification_object_idx ON  notification(notification_object_id);
CREATE INDEX fk_notification_notifier_id_idx ON  notification(notifier_id);
CREATE INDEX fk_notification_object_idx_2 ON notification_change(notification_object_id);
CREATE INDEX fk_notification_actor_id_idx ON notification_change(actor_id);
ALTER TABLE notification ADD FOREIGN KEY (notification_object_id) REFERENCES notification_object(id);
ALTER TABLE notification ADD FOREIGN KEY (notifier_id) REFERENCES users(UserId);
ALTER TABLE notification_change ADD FOREIGN KEY (notification_object_id) REFERENCES notification_object(id);
ALTER TABLE notification_change ADD FOREIGN KEY (actor_id) REFERENCES users(UserId);