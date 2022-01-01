package Tile;

public class LoadX extends Tile {
    public LoadX() {
        block = new boolean[][][]{
                { // default
                        {false, true, false},
                        {true, true, true},
                        {false, true, false}
                },
                { // right
                        {false, true, false},
                        {true, true, true},
                        {false, true, false}
                },
                { // left
                        {false, true, false},
                        {true, true, true},
                        {false, true, false}
                },
                { // reverse
                        {false, true, false},
                        {true, true, true},
                        {false, true, false}
                }
        };
    }
}
