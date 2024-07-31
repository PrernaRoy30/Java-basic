/*Design a class hierarchy for different types of vehicles (e.g., Car, Bike, Truck) with common
attributes like make, model, and year. Implement inheritance to avoid code duplication.
Include a superclass "Vehicle" with methods like start() and stop(). Override these
methods in subclasses to provide specific implementations for each type of vehicle.*/

class vehical
{
	String make,model;
	int year;
	vehical(String mk,String md,int yr)
	{
		this.make = mk;
		this.model = md;
		this.year = yr;
	}
	void start()
	{
		System.out.println("Vehical Started : " +this.make);
	}
	void stop()
	{
		System.out.println("Vehical Stop : " +this.make);
	}
}
class car extends vehical
{
	car(String mk,String md,int yr)
	{
		super(mk,md,yr);
	}
	void start()
	{
		super.start();
		//System.out.println("Vehical Started : " +this.make);
	}
	void stop()
	{
		super.stop();
		//System.out.println("Vehical Stop : " +this.make);
	}
}
class bike extends vehical
{
	bike(String mk,String md,int yr)
	{
		super(mk,md,yr);
	}
	void start()
	{
		super.start();
		//System.out.println("Vehical Started : " +this.make);
	}
	void stop()
	{
		super.stop();
		//System.out.println("Vehical Stop : " +this.make);
	}
}
class truck extends vehical
{
	truck(String mk,String md,int yr)
	{
		super(mk,md,yr);
	}
	void start()
	{
		super.start();
		//System.out.println("Vehical Started : " +this.make);
	}
	void stop()
	{
		super.stop();
		//System.out.println("Vehical Stop : " +this.make);
	}
}
class mainvehical
{
	public static void main(String args[])
	{
		car c = new car("tata","nano",2015);
		c.start();
		c.stop();
		bike b = new bike("bajaj","pulser",2015);
		b.start();
		b.stop();
		truck t = new truck("Ashok","Leyland",2015);
		t.start();
		t.stop();
	}
}
	
	

		