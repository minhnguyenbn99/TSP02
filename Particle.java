package tsppso;

import java.util.ArrayList;

public class Particle {
	int name;
    int data[]; 
    double localBest = 0;
    double velocity = 0.0;
    ArrayList<City> circle = new ArrayList<>();
    
    public Particle(int CITY_COUNT) {
        data= new int[CITY_COUNT];
        this.localBest = 0;
        this.velocity = 0.0;
    }

    public int compareTo(Particle particle) {
        if (this.getLocalBest() < particle.getLocalBest()) {
            return -1;
        } else if (this.getLocalBest() > particle.getLocalBest()) {
            return 1;
        } else {
            return 0;
        }
    }
    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
    
    public int data(final int index) {
        return this.data[index];
    }

    public void data(final int index, final int value) {
        this.data[index] = value;
    }
    
    public int[] getmData() {
        return data;
    }

    public void setmData(int[] data) {
        this.data = data;
    }

    public double getLocalBest() {
        return localBest;
    }

    public void setLocalBest(double localBest) {
        this.localBest = localBest;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }   
  
    @Override
    public String toString() {
        return "Particle{ " +  name +  " }";
    }
    
}
