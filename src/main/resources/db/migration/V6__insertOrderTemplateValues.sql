INSERT INTO user.order_template VALUES (
null, null, 
null, null,
null,
"lietuviu kalba", "persiku kalba",
null, null
);

UPDATE user.order_template ot, user.user_data ud
  SET ot.users_id = ud.id;
  
UPDATE user.order_template ot, user.order_data o
  SET ot.orders_id = o.orders_id;
  
UPDATE user.order_template ot, user.order_data o, user.user_data u
  SET ot.user_username = u.username;
  
UPDATE user.order_template ot
  SET ot.order_date = CURRENT_DATE();
  