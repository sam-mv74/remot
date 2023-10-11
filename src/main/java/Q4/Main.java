package Q4;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer,String>myHashMap=new MyHashMap<>();
        myHashMap.put(1,"samaneh");
        myHashMap.put(2,"sahar");
        myHashMap.put(1,"ali");
//        //contains key
        System.out.println(myHashMap.containsKey(1));
        System.out.println(myHashMap.containsKey(4));
//        //is empty
        System.out.println(myHashMap.isEmpty());
//        //all of map
        System.out.println(myHashMap);
//        //replace
        myHashMap.replace(1,"sama");
        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.size());
    }
}
