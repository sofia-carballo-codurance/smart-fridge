package kata;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;

public class AcceptanceShould {
    @Mock ConsolePrinter consolePrinter;

    @Test void
    display_fridge_items() {
        var smartFridge = new SmartFridge(new SmartFridgeService(), new SmartFridgeRepository());
        smartFridge.setCurrentDate("18/10/2021");
        smartFridge.signalFridgeDoorOpened();
        smartFridge.scanAddedItem("Milk", "21/10/21", "sealed");
        smartFridge.scanAddedItem("Cheese", "18/11/21", "sealed");
        smartFridge.scanAddedItem("Beef", "20/10/21", "sealed");
        smartFridge.scanAddedItem("Lettuce", "22/10/21", "sealed");
        smartFridge.signalFridgeDoorClosed();
        smartFridge.simulateDayOver();
        smartFridge.signalFridgeDoorOpened();
        smartFridge.signalFridgeDoorClosed();
        smartFridge.signalFridgeDoorOpened();
        smartFridge.signalFridgeDoorClosed();
        smartFridge.signalFridgeDoorOpened();
        smartFridge.scanRemovedItem("Milk");
        smartFridge.signalFridgeDoorClosed();
        smartFridge.signalFridgeDoorOpened();
        smartFridge.scanAddedItem("Milk", "26/10/21", "opened");
        smartFridge.scanAddedItem("Peppers", "23/10/21", "opened");
        smartFridge.signalFridgeDoorClosed();
        smartFridge.simulateDayOver();
        smartFridge.signalFridgeDoorOpened();
        smartFridge.scanRemovedItem("Beef");
        smartFridge.scanRemovedItem("Lettuce");
        smartFridge.signalFridgeDoorClosed();
        smartFridge.signalFridgeDoorOpened();
        smartFridge.scanAddedItem("Lettuce", "22/10/21", "opened");
        smartFridge.signalFridgeDoorClosed();
        smartFridge.signalFridgeDoorOpened();
        smartFridge.signalFridgeDoorClosed();
        smartFridge.simulateDayOver();
        smartFridge.showDisplay();

        verify(consolePrinter).print("EXPIRED: Milk");
        verify(consolePrinter).print("Lettuce: 0 days remaining");
        verify(consolePrinter).print("Peppers: 1 day remaining");
        verify(consolePrinter).print("Cheese: 31 days remaining");
    }
}
