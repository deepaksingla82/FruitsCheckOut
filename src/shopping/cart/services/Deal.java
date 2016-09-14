/**
 * 
 */
package shopping.cart.services;

/**
 * @author Deepak Singla
 *
 */
public class Deal {
	
    private String productCode;
    private Integer count;

    public Deal(String productCode, Integer count) {
        this.productCode = productCode;
        this.count = count;
    }

    public String getProductCode() {
        return productCode;
    }

    public Integer getCount() {
        return count;
    }
}
