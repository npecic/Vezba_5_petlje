package com.company;

public class Main {

    public static void main(String[] args) {
/**
 * Primer 1 - for petlja
 */

//        for (int i = 1;i>-11;i--) {
//            System.out.println("Krug " + i);
//        }
//        System.out.println("Kraj");

        /**
         * Primer 2 - for petlja
         */

//        for (int i = 20,j = 5;i+j>20;i--,j++) { // deadlock petlja
//            System.out.println("Krug " + i);
//            if (i == 17) {  // ogranicavamo petlju
//
//                break;
//            }
//        }
//        System.out.println("Kraj");

        /**
         * Primer 3 - for petlja + brojac x
         */

//        int x = 0;
//        for (int i = 20,j = 5;i+j>20;i--,j++) {
//            x++;
//            if (x==50){ // nas brojac
//                break;
//            }
//        }

        /**
         * Primer 4 - for petlja + continue
         */
//
//        int x = 0;
//        for (int i = 1;i<11;i++) {
//            System.out.println("Cao" +i);
//            if (i==7){
//                continue;
//            }
//            if (i==9){
//                break;
//            }
//            System.out.println("Cao" +i);
//        }


        /**
         * Primer 5 - While petlja +
         */
//        int x = 5;
//
//        while (x<50){
//            System.out.println("Cao");
//            x++;
//            if (x==10){
//                break;
//            }
//        }
//


        /**
         * Primer 6 - While petlja + continue
         */
//        int x = 5;
//        spoljasnja:
//        while (true){
//            unutrasnja:
//            while(true){
//                System.out.println("Petlja 2");
//                x++;
//                if(x==7){ // x nikad nece biti 7
//                    break spoljasnja;
//                }
//            }
//
//            }

        /**
         * Primer 7 - While petlja
         */
        int x = 0;

        for(int i = 1; i<11; i++){
                for(int j = 1; j<11;j++)
                x++;
                System.out.println("Cao "+x);
            }
        }

        }



