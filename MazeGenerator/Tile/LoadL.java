package Tile;

public class LoadL extends Tile {
    public LoadL() {
        block = new boolean[][][]{
                { // default
                        {false, true, false},
                        {false, true, true},
                        {false, false, false}
                },
                { // right
                        {false, true, false},
                        {true, true, false},
                        {false, false, false}
                },
                { // left
                        {false, false, false},
                        {false, true, true},
                        {false, true, true}
                },
                { // reverse
                        {false, false, false},
                        {true, true, false},
                        {false, true, false}
                }
        };
    }
}
