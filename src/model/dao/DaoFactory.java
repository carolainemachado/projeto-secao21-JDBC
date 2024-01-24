package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

//esta classe tem operaçoes staicas para instanciar os DAO
public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}