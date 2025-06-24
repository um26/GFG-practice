

// User function Template for Java
// User function Template for Java

/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        //Pair<Integer,Integer> pair= int Pair<Integer,Integer>;
        int min=0,max=0;
        for(int i=1;i<arr.length;i++){
            if (arr[min]>arr[i]){
                min=i;
            }
        }
        for(int i=1;i<arr.length;i++){
            if (arr[max]<arr[i]){
                    max=i;
                }
        }
        // pair.getKey=min;
        // pair.getValue=max;
        return new Pair(arr[min],arr[max]);
    }
}
