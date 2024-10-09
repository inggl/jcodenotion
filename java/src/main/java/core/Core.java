package core;

public class Core {
    public static void main(String[] args) {
        /*
         * Data types
         * */
        {
            boolean bool = false;

            byte b = 100;
            //byte b1 = 300; // Doesn't compile

            short s = 100;

            int i = 100;
            //int i = 100L; // Doesn't compile!
            int i1 = 1_000_000;
            int i2 = 1____0;
            //int i = _10; // Doesn't compile!
            //int i = 10_; // Doesn't compile!

            long l = 100L; // 100.0l
            long l1 = 100; // Promoting int to long
            //long l2 = 2983746129; // Doesn't compile!
            long l2 = 2983746129L;

            float f = 100.0F; // 100.0f
            // float f = 100.0; // Doesn't compile!
            double d = 100.0; // 100.0
            double d1 = 1_0_0.0;
            //double d = 100_.0; // Doesn't compile!
            //double d = 100._0; // Doesn't compile!

            char c = 'A';
            char c1 = 65;
            System.out.printf("%s %s", c, c1); // A A
        }

        /*
         * String
         * */
        {
            // String Pool
        }

        /*
         * StringBuilder
         * */
        {

        }

        /*
         * Array
         * */
        {

        }
    }
}