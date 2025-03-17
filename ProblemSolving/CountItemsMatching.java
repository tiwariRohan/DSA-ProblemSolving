import java.util.ArrayList;
import java.util.List;

public class CountItemsMatching {
    public static void main(String[] args) {
        List<List<String>> devices= new ArrayList<>();
        //{{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}}
        List<String> device1 = new ArrayList<>();
        device1.add("phone");
        device1.add("blue");
        device1.add("pixel");
        devices.add(device1);

        // Add the second device
        List<String> device2 = new ArrayList<>();
        device2.add("computer");
        device2.add("silver");
        device2.add("lenovo");
        devices.add(device2);

        // Add the third device
        List<String> device3 = new ArrayList<>();
        device3.add("phone");
        device3.add("gold");
        device3.add("iphone");
        devices.add(device3);
        System.out.println(countMatches(devices, "color", "silver"));

    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            List<String> device = items.get(i);
            for (int j = 0; j < device.size(); j++) {
                if (ruleKey.equals("color")) {
                    if (device.get(1).equals(ruleValue)) {
                        count++;
                    }
                    break;
                    
                }
                if (ruleKey.equals("name")) {
                    if (device.get(2).equals(ruleValue)) {
                        count++;
                    }
                    break;
                }
                if (ruleKey.equals("type")) {
                    if (device.get(0).equals(ruleValue)) {
                        count++;
                    }
                    break;
                }
            }
        }
        return count;
}
}
