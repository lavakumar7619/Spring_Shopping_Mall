package project.shopping.irepository;

import project.shopping.entites.MallAdmin;

public interface IMallAdminRepository {
	public MallAdmin addMallAdmin(MallAdmin mallAdmin);
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin);
	public MallAdmin deleteMallAdmin(long id);
	public MallAdmin searchMallAdmin(long id);
}
