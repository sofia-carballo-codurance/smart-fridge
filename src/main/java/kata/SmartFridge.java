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
    public void signalFridgeDoorClosed() {
        itemRepository.alertDoorClosed();
    }

    @Override
    public void scanAddedItem(String name, String expiryDate, String status) {
        itemRepository.addItem(name, expiryDate, status);
    }

    @Override
    public void simulateDayOver() {
        itemRepository.startDay();
    }

    @Override
    public void scanRemovedItem(String name) {
        itemRepository.removeItem(name);
    }

    @Override
    public String showDisplay() {
        throw new UnsupportedOperationException();
    }
}
