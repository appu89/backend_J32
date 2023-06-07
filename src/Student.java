public class Student {

String name= "Apoorva";
    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public static void main(String[] args)
    {
   Student s1 = new Student();
   System.out.println("Name before Change  " + s1.getName());
   System.out.println("Name After setting " + s1.setName("Appu"));
    }
}
