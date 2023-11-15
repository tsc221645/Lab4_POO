package bean;

import java.util.ArrayList;

import inter.PremiumUserInterface;

public class PremiumUser extends User implements PremiumUserInterface{
    public PremiumUser(int userID, String userName, String password, Book[] books, ArrayList<Magazine> magazines){
        super(userID, userName, password, books, magazines);

    }

    @Override
    public void selectBorrowingSchedule() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectBorrowingSchedule'");
    }

    @Override
    public void selectDeliveryPlace() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectDeliveryPlace'");
    }
    
}
