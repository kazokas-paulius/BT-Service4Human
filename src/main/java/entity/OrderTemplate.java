package entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
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
	private List<User> users_id;
	private List<Order> orders_id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
	public List<Order> getOrders(){
		return orders_id;
	}
	
	public void setOrders(List<Order> orders_id) {
		this.orders_id = orders_id;
	}
	
	@ManyToOne
	@JoinColumn(name = "users")
	public List<User> getUsers() {
		return users_id;
	}

	public void setUsers(List<User> users_id) {
		this.users_id = users_id;
	}
}
