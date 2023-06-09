abstract class Department {
    abstract  int getDepartmentsize();}
 class store extends Department {

    int getDepartmentsize() {
        int size = 80;
        System.out.println("department size " + size);
        return size;
    }

     public static void main(String[] args) {
          store d1= new store() ;
          d1.getDepartmentsize();
    }


     }




