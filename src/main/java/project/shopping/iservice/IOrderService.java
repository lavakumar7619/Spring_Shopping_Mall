package project.shopping.iservice;

import project.shopping.entites.Item;
import project.shopping.entites.OrderDetails;

public interface IOrderService {
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails searchOrder(long id);
	public boolean cancelMall(long id);
	public Item addItem(Item item);

}
