package ua.lviv.lgs.main;

import ua.lviv.lgs.domain.Product;
import ua.lviv.lgs.domain.User;
import ua.lviv.lgs.service.ProductService;
import ua.lviv.lgs.service.UserService;
import ua.lviv.lgs.service.impl.ProductServiceImpl;
import ua.lviv.lgs.service.impl.UserServiceImpl;

public class MainTest {

	public static void main(String[] args) {
		
		UserService userService = new UserServiceImpl();
		userService.create(new User("test@test", "first Test", "last Test", "roleTest"));
		
//		ProductService productService = new ProductServiceImpl();		
//		productService.create(new Product("Times", "finance", 25.25));

	}

}
