package Risk;

import java.util.Vector;


public class RiskContinent {
	
	private String name;
	private Vector<Integer> territories;
	private int value;
	RiskTerritory t;
	
	
	RiskContinent(String nm, Vector<Integer> t, int v){
		name = nm;
		value = v;
		territories = t;
	}
	
	public String getName(){
		return name;
	}
	
	public Vector<Integer> getTerritories(){
		return territories;
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isTerritoryOf(RiskTerritory t){
		return (territories.contains(t.getId()));
	}
	
	public boolean isContinentCaptured(RiskPlayer p){
		Vector<Integer> t1 = new Vector<Integer>();
		Vector<RiskTerritory> t2 = p.getOccupiedTerritories();
                
		for (int c = 0; c < t2.size(); c++)
			t1.add(t2.elementAt(c).getId());              
		for (int i = 0; i < territories.size(); i++){
                    if(!t1.contains(territories.elementAt(i)))
			return false;
		}//end for loop		
	return true; 
	}

}
