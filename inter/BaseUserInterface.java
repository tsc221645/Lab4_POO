package inter;

public interface BaseUserInterface{
    int maxBorrowBook = 3;
    int maxBorrowingDays = 30;
    public void showUpgradeMessage();
    public void upgradeUserType();
    public void selectDeliveryPlace();
    public void selectBorrowTime();
    public void applyCupon();
}