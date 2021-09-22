package project.shopping.irepository;

import project.shopping.entites.OrderDetails;

public interface IOrderRepository {
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails searchOrder(long id);
	public OrderDetails deleteOrder(long id);
}
