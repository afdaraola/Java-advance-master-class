package QuizOne;

import java.lang.reflect.Array;

public class ArrayInitilizer {

    public void ArrayExample (){

        int array[] = {1,2,3,4,5};

        int arrays[] = {1,2,3,4,5};

//        String arraya[] = new String[] {
//                "Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda" };


        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] = i + 2);
        }


//        for(int i = 0; i < 2; i++){
//
//         for( int j = 0; j < 5; j++){
//
//                System.out.println(  array[i][j] = j + 1 );
//           }
//       }
    }


    public static void main(String[] args) {
        ArrayInitilizer init = new ArrayInitilizer();

        init.ArrayExample();

    }
}
