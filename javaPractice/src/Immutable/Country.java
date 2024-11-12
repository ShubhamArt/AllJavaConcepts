package Immutable;

import java.util.ArrayList;

public final class Country {
    private final String countryName;
    private final ArrayList listOfStates;

    public Country(String countryName, ArrayList listOfStates){
        super();
        this.countryName=countryName;
        ArrayList<Object> tempList = new ArrayList<>(listOfStates);
        this.listOfStates=tempList;
    }

    public String getCountryName() {
        return countryName;
    }
    public ArrayList getListOfStates(){
        //returning cloned object
        return (ArrayList) listOfStates.clone();
    }
}
