
import java.util.*;
class hashmap{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,1,2};
        Map<Integer,Integer> map= new HashMap<>();
        for(int ele:arr){
        map.put(ele,map.getOrDefault(ele,0)+1);
        }
        System.out.println(map);
        for(HashMap.Entry<Integer,Integer> map1:map.entrySet()){
        System.out.println(map1.getKey()+"->"+ map1.getValue());
    }
    }
}
