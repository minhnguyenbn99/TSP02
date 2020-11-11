package tsppso;

public class City {
	int x = 0;
    int y = 0;
    static int count = 0;
    String cityName;
    public City() {
    	count ++;
    	this.cityName = "City " + Integer.toString(count);
    }
    public City(int x, int y) {
    	this.x = x;
    	this.y = y;
    	count++;
    	
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo(City city) {
        return Math.sqrt(((getX() - city.getX()) * (getX() - city.getX())) + ((getY() - city.getY()) * (getY() - city.getY())));
}
    public String toString(){
    	return this.cityName ;
    }
}