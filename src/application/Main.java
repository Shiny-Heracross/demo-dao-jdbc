package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {

		Department dp = new Department(1, "Tecnologhy");
		
		Seller seller = new Seller(21, "Mauricio", "mauricio@gmail.com", new Date(), 3000.0, dp);
		
		SellerDao sellerDao = DaoFactory.CreateSellerDao();
		
		System.out.println(seller);
		
	}

}
