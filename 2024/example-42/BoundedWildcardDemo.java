class TwoD {
    int x;
    int y;
    TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return  "X: " + x + " Y: " + y;
    }
}

class ThreeD extends TwoD {
    int z;
    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public String toString() {
        return  super.toString() + " Z: " + z;
    }
}

class FourD extends ThreeD {
    int v;
    FourD(int x, int y, int z, int v) {
        super(x, y, z);
        this.v = v;
    }
    public String toString() {
        return  super.toString() + " V: " + v;
    }
}

class BoundedWildCard<T> {
    T obj;
    BoundedWildCard(T obj) {
        this.obj = obj;
    }

    void printCoordinate() {
        System.out.println(obj);
    }
}

class BoundedWildcardDemo {
    public static void main(String[] args) {
        BoundedWildCard<ThreeD> threeD  = new BoundedWildCard<ThreeD>(new ThreeD(30, 20, 10));
        threeD.printCoordinate();
    }
    
}