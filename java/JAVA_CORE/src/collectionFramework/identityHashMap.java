package collectionFramework;

import java.util.*;

public class identityHashMap {
    static void main() throws InterruptedException {
        String key1= new String("Key");
        String key2= new String( "Key");
        Map<String,Integer>map= new IdentityHashMap<>();
        map.put(key1,1);
        map.put(key2,2);
        System.out.println(map);





    }
}
