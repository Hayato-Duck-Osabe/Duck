package curriculum.b;

public class Animal {

    private String name;
    private double length;
    private int speed;
    
    
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return this.name;
    }
    
    
    
    public void setLength(double length) {
    	this.length = length;
    }
    public double getLength() {
    	return this.length;
    }
    
    
    
    public void setSpeed(int speed) {
    	this.speed = speed;
    }
    public int getSpeed() {
    	return this.speed;
    }


    public void showInfo() {
        System.out.println("動物名：" + name);
        System.out.println("体長：" + length + "m");
        System.out.println("速度：" + speed + "km/h");

    }
    
    
	

}
