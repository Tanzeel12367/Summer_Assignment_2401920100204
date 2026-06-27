class Point {
    private int x, y;

    public Point(){ x=0; y=0; }
    public Point(int x, int y){ this.x=x; this.y=y; }

    public void setX(int x){ this.x=x; }
    public void setY(int y){ this.y=y; }
    public void setXY(int x, int y){ this.x=x; this.y=y; }

    public void print(){
        System.out.println("Point: ("+x+", "+y+")");
    }

    public static void main(String[] args){
        Point p1 = new Point();
        p1.setXY(3,4);
        p1.print();

        Point p2 = new Point(7,8);
        p2.print();
    }
}
