import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shared.Main;
import shared.Meal;

import java.util.Map;

class MainTest {
    @Test
    void testGenerateMenuHasItems() {
        Map<String, Meal> menu = Main.generateMenu();

        Assertions.assertFalse(menu.entrySet().isEmpty());
    }

    @Test
    void testIfHasAllMenuItems() {
        Assertions.assertEquals(5, Main.generateMenu().entrySet().size());
    }

    @Test
    void testIfAllMenuItemsHaveIngredients() {
        for (Meal meal : Main.generateMenu().values()) {
            Assertions.assertFalse(meal.getIngredients().isEmpty());
        }
    }
}