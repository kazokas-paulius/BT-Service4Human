package bt_user.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "orderdata")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orders_id;
	
	@Column(name = "desired_translation_text")
	private String desired_translation_text;

	public Order() {}

	@ManyToOne
	@JoinColumn(name = "order_id")
	public int getOrder_id() {
		return orders_id;
	}

	public void setOrder_id(int orders_id) {
		this.orders_id = orders_id;
	}

	public int getOrders_id() {
		return orders_id;
	}

	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}

	public String getDesired_translation_text() {
		return desired_translation_text;
	}

	public void setDesired_translation_text(String desired_translation_text) {
		this.desired_translation_text = desired_translation_text;
	}
}