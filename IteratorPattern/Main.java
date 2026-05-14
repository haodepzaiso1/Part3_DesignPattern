package IteratorPattern;

public class Main {


		public static void main(String[] args) {
	        Iventory inventory = new Iventory();
	        inventory.addItem(new Item("iPhone 15", true));
	        inventory.addItem(new Item("MacBook Pro", false)); // Hết hàng
	        inventory.addItem(new Item("iPad Air", true));
	        inventory.addItem(new Item("Apple Watch", false)); // Hết hàng

	        MyIterator iterator = inventory.createStockIterator();

	        System.out.println("--- Các mặt hàng còn trong kho ---");
	        while (iterator.hasNext()) {
	            Item item = iterator.next();
	            System.out.println("- " + item.getName());
	        }
	    }

	}


