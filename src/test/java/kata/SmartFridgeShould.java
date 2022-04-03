package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartFridgeShould {

    @Test
    void
    set_fridge_date_to_current_date() {
        SmartFridge fridge = new SmartFridge();
        fridge.setCurrentDate("03/04/2022");
        var result = fridge.currentDate;

        assertEquals(result, "03/04/2022");
    }
}
