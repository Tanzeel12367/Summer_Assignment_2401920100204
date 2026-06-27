class Box {
    double length, breadth;

    Box(double l, double b){
        length=l;
        breadth=b;
    }

    double area(){
        return length*breadth;
    }
}

class Box3D extends Box {
    double height;

    Box3D(double l, double b, double h){
        super(l,b);
        height=h;
    }

    double volume(){
        return length*breadth*height;
    }

    public static void main(String[] args){
        Box b = new Box(4,5);
        System.out.println("Area: "+b.area());

        Box3D b3 = new Box3D(4,5,6);
        System.out.println("Area: "+b3.area());
        System.out.println("Volume: "+b3.volume());
    }
}
