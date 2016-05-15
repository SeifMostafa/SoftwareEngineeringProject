package Posts;

import java.util.ArrayList;

import Users.User;

public class Brand {
private String BrandName;
private User BrandOwner;
private ArrayList<String>ListOfTips = new ArrayList<String>();
private ArrayList<User>ListOfFollowers = new ArrayList<User>();
private ArrayList<Place>BrandBranches = new ArrayList<Place>();
private ArrayList<String>BrandTastes=new ArrayList<String>();
public String getBrandName() {
	return BrandName;
}
public void setBrandName(String brandName) {
	BrandName = brandName;
}
public User getBrandOwner() {
	return BrandOwner;
}
public void setBrandOwner(User brandOwner) {
	BrandOwner = brandOwner;
}
public void PostNewThings(String post) {
	
}
public void AddPlaces(Place place){
	BrandBranches.add(place);
}
public void AddingNewTaste(String taste){
	BrandTastes.add(taste);
}

}
