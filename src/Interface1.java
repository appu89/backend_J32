
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class InterClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Implementing method1 from Interface1");
    }

    @Override
    public void method2() {
        System.out.println("Implementing method2 from Interface2");
    }
}

class InterfacesMain {
    public static void main(String[] args) {
        InterClass obj = new InterClass();
        obj.method1();
        obj.method2();
    }
}
