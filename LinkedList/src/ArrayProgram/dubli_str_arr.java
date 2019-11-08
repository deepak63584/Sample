package ArrayProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class dubli_str_arr 
{
	public static void main(String[] args) {
		 
        // String Arrays
        String[] strArrays = {
                "Cabbage", 
                "Kale",
                "Radish",
                "Kale",
                "Garlic",
                "Beetroot",
                "Garlic",
                "Carrot",
                "Kale"
        };
 
        // First convert to List
        java.util.List<String> list = Arrays.asList(strArrays);
 
        // just empty HashSet object
        Set<String> set = new HashSet<String>();
 
        // iterate through List
        for(String str : list) {
            // add element to Set/HashSet
            boolean flagForDuplicate = set.add(str);
 
            if(!flagForDuplicate) {
                System.out.println(str + " is duplicate element");
            }
        }
    }

}
