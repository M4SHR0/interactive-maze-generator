package Tile;

public class LoadT extends Tile {
    public LoadT() {
        block = new boolean[][][]{
                { // default
                        {false, false, false},
                        {true, true, true},
                        {false, true, false}
                },
                { // right
                        {false, true, false},
                        {false, true, true},
                        {false, true, false}
                },
                { // left
                        {false, true, false},
                        {true, true, false},
                        {false, true, false}
                },
                { // reverse
                        {false, true, false},
                        {true, true, true},
                        {false, false, false}
                }
        };
    }
}
