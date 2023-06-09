public class Animalysm {
    void Features() {
        System.out.println("it has tail");
    }
}
class dog extends Animalysm {
        void Features() {
             System.out.println("Dog has a tail");


        }

        public static void main(String[] args) {
            Animalysm a1 = new dog();
            a1.Features();

        }

    }
