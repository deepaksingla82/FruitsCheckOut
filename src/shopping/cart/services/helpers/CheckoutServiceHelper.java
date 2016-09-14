/**
 * 
 */
package shopping.cart.services.helpers;

import java.util.ArrayList;
import java.util.List;

import shopping.cart.services.Product;
import shopping.cart.services.Product.Type;
import shopping.cart.services.ShoppingCart;

/**
 * @author Deepak Singla
 *
 */
public class CheckoutServiceHelper {
	
	public static Double calculateOffer(ShoppingCart cart) {
		
        Double discountPrice = 0.0;
        
        List<Product> appleDealProducts = new ArrayList<Product>();
        
        List<Product> orangeDealProducts = new ArrayList<Product>();
        
        if(cart != null && cart.getProducts() != null){

        	for(Product product: cart.getProducts()){
        		if(product.getDeal() != null){
        			if(product.getName().equalsIgnoreCase(Type.APPLE.name())){
        				appleDealProducts.add(product);
        			}
        			else if(product.getName().equalsIgnoreCase(Type.ORANGE.name())){
        				orangeDealProducts.add(product);
        			}
        		}
        	}
        }
        	
        if(appleDealProducts.size()> 0){
        	discountPrice += (appleDealProducts.size() / appleDealProducts.get(0).getDeal().getCount()) * appleDealProducts.get(0).getPrice();
        }
        
        if(orangeDealProducts.size()> 0){
        	discountPrice += (orangeDealProducts.size() / orangeDealProducts.get(0).getDeal().getCount()) * orangeDealProducts.get(0).getPrice();
        }
        
       return discountPrice;
    
	}

}
