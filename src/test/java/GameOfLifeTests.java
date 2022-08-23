import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameOfLifeTests {

    String[][] grid = {{"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"}, {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"}, {"+", "+", "+", "+", "#", "+", "+", "+", "+", "+"},
            {"+", "+", "+", "+", "#", "#", "#", "+", "+", "+"}, {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"}, {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"}, {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"}, {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"}
    };

    @Test
    @DisplayName("This test should test the generation of the next generation in the game of life")
    void nextGeneration() {
        assertEquals("++++++++++\n" +
                "++++++++++\n" +
                "++++#+++++\n" +
                "++++##++++\n" +
                "+++++#++++\n" +
                "++++++++++\n" +
                "++++++++++\n" +
                "++++++++++\n" +
                "++++++++++\n" +
                "++++++++++\n",GameOfLife.converter(grid));
    }

}
