//OPTIMISED - 1(SLIDING WINDOW: VARIABLE SIZE)
import java.util.*;

class FruitsIntoBasket {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,2,1,2,2};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int wstart = 0;
        int wend = 0;
        int ans = 0;
        //SLIDING WINDOW
        while(wend < n){
            map.put(arr[wend], map.getOrDefault(arr[wend], 0) + 1);
            //WINDOW SHRINK
                while(map.size() > 2){
                  map.put(arr[wstart], map.get(arr[wstart])-1);
                  if(map.get(arr[wstart]) == 0){
                      map.remove(arr[wstart]);
                  }
                  wstart++;
                }
            //WINDOW HIT
            ans = Math.max(ans, wend-wstart+1);
            wend++;
        }
        System.out.println(ans);
    }
}