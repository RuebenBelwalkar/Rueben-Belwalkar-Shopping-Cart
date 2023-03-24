package com.ani.shopping_cart.all.menu;

public class ShowMenu {
    public void displayCartMenu() {
        StringBuilder builder = new StringBuilder();
          builder.append("🔥 Cart Menu 🔥")
          .append("\n")
          .append("-------------------")
          .append("\n")
          .append("Select Your Choice")
          .append("\n")
          .append("-------------------")
          .append("\n")
          .append("1. Add To Cart ")
          .append("\n")
          .append("2. Show Cart")
          .append("\n")
          .append("3. Remove From Item")
          .append("\n")
          .append("4. Cart Total")
          .append("\n")
          .append("5. Exit")
          .append("\n");

          System.out.println(builder.toString());
  }
  public void displayUserMenu() {
      StringBuilder builder = new StringBuilder();
      builder.append("Welcome Customer")
             .append("\n")
             .append("🔥 User Menu 🔥")
             .append("\n")
             .append("-------------------")
             .append("\n")
             .append("Select Your Choice")
             .append("\n")
             .append("-------------------")
             .append("\n")
             .append("1. New User")
             .append("\n")
             .append("2. List Users")
             .append("\n")
             .append("3. Enter cart ")
             .append("\n")
             .append("4. Exit")
             .append("\n")
             .append("\n")
             ;

      System.out.println(builder.toString());
      
  }
  public void displayItemMenu() {
      StringBuilder builder = new StringBuilder();
      builder.append("🔥 Items Menu 🔥")
      .append("\n")
      .append("-------------------")
      .append("\n")
      .append("Select Your Choice")
      .append("\n")
      .append("-------------------")
      .append("\n")
      .append("1. New Item")
      .append("\n")
      .append("2. List of Items")
      .append("\n")
      .append("3. Remove item")
      .append("\n")
      .append("4. Exit")
      .append("\n")
      .append("\n");
}
}
