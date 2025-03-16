package Bronze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bronze5_30087 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		List<String> seminar = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			seminar.add(s.nextLine());
		}
		s.close();
		
		Map<String, String> seminarRooms = new HashMap<>();
        seminarRooms.put("Algorithm", "204");
        seminarRooms.put("DataAnalysis", "207");
        seminarRooms.put("ArtificialIntelligence", "302");
        seminarRooms.put("CyberSecurity", "B101");
        seminarRooms.put("Network", "303");
        seminarRooms.put("Startup", "501");
        seminarRooms.put("TestStrategy", "105");
        
        for (String name : seminar) {
        	System.out.println(seminarRooms.getOrDefault(name, "Unknown Room"));
        }
	}
}
