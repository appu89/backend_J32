public class RotateString {
    public static void main(String[] args) {
            String str1 = "JavaJ2eeStrutsHibernate";
            String str2 = "StrutsHibernateJavaJ2ee";

            boolean isRotation = checkRotation(str1, str2);

            System.out.println("Is one string a rotation of another? " + isRotation);
        }

        public static boolean checkRotation(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            String concatenated = str1 + str1;

            return concatenated.contains(str2);
        }
    }

