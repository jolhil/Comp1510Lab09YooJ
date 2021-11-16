/**
 * 
 */
package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author junsangyoo
 *
 */
public class CatHotel {
    
    /** List of cats*/
    ArrayList<Cat> catList = new ArrayList<Cat>();
    
    /** Hotel list.*/
    ArrayList<String> hotelList;
    
    /** Hotel name.*/
    private String hName;
    
    /**
     * Constructor to sets the hotel's name.
     * 
     * @param hName hotel name as a string
     */
    public CatHotel(String hName) {
        this.hName = hName;
        hotelList = new ArrayList<String>();
        
    }
    
    public void addCat (Cat cat) {
        catList.add(cat);
    }
    
    public void removeAllGuests() {
        catList.clear();
    }
    
    public int guestCount() {
        return catList.size();
    }
    
    public int removeOldGuests(int limitAge) {
        Iterator<Cat> catIterator = catList.iterator();
        int eNum = 0;
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next();
            if (temp.getAge() > limitAge) {
                catList.remove(temp);
                eNum++;
            }
        }
        return eNum;
    }
    
    public String printGuestList() {
        
    }
}
