package chapter1;
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    int priceCode;
    Price price;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        setPriceCode(newpriceCode);
    }
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
    public String getTitle (){
        return title;
    }
    
   int getFrequentRenterPoints(int daysRented) {
    	return price.getFrequentRenterPoints(daysRented);
    	}
    
}