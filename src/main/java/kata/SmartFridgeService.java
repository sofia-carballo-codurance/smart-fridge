package kata;

import java.util.List;

public class SmartFridgeService {
    private ItemDegrader itemDegrader;
    private SmartFridgeRepository smartFridgeRepository;

    public SmartFridgeService(ItemDegrader itemDegrader, SmartFridgeRepository smartFridgeRepository) {
        this.itemDegrader = itemDegrader;
        this.smartFridgeRepository = smartFridgeRepository;
    }

    public void openDoor() {
        itemDegrader.degrade(smartFridgeRepository.getItems());
    }

    public void closeDoor() {
        throw new UnsupportedOperationException();
    }

    public String startNewDay(String currentDate) {
        throw new UnsupportedOperationException();
    }

    public List<Item> getItems() {
        return smartFridgeRepository.getItems();
    }

    public void add(String item, String date, String status) {
        smartFridgeRepository.addItem(item, date, status);
    }

    public void remove(String item) {
        smartFridgeRepository.removeItem(item);
    }
}
