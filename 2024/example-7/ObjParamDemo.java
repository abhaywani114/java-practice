class ObjParam {
    String data;
    int someNumber;
    ObjParam(String data, int someNumber) {
        this.data = data;
        this.someNumber = someNumber;
    }
    boolean isEqual(ObjParam obj) {
        return this.data == obj.data && this.someNumber == obj.someNumber;    
    }
}

class ObjParamDemo {
    public static void main(String[] args) {
        ObjParam obj1 = new ObjParam("Samsung", 1);
        ObjParam obj2 = new ObjParam("Iphone", 3);
        ObjParam obj3 = new ObjParam("Samsung", 1);
        System.out.println("Is obj1 == obj2: " + obj1.isEqual(obj2));
        System.out.println("Is obj1 == obj3: " + obj1.isEqual(obj3));
    }
}