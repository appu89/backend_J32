 class StatVar {
    static int staticx;

        static {
            staticx = initializeStaticVariable();
        }

        static int initializeStaticVariable() {
            return 10;
        }

        static int getStaticx() {
            return staticx;
        }
    }


   class AnotherClass {
        public static void main(String[] args) {
            System.out.println("Static Variable: " + StatVar.getStaticx());
        }
    }


