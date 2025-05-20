package sem1;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class Leet {
	
	
	// Satelite Fuel Optimizer Program
			
	// the respective indices are the tanks
	// and the value they hold are the fuel amounts
	

	
	public List<int[]> twoSum(int[] fuelAmounts, int preciseTotalForManeuver) {
        HashMap<Integer, List<Integer>> reserve = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        
        if (fuelAmounts == null || fuelAmounts.length < 2) {
            return new ArrayList<>();
        }
        
        for (int fuelcheck = 0; fuelcheck < fuelAmounts.length; fuelcheck++) {
            int checking = preciseTotalForManeuver - fuelAmounts[fuelcheck];
            if (reserve.containsKey(checking)) {
                List<Integer> complementIndices = reserve.get(checking);
                
                for (int index : complementIndices) {
                    result.add(new int[] {index, fuelcheck});
                }
            }
            // Add current fuel amount and index to the map
            reserve.computeIfAbsent(fuelAmounts[fuelcheck], k -> new ArrayList<>())
                   .add(fuelcheck);
        }
        return result;
    }


	public static void main(String[] args) {
	    Leet leet = new Leet();
	    int[] fuelTanks = {10, 10, 10};
	    int target = 20;
	    List<int[]> pairs = leet.twoSum(fuelTanks, target);
	    for (int[] pair : pairs) {
	        System.out.println("[" + pair[0] + ", " + pair[1] + "]");
	    }
	}
	
	 

	
}


