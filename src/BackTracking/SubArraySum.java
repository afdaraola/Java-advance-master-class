package BackTracking;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        int N = 4, S = 6;
        int A[] = {1, 5, 7, 1};

        System.out.println(getPairsCount(A, N, S));
    }

    public static ArrayList<Integer> subArraySum(int[] arr, int n, int s) {

        int i, count = 0, sum = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (i = 0; i < n; i++) {
            if (s == 0) {
                break;
            }
            sum += arr[i];

            while (sum > s) {
                System.out.println("i'm here " + i);
                sum -= arr[i];
                count++;
            }

            if (sum == s) {
                System.out.println("counnt..." + count);

                list.add(0, count + 1);
                list.add(1, i + 1);
                return list;
            }
        }
        while (list.isEmpty()) {
            list.add(-1);
        }
        return list;
    }


    public static int getPairsCount(int[] arr, int n, int k) {
        // code here
//        int count = 0;
//        for(int i = 0; i < n ; i++){
//            for(int j=i+1; j< n; j++){
//                if(arr[i] + arr[j] == k){
//                    System.out.println("Iterative- "+arr[i]);
//                    count++;
//                }
//            }
//        }


        int count = 0;
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (m.containsKey(k - arr[i])) {
                System.out.println("here 1: "+  m.get(k-arr[i]));
                count += m.get(k - arr[i]);
            }

            if (m.containsKey(arr[i])) {
                System.out.println("here  2: "+ arr[i]);
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                System.out.println("here 3: "+ arr[i]);
                m.put(arr[i], 1);
            }

        }
        return count;
    }
}

