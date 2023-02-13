package BackTracking;

public class MinNumberJump {
    public static void main(String[] args) {

      int  arr[] = {2 ,3, 1, 1, 2, 4, 2, 0, 1, 1};

        System.out.println(minJumps(arr));
    }

   public static int minJumps(int[] arr){
        // your code here
        int count =0,  current=0, max=0;

        for(int i = 0; i < arr.length;i++){

            max = Math.max(max,i+arr[i]);
            System.out.println("im her max "+ max);
            if(current>=arr.length-1){
                break;
            }else if(max<=i){
                return -1;
            }else if(i==current){
                System.out.println("im here "+ i);
                current=max;
                count++;

            }
        }
        return count;
    }
}
