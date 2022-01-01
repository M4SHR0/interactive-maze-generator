package Tile;

public class LoadI extends Tile {
    public LoadI() {
        block = new boolean[][][]{
                { // default
                        {false, true, false},
                        {false, true, false},
                        {false, true, false}
                },
                { // right
                        {false, false, false},
                        {true, true, true},
                        {false, false, false}
                },
                { // left
                        {false, false, false},
                        {true, true, true},
                        {false, false, false}
                },
                { // reverse
                        {false, true, false},
                        {false, true, false},
                        {false, true, false}
                }
        };
    }
}
