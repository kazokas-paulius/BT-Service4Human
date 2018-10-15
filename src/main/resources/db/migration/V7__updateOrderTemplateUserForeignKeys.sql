UPDATE user.order_template ot, user.user_data ud
  SET ot.users_id = ud.id;