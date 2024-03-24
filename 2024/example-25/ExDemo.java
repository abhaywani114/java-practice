class CustomException extends Exception {
    String msg = "Some error occured";
    CustomException() {

    }
    CustomException(String msg) {
        this.msg = msg;
    }
    public String toString() {
        return "Error: " + this.msg;
    }
}
class Ex5Demo1 {
    public static void main(String[] args) throws CustomException {
        throw new CustomException("Normal exit");
    }
}

class Ex5Demo2 {
    public static void main(String[] args) throws CustomException {
        throw new CustomException();
    }
}

class Ex5Demo3 {
    public static void main(String[] args) {
        try {
            throw new CustomException("Try/catch error exception");
        } catch (CustomException e) {
            System.err.println("Exceptiom:");
            System.err.println(e);
            e.printStackTrace();
        }
    }
}