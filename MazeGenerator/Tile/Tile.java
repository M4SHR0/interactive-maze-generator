package MazeGenerator.Tile;

abstract public class Tile{
  protected int rotate;
  protected boolean[][][] block;
  
  boolean block(int rotate,int row,int column){
    return block[rotate][row][column];
  }
}
