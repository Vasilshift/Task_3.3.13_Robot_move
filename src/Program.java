
public class  Program {
    public static int x;
    public static int y;
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        moveRobot(robot, 5, 3);
    }
    public static void moveRobot(Robot robot, int toX, int toY) {
        if( toX >= x){
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (toX != x)
            robot.stepForward();
            x++;
        }
        if(toX < x) {
            while(robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while(toX != x) {
                robot.stepForward();
                x--;
            }
        }
        if(toY >= y){
            while (robot.getDirection() != Direction.UP){
                robot.turnLeft();
            }
            while (toY != y) {
                robot.stepForward();
                y++;
            }
        }
        if(toY < y) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (toY != y) {
                robot.stepForward();
                y--;
            }
        }
    }
}
