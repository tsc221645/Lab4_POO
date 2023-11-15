package bean;
import java.util.ArrayList;

import inter.BaseUserInterface;

public class BaseUser extends User implements BaseUserInterface{
    public BaseUser(int userID, String userName, String password, Book[] books, ArrayList<Magazine> magazines){
        super(userID, userName, password, books, magazines);

    }

    @Override
    public String toString(){
        return("-------------------\nBaseUser\nUserId: "+getUserID()+ "Username: "+ getUserName()+"\nPassword: "+getPassword());
    }

    @Override
    public void showUpgradeMessage(){
        System.out.println("Actualice el usuario a premium.");
    }

    @Override
    public void upgradeUserType() {
        
    }

    @Override
    public void selectDeliveryPlace() {
        
    }

    @Override
    public void selectBorrowTime() {
        
    }

    @Override
    public void applyCupon() {
        
    }
}
