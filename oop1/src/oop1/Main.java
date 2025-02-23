package oop1;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Vade Oranı";

		Product product1 = new Product();
		// set value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("bilmemne1.jpg");

		// get value
		// System.out.println(product.name);

		Product product2 = new Product();
		// set value
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(8);
		product2.setUnitsInStock(2);
		product2.setImageUrl("bilmemne2.jpg");
		
		Product product3 = new Product();
		// set value
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(4500);
		product3.setDiscount(9);
		product3.setUnitsInStock(4);
		product3.setImageUrl("bilmemne3.jpg");
		
		Product[] products= {product1,product2,product3};
		
		
		for (Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getUnitPrice());
			System.out.println(product.getDiscount());
			System.out.println(product.getUnitsInStock());
			System.out.println(product.getImageUrl());
			System.out.println("---------------------------------");
		}

	}

}
