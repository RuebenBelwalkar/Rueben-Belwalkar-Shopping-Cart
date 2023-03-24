package com.ani.shopping_cart.item;

public class ItemController {
    public void displayItems() {

        String[] headers = { "Id", "Name", "Price"};
        int totalWidth = headers.length * 15 + (headers.length - 1) * 3;
        String divider = String.format("%" + totalWidth + "s", "").replace(" ", "-");

        System.out.printf("%-15s | %-15s | %-15s\n", headers);
        System.out.println(divider);
      
        ItemDb.listItems().forEach(item -> {
            System.out.printf("%-15d | %-15s | %-15f\n", item.getId(), item.getName(), item.getPrice());
        });
    }
    public void removeItems(int id) {
		int removeItem = itemDb.removeItem(id);

		if (removeItem == ItemDb.REMOVED_ITEM) {
			System.out.println("Item removed from list.");
		}
	}
}
