package quanlydienthoai.Models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private List<Pair<Phone, Integer>> list;
	private java.util.Date date;
	private int totalPrice;
	private int idAcc;

	public Order() {
	}

	public Order(List<Pair<Phone, Integer>> list, Date date, int totalPrice, int idAcc) {
		super();
		this.list = list;
		this.date = date;
		this.totalPrice = totalPrice;
		this.idAcc = idAcc;
	}

	public Order(int id, Date date, int totalPrice, int idAcc) {
		this.id = id;
		this.date = date;
		this.totalPrice = totalPrice;
		this.idAcc = idAcc;
	}

	public Order(int id, List<Pair<Phone, Integer>> list, Date date, int totalPrice, int idAcc) {
		this.id = id;
		this.list = list;
		this.date = date;
		this.totalPrice = totalPrice;
		this.idAcc = idAcc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Pair<Phone, Integer>> getList() {
		return list;
	}

	public void setList(List<Pair<Phone, Integer>> list) {
		this.list = list;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getIdAcc() {
		return idAcc;
	}

	public void setIdAcc(int idAcc) {
		this.idAcc = idAcc;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", list=" + list + ", date=" + date + ", totalPrice=" + totalPrice + ", idAcc="
				+ idAcc + "]";
	}

}
