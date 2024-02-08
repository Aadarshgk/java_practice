public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(int a, int b){
        return Math.sqrt(Math.pow(x-a,2)+ Math.pow(y-b,2));
    }

    public double distance(Point a){
        return Math.sqrt(Math.pow(x-a.x,2)+ Math.pow(y-a.y,2));

    }
}
