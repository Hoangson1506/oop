import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Appearances {
    public static <T> int sameCount(Collection<T> a, Collection<T> b) {
        Map<T, Integer> mapA = new HashMap<>();
        Map<T, Integer> mapB = new HashMap<>();
        for(T element : a) {
            mapA.put(element, mapA.getOrDefault(element, 0) + 1);
        }
        for(T element : b) {
            mapB.put(element, mapB.getOrDefault(element, 0) + 1);
        }
        int count = 0;
        for(Map.Entry<T, Integer> entry : mapA.entrySet()) {
            T element = entry.getKey();
            Integer appearancesInA = entry.getValue();
            Integer appearancesInB = mapB.getOrDefault(element, 0);
            if(appearancesInA == appearancesInB) {
                count++;
            }
        }
        return count;
    }
}
