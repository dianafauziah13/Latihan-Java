package List_Collection;

import java.util.ArrayList;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> data = Product.Data();

	    System.out.println("ProductName               | Quantity | Weight | Destination | ServicePackage              | Service Value | Total");
	    for(Product item: data){
	        System.out.printf("%-25s | %-8d | %-6d | %-11s | %-27s | %-13d | %d \n", item.getProductName(),
	                item.getQuantity(),
	                item.getWeight(),
	                item.getCity().getDestination(),
	                item.getServicePackage().getService(),
	                item.getServicePackage().getValue(),
	                item.getQuantity() * item.getPriceItem() + item.getServicePackage().getValue());
	    }
	}
}



