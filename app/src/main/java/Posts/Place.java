package Posts;

import java.util.ArrayList;

public class Place {
	private String placeName;
private double rate;
private String style;
private ArrayList<String>PlacesTastes=new ArrayList<String>();
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}
public String getStyle() {
	return style;
}
public String getPlaceName() {
	return placeName;
}
public void setPlaceName(String placeName) {
	this.placeName = placeName;
}
public void setStyle(String style) {
	this.style = style;
}
public void addNewTaste(String t)
{
	PlacesTastes.add(t);
}
public void wayToReach()
{
	
}


}
