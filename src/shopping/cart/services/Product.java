/**
 * 
 */
package shopping.cart.services;

/**
 * @author Deepak Singla
 *
 */
public abstract class Product implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum Type {
        APPLE, ORANGE
    }
	
	private Double price;
    private String code;
    private String name;
    private Deal deal;

    public Product(String code, String name, Double price, Deal deal) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.deal = deal;
    }

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the deal
	 */
	public Deal getDeal() {
		return deal;
	}
    
}
