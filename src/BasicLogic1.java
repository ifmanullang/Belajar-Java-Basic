import java.util.Arrays;

public class BasicLogic1 {
    public static void main(String[] args) {
        soal01(9);
        soal02(9);
        soal03(9);
        soal04(9);
        soal05(9);
//        soal06(9);
        soal07(9);
        soal08(9);
        soal09(9);
        soal10(9);
    }

    //Soal Basic 1 nomor 1
    public static void soal01(int n) {
        // 1 2 3 4 5 6 7 8 9
        int[] deret = new int[n];
        for (int i = 0; i < deret.length; i++) {
            if (i == 0) {
                deret[i] = 1;
            } else if (i >= 1){
                deret[i] = i+1;
            }

            System.out.print(+ deret[i] + "\t");
        }
        System.out.println("Soal Basic 1 nomor 1");
    }

    // Soal Basic 1 Nomor 2
    public static void soal02 (int n){
        // 1 3 2 6 3 9 4 12 5
        int[] deret = new int[n];
        for (int i=0; i< deret.length; i++){
            if (i == 0){
                deret[i] = 1;
            }else if(i == 1) {
                deret[i] = 3;
            }else if (i%2 == 0){
                deret[i] = deret[i-2]+1;
            }else{
                deret[i] = deret[i-2]+3;
            }
            System.out.print(deret [i] + "\t");
        }
        System.out.println("Soal Basic 1 nomor 2");
    }

        //Soal Basic 1 nomor 3
         public static void soal03(int n) {
              //0 2 4 6 8 10 12 14 16 18
             int[] deret = new int[n];
             for (int i = 0; i < deret.length; i++) {
                 if (i == 0) {
                     deret[i] = 0;
                 }else{
                     deret[i] = i*2;
                 }
                 System.out.print(+ deret[i] + "\t");
             }
             System.out.println("Soal Basic 1 nomor 3");
         }

         //Soal Basic 1 nomor 4
         public static void soal04(int n){
              int[] deret = new int[n];
              // 1  1  2  3  5  8 13  21
              for (int i = 0; i < deret.length; i++){
              if(i == 0 || i == 1){
                  // deret ke i => 0, 1
                  deret[i] = 1;
              }else {
              deret[i] = deret[i-1] + deret[i-2];

              System.out.print( deret[i] +"\t");
        }

    }
             System.out.println("Soal Basic 1 nomor 4");
}

            //Sola basic 1 Nomor 5
            public static void soal05(int n) {
                int[] deret = new int[n];
                // 1  1  1  3  5  9  17  31  57
                for (int i = 0; i < deret.length; i++) {
                    if (i == 0 || i == 1 || i == 2) {
                        // deret ke i => 0, 1
                        deret[i] = 1;
                    } else {
                        deret[i] = deret[i - 1] + deret[i - 2] + deret[i - 3];
                    }
                    System.out.print(deret[i] + "\t");
                }
                System.out.println("Soal Basic 1 nomor 5");
            }

//                public static void soal06(int n) {
//                    int[] deret = new int[n];
//                    // 2  3  5  7  11  13  17  19  23
//                    for (int i = 2; i <= 23; i++) {
//                            System.out.print(i + "\t");
//                        }
//
//                    }


            //Soal Basic 1 nomor 7
           public static void soal07(int n){
                // A B C D F G H I
                char[] deret = new char[n];
                int it = 64;
                for(int i=0; i<n; i++){
                it++;
                deret[i] = (char)it;
            System.out.print(deret[i] + "\t");
        }
            System.out.println("Soal Basic 1 nomor 7");
    }

            public static void soal08(int n){
                String[] deret = new String[n];
                int it = 64;
                for(int i=0; i<n; i++){
                it++;
                if(i%2 == 0){
                deret[i] = String.valueOf((char) it);
                }else{
                deret[i] = String.valueOf(i+1);
            }
            System.out.print(deret[i] + "\t");
        }
            System.out.println("Soal Basic 1 nomor 8");
    }

        //Soal Basic 1 nomor 9
        public static void soal09 ( int n){
            int[] deret = new int[n];
            // 1 3 9 27 81 243 729 2187 6561
            for (int i = 0; i < deret.length; i++) {
                if (i == 0) {
                    // deret ke i => 0, 1
                    deret[i] = 1;
                } else if (i == 1) {
                    // deret ke i => 0, 1
                    deret[i] = (int) Math.pow(3, i);
                } else if (i > 1 && i <= 9) {
                    deret[i] = (int) Math.pow(3, i);
                }

                System.out.print(deret[i] + "\t");
            }
            System.out.println("Soal Basic 1 nomor 9");
        }

        //Soal Basic 1 nomor 10
        public static void soal10 ( int n){
            int[] deret = new int[n];
            // 0 1 8 27 64 125 216 343 512
            for (int i = 0; i < deret.length; i++) {
                if (i == 0) {
                    deret[i] = 0;
                } else if (i == 1) {
                    deret[i] = 1;
                } else if (i >= 2 && i <= 8) {
                    deret[i] = (int) Math.pow(i, 3);
                }
                System.out.print(deret[i] + "\t");
            }
            System.out.println ("Soal Basic 1 nomor 10");
        }

}
