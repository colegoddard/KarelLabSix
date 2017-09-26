
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void sortBeepers() {
        initialPosition();
        int beepersInColumn = 0;
        int smallestColumn = 0;
        int i = 0;
        for (i = 0; i < 9; i++) {
            int[] beepersInColumnStorage = new int[9];
            while (nextToABeeper()) {
                pickBeeper();
                beepersInColumn = beepersInColumn + 1;
                move();
            }
            beepersInColumnStorage[i + 0] = beepersInColumn;
            for (int value : beepersInColumnStorage){
                System.out.print(value);
            }
            beepersInColumn = 0;
            reposition();
        }
    }
    
    public void initialPosition() {
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
    }
    
    public void reposition() {
        turnRight();
        move();
        turnRight();
        while (frontIsClear()) {
            move();
        }
        turnRight();
        turnRight();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
}

