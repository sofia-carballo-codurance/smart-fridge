package kata;

public class SmartFridge implements Fridge{
    public String currentDate;
    private SmartFridgeService smartFridgeService;
    private SmartFridgeRepository smartFridgeRepository;
    private ItemsPrinter itemsPrinter;

    public SmartFridge(SmartFridgeService smartFridgeService, SmartFridgeRepository smartFridgeRepository, ItemsPrinter itemsPrinter) {
        this.smartFridgeService = smartFridgeService;
        this.smartFridgeRepository = smartFridgeRepository;
        this.itemsPrinter = itemsPrinter;
    }

    @Override
    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    @Override
    public void signalFridgeDoorOpened() {
        smartFridgeService.openDoor();
    }

    @Override
    public void signalFridgeDoorClosed() {
        smartFridgeService.closeDoor();
    }

    @Override
    public void scanAddedItem(String name, String expiryDate, String status) {
        smartFridgeRepository.addItem(name, expiryDate, status);
    }

    @Override
    public void scanRemovedItem(String name) {
        smartFridgeRepository.removeItem(name);
    }

    @Override
    public void simulateDayOver() {
        String nextDay = smartFridgeService.startNewDay(currentDate);
        currentDate = nextDay;
    }

    @Override
    public void showDisplay() {
        itemsPrinter.print(smartFridgeRepository.getItems());
    }
}
