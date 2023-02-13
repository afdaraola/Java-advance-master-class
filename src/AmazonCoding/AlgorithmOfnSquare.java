package AmazonCoding;

public class AlgorithmOfnSquare {

    public static void main(String[] args) {

        int[] arrays ={1,2,3};

        System.out.println(hasDuplicateValue(arrays));
    }

    public static boolean hasDuplicateValue(int[] array){

        int steps = 0;

        for (int i=0; i< array.length; i++){
            for (int j=0; j<array.length; j++){
                steps++;
                if (i != j &&  array[1] ==array[j]) {

                    System.out.println("Steps - "+ steps);

                    return true;
                }
            }

        }
        System.out.println("Steps - "+ steps);
        return  false;
    }
}
