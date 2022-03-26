package kata;

public class SmartFridge implements Fridge {

    private ItemRepository itemRepository;

    public SmartFridge(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void setCurrentDate() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void signalFridgeDoorOpened() {
        itemRepository.alertDoorOpened();
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
