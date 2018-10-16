package bt_user.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "order_template")
public class OrderTemplate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "users_id")
	private int users_id;
	
	@Column(name = "orders_id")
	private int orders_id;
	
	@Column(name = "user_username")
	private String user_username;
	
	@Column(name = "translator")
	private String translator;
	
	@Column(name = "language_from")
	private String language_from;
	
	@Column(name = "language_to")
	private String language_to;
	
	@Column(name = "order_date")
	private Date order_date;
	
	@Column(name = "estimated_date")
	private Date estimated_date;
	// UPDATE user.order_template ot, user.providers p
	// SET ot.estimated_date = p.estimated_date;
	
	@Column(name = "price_hour")
	private float price_hour;
	// UPDATE user.order_template ot, user.providers p
	// SET ot.price_hour = p.price_hour;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
	public int getOrders(){
		return orders_id;
	}
	
	public void setOrders(int orders_id) {
		this.orders_id = orders_id;
	}
	
	@ManyToOne
	@JoinColumn(name = "users")
	public int getUsers() {
		return users_id;
	}

	public void setUsers(int users_id) {
		this.users_id = users_id;
	}

	public int getOrders_id() {
		return orders_id;
	}

	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}

	public String getUser_username() {
		return user_username;
	}

	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public String getLanguage_from() {
		return language_from;
	}

	public void setLanguage_from(String language_from) {
		this.language_from = language_from;
	}

	public String getLanguage_to() {
		return language_to;
	}

	public void setLanguage_to(String language_to) {
		this.language_to = language_to;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public Date getEstimated_date() {
		return estimated_date;
	}

	public void setEstimated_date(Date estimated_date) {
		this.estimated_date = estimated_date;
	}

	public double getPrice_hour() {
		return price_hour;
	}

	public void setPrice_hour(float price_hour) {
		this.price_hour = price_hour;
	}

	public int getUsers_id() {
		return users_id;
	}

	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}
}