package project.shopping.irepository;

import project.shopping.entites.Mall;

public interface IMallRepository {
	public Mall addMall(Mall mall);
	public Mall updateMall(Mall mall);
	public Mall searchMall(long id);
}
