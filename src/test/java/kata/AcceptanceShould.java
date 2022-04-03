package kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptanceShould {

    @Test void
    display_fridge_items() {
        String expectedOut = """
            EXPIRED: Milk
            Lettuce: 0 days remaining
            Peppers: 1 day remaining
            Cheese: 31 days remaining
            """;

        var smartFridge = new SmartFridge(new SmartFridgeService(), new SmartFridgeRepository());
        var printer = new TerminalPrinter();
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

        assertEquals(expectedOut, printer.print());
    }
}
