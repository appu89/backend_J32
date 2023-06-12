 class ConParent {

    protected int parentVariable;

    public ConParent(int parentVariable) {
        this.parentVariable = parentVariable;
    }
}


class Child extends ConParent {
    private int childVariable;

    public Child(int parentVariable, int childVariable) {
        super(parentVariable);
        this.childVariable = childVariable;
    }

    public Child(int childVariable) {
        super(0); // Assuming a default value for the parent variable
        this.childVariable = childVariable;
    }

    public int getParentVariable() {
        return parentVariable;
    }

    public int getChildVariable() {
        return childVariable;
    }
}

class Test {
    public static void main(String[] args) {
        Child child1 = new Child(10, 20);
        System.out.println("Parent Variable: " + child1.getParentVariable());
        System.out.println("Child Variable: " + child1.getChildVariable());

        Child child2 = new Child(30);
        System.out.println("Parent Variable: " + child2.getParentVariable());
        System.out.println("Child Variable: " + child2.getChildVariable());
    }
}
