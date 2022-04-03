package kata;

public interface Fridge {
    void setCurrentDate(String currentDate);
    void signalFridgeDoorOpened();
    void signalFridgeDoorClosed();
    void scanAddedItem(String name, String expiryDate, String status);
    void scanRemovedItem(String name);
    void simulateDayOver();
    void showDisplay();
}
