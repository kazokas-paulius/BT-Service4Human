INSERT INTO user.order_template VALUES (
null, 
null, null, 
null, null,
"lietuviu kalba", "persiku kalba",
null, null,
null
);

UPDATE user.order_template ot, user.user_data u, user.order_data o
  SET ot.users_id = u.id,
      ot.orders_id = o.orders_id,
      ot.user_username = u.username,
      ot.order_date = CURRENT_DATE();