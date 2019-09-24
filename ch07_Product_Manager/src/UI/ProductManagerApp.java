package UI;

import Model.LineItem;
import Model.Product;

public class ProductManagerApp {

	public static void main(String[] args) {
		
		// create an instance of product
		Product p1 = new Product(".NET", "Murach's .Net Programming", 59.50);
		// create an instance of LineItem
		LineItem li = new LineItem(p1, 8);
		// print content to console
		System.out.println(p1);
		System.out.println(li);
	}

}
