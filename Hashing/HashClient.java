package Hashing;

public class HashClient {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pak", 150);
        map.put("Ind",200);
        map.put("Aus",100);
        map.display();
        System.out.println(map.get("Ind"));
    }

}
