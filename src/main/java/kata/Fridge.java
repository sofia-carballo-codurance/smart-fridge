package kata;

public interface Fridge {
    void setCurrentDate();
    void signalFridgeDoorOpened();
    void signalFridgeDoorClosed();
    void scanAddedItem(String name, String expiryDate, String opened);
    void scanRemovedItem(String name);
    void simulateDayOver();
    String showDisplay();
}
