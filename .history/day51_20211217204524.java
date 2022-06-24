interface BaseI {
    void method();
}

class BaseC {
    public void method() {
        System.out.println("basec method");
    }
}

class implC extends BaseC implements BaseI {
    public static void main(String[] args) {
        (new implC()).method();
    }
}