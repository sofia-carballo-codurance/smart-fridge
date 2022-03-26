package kata;

public class SmartFridge implements Fridge {
    @Override
    public void setCurrentDate() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void signalFridgeDoorOpened() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scanAddedItem(String name, String expiryDate, String opened) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void signalFridgeDoorClosed() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void simulateDayOver() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scanRemovedItem(String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String showDisplay() {
        throw new UnsupportedOperationException();
    }
}
