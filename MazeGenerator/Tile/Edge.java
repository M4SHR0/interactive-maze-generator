package MazeGenerator.Tile;

public class Edge extends Tile {
    public Edge() {
        block = new boolean[][][]{
                { // default
                        {false, false, false},
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
                        {false, true, true},
                        {false, false, false}
                },
                { // reverse
                        {false, true, false},
                        {false, true, false},
                        {false, false, false}
                }
        };
    }
}

