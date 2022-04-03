package kata;

import java.util.Date;

public class SmartFridge implements Fridge{
    public Date currentDate;

    @Override
    public void setCurrentDate(String currentDate) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void signalFridgeDoorOpened() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void signalFridgeDoorClosed() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scanAddedItem(String name, String expiryDate, String status) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scanRemovedItem(String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void simulateDayOver() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void showDisplay() {
        throw new UnsupportedOperationException();
    }
}
