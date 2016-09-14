/**
 * 
 */
package shopping.cart.services;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deepak Singla
 *
 */
public class ShoppingCart {

	private List<Product> cartList = new ArrayList<Product>();

	/**
	 * This API add a new product into the existing cart list.
	 * @param product - product to be added.
	 */
	public void addProduct(Product product) {
		cartList.add(product);
	}

	/**
	 * This API deletes a existing product from the existing cart list.
	 * @param product - product index to be deleted.
	 */
	public void deleteProduct(int index) {
		cartList.remove(index);
	}

	/**
	 * This API iterates over the all items in the cart and calculates the total price.
	 * @return Double - total price of cart items (without any offer)
	 */
	public Double getTotalCartValue() {
		double totalPrice = 0;
		
		for(Product product : cartList){
			totalPrice = totalPrice + product.getPrice();
		}
		return totalPrice;
	}

	/**
	 * This API returns the total items available in the shopping cart.
	 * @return
	 */
	public List<Product> getProducts() {
		return cartList;
	}

}
