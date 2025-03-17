import java.util.ArrayList;
import java.util.List;
/*
 * You are given an array items, where each items[i] = [typei, colori, namei]
 *  describes the type, color, and name of the ith item. You are also given a rule
 *  represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
 */
public class CountItems {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>();
        List<String> x = new ArrayList<String>();
        x.add("phone");
        x.add("blue");
        x.add("pixel");
        items.add(x);
        // x.add("computer");
        // x.add("silver");
        // x.add("lenovo");
        // items.add(["phone","gold","iphone"]);
        items.add(x);
        System.out.println(items);
        
    }
     public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;

        return count;
    }
}
