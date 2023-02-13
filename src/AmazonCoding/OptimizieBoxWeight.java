package AmazonCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptimizieBoxWeight {

    public List<Integer> optimize (int [] arr){

        Map<Integer, Integer> map = new HashMap<>();
        int totalSum = 0;
        for (int i : arr){
            totalSum+= i;
            map.put(i, map.getOrDefault(i,0) +1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer>  entry : map.entrySet()){
            list.add(entry);
        }

        // helper(list , 0,0,totalSum,new ArrayList<>());
        return res;
    }

    int minElements =  Integer.MAX_VALUE;
    int maxSum = 0;
    List<Integer> res = null;

    private void helper(List<Map<Integer,Integer>> list, int index, int currSum, int totalSum, List<Integer> curr ){
        //System.out.println(curr + " : " +  currSum + " : " +totalSum + " : " + (currSum > totalSum - currSum) + " : " + maxSum );

        if(currSum > totalSum-currSum){
            if(minElements>curr.size()){
                minElements =curr.size();

                res = new ArrayList<>(curr);
                maxSum=currSum;
            }else if( minElements ==curr.size()){
                    if (currSum>maxSum) {
                        minElements = curr.size();
                        res = new ArrayList<>(curr);
                        maxSum=currSum;

                    }
                }
                return;
            }

            if (index > curr.size()-1)
                return;

             Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) list.get(index);
                    List<Integer> temp = new ArrayList<>(curr);
                    for (int i = 0; i<entry.getValue(); i++){
                        temp.add(entry.getKey());
                    }

                    helper(list, index+1, entry.getValue()* entry.getKey(),totalSum,temp);
                    helper(list, index+1, currSum, totalSum, curr);
        }


        public static void main(String[] args){
        int [] arr = {5, 3, 2, 4, 1, 2};

        OptimizieBoxWeight o = new OptimizieBoxWeight();
        List<Integer>res = o.optimize(arr);
        System.out.println( res);

        }



    }



