package com.tdd.sa;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testCreateEmptyShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		Assert.assertEquals(0, cart.getProductCount());
	}
	
	@Test
	public void testAddSingleProductToShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("Java Book", 1, 127.0);
		cart.addProduct(product);
		Assert.assertEquals(1, cart.getProductCount());
		Assert.assertEquals(30.0, cart.getTotalCartValue(),0.0);
	}
	
	@Test
	public void addDifferentProductsToTheCart(){
		ShoppingCart cart = new ShoppingCart();
		Product gatsByCream = new Product("Java Book", 1, 127.0);
		Product bvlgiriSoap = new Product("Web Designe Book", 1, 100.0);
		cart.addProduct(gatsByCream);
		cart.addProduct(bvlgiriSoap);
		Assert.assertEquals(2, cart.getProductCount());
		Assert.assertEquals(130.0, cart.getTotalCartValue(),0.0);
	}
}
