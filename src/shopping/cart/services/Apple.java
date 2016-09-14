/**
 * 
 */
package shopping.cart.services;

/**
 * @author Deepak Singla
 *
 */
public class Apple extends Product {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Apple(String productCode, String name, Double price, Deal deal) {
        super(productCode, name, price, deal);
    }
}
