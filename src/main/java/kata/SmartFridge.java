package kata;

public class SmartFridge implements Fridge{
    public String currentDate;
    private SmartFridgeService smartFridgeService;
    private ItemsPrinter itemsPrinter;

    public SmartFridge(SmartFridgeService smartFridgeService, ItemsPrinter itemsPrinter) {
        this.smartFridgeService = smartFridgeService;
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
        smartFridgeService.add(name, expiryDate, status);
    }

    @Override
    public void scanRemovedItem(String name) {
        smartFridgeService.remove(name);
    }

    @Override
    public void simulateDayOver() {
        String nextDay = smartFridgeService.startNewDay(currentDate);
        currentDate = nextDay;
    }

    @Override
    public void showDisplay() {
        itemsPrinter.print(smartFridgeService.getItems());
    }
}
