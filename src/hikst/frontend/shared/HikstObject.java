package hikst.frontend.shared;

import java.io.Serializable;
import java.util.ArrayList;

public class HikstObject implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int ID;
	public String name;
	public Double effect;
	public Double voltage;
	public Double current;
	public int usage_pattern_ID;
	public Double latitude;
	public Double longitude;
	public Double self_temperature;
	public Double target_temperature;
	public Double base_area;
	public Double base_height;
	public Double heat_loss_rate;
	public ArrayList<Integer> sons = new ArrayList<Integer>();
	
	public HikstObject(){}
}
