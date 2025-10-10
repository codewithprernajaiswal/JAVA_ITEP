// import java.util.*;

// class Test {
//     public static void main(String args[]) {
       
//         HashMap<String, ArrayList<String>> hm = new HashMap<>();

        
//         hm.put("Furniture", new ArrayList<>());
//         hm.get("Furniture").add("Chair");
//         hm.get("Furniture").add("Table");
//         hm.get("Furniture").add("Bed");

       
//         hm.put("Cosmetic", new ArrayList<>());
//         hm.get("Cosmetic").add("Vaseline");
//         hm.get("Cosmetic").add("Lipstick");
//         hm.get("Cosmetic").add("Eyeliner");

      
//         hm.put("Electronic", new ArrayList<>());
//         hm.get("Electronic").add("Mobile");
//         hm.get("Electronic").add("Charger");
//         hm.get("Electronic").add("Lights");

      
//         Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
//         for (Map.Entry<String, ArrayList<String>> e : entries) {
//             System.out.println(e.getKey() + " = " + e.getValue());
//         }
//     }
// }


import java.util.ArrayList;
import java.util.HashMap;

class Main{
    public static void main(String[] args) {
        
      HashMap<String,ArrayList> category= new HashMap<String,ArrayList>();
         
          ArrayList<String> furnitureList = new ArrayList<>();
        furnitureList.add("Chair");
        furnitureList.add("Table");
        furnitureList.add("bed");

        // HashMap me put kiya
        category.put("furniture", furnitureList);

       // category.put("furniture", new ArrayList<>(Arrays.asList("Chair", "Table", "bed")));

        ArrayList<String> cousmatics = new ArrayList<>();
        cousmatics.add("vasline");
        cousmatics.add("eyeliner");
        cousmatics.add("listick");

        // HashMap me put kiya
        category.put("cousmatics", cousmatics);

        ArrayList<String> electronic = new ArrayList<>();
        electronic.add("vasline");
        electronic.add("eyeliner");
        electronic.add("listick");

        // HashMap me put kiya
        category.put("electronic", electronic);
         Set<Map.Entry<String, ArrayList<String>>> entries = category.entrySet();
        for (Map.Entry<String, ArrayList<String>> e : entries) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}





