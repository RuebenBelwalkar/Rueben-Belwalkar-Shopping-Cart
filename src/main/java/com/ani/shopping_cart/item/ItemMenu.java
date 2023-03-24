package com.ani.shopping_cart.item;
import java.util.Scanner;


import com.ani.inputs.InputChecker;

@Deprecated
public class ItemMenu {

	private final ShowMenu menu;
	private final InputChecker input;
	private final ItemController controller;

	public ItemMenu() {
		menu=new Showmenu();
		input=new InputChecker();
		controller=new ItemController();
	}

	

	public void performAction() {

		while (true) {
			menu.displayItemMenu();
			int ch=0;
			try {
				 ch =input.readId("choice: ");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			if (ch == 4) {
				System.out.println("\n 🙏 Thanks for using our services");
				break;
			} else {
				if (ch == 1) {
					System.out.println("\n 👏 You selected New Item \n");
					try {
						
						int id =input.readId("Item Id: ");
						String name = input.readName("Item Name: ");
						double price = input.readPrice("Item Price: ");
						
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					

				} else if (ch == 2) {
					System.out.println(" \n 👏 You selected List Items \n ");
					try {
                  
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

				} 
				else if(ch==3) {
					System.out.println(" \n 👏 You selected Remove Items \n ");
					try {
						int id=input.readId("Item Id: ");
						controller.removeItems(id);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				else {
					System.out.println("Enter following choice");
				}
			}
		}
	}
	public static void main(String[] args) {
		ItemMenu itemMenu=new ItemMenu();
		itemMenu.performAction();
	}
}