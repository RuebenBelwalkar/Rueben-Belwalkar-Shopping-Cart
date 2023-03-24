package com.ani.shopping_cart.item;

import java.util.ArrayList;
import java.util.List;

public class ItemDb {
    private final static ArrayList<Item> items = new ArrayList<>();
    public static void totalItems() {
    	 
    	items.add(new Item(1, "Pencil", 5));
    	items.add(new Item(2, "Umbrella", 145));
    	items.add(new Item(3, "Bag", 450));
    	items.add(new Item(4, "Crayons", 35));
    	items.add(new Item(5, "NoteBook", 50));
    	items.add(new Item(6, "Charger", 200));
    	items.add(new Item(7, "Scissor", 120));
    	items.add(new Item(8, "Ball", 230));
    	items.add(new Item(9, "pen", 10));
    	items.add(new Item(10, "Bottle", 90));
    	}

    

    public static void addItem(int id, String name, double price) {
        Item item = new Item(id, name, price);
        items.add(item);
    }

    public static List<Item> listItems() {
    	
    	if(items.isEmpty()) {
    	
        return items;
    	
    }
    	return null;
  
}
public static Item findItemsById(int id) {
	for (Item item : ITEMS) {
		if (item.getId() == id)
			return item;
	}
	throw new IdNotFoundException("Item Id not found");
}
}
