package com.ani.shopping_cart.user;

import com.ani.shopping_cart.exceptions.UserNotFoundException;

public class UserDb {
    public static final int NO_MORE_SPACE = 890;
    public static final int USER_ALREADY_EXISTS = 990;
    public static final int USER_SUCCESSFULLY_CREATED= 1001;

    // our users that we will create from users menu,
    // those users will be stored here
    private static final User[] users = new User[5];    

    public static int addNewUser(int id, String name) {

        int emptyPos = getEmptyPosition();
        if(emptyPos == -1) {
            return NO_MORE_SPACE;
        }

        // check user availability
        int pos = isExists(id);
        if(pos != -1) return USER_ALREADY_EXISTS;
      
        // we have reached this line means, there is space and user is fresh
        // supplied userid is fresh
        User user = new User(id, name);
        users[emptyPos] = user;
        return USER_SUCCESSFULLY_CREATED;
    }

    public static User[] listUsers() {
        return users;
    }
    
    public static User selectUser(int id) {
        User user = new User(id,null);
        int idPresent = isExists(id);
        if (idPresent == 1) {
            return null;
            }
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == id) {
                user.setId(users[i].getId());
                user.setName(users[i].getName());
                break;
            }
        }
        return user;
    }


    private static int isExists(int id) {
        for ( int i = 0; i < users.length; i++  ) {
            User user = users[i];
            if(user != null)
                if(user.getId() == id)
                    return i; // already exists
        }
        return -1; // supplied id is fresh
    }

    private static int getEmptyPosition() {
        for ( int i = 0; i < users.length; i++  ) {
            User user = users[i];
            if(user == null) {
                return i; // at the ith location, block is empty
            }
        }
        return -1; // there is no empty position
    } 
    public static User findUserById(int userId) {
        for ( User user : users) {
            if(user.getId() == userId) return user;
        }
        throw new UserNotFoundException("❌ User Id " + userId +" Not Found");
}
}
