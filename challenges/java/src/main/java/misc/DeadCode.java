package misc;

public class DeadCode {

    public class IdentifyProblemsInCode {

        public void howToDoInJava_method1() {
            System.out.println("how to do");
            return;
//            Won't compile
//            System.out.println("in java");
        }

        public void howToDoInJava_method2() {
            System.out.println("how to do");
            if (true) {
                return;
            }
            System.out.println("in java");
        }

        public void howToDoInJava_method3() {
            System.out.println("how to do");
            while (true) {
                return;
            }
//            Won't compile
//            System.out.println("in java");
        }
    }

}
