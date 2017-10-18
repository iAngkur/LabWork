package vehicleproblem;

public class VehicleTestProblem {

	public static void main(String[] args) {
		Vehicle[] vehicles = {new Car(), new Bus(), new Ship(), new Boat(), new Aeroplane(), new Helicopter()};
		 
        for (int i = 0; i < vehicles.length; i++)
        {
        	
        	if(vehicles[i] instanceof Car)
            {
        		vehicles[i].Speed(10.0);
                boolean b = vehicles[i].isRunning();
                if(b==true)
                	vehicles[i].CarRunning();
            }
        	else if(vehicles[i] instanceof Bus)
            {
        		vehicles[i].Speed(10.0);
                boolean b = vehicles[i].isRunning();
                if(b==true) 
                	vehicles[i].BusRunning();
            }
        	else if(vehicles[i] instanceof Ship)
            {
        		vehicles[i].Speed(10.0);
                boolean b = vehicles[i].isRunning();
                if(b==true)
                	vehicles[i].ShipRunning();
            }
        	else if(vehicles[i] instanceof Boat)
            {
        		vehicles[i].Speed(10.0);
                boolean b = vehicles[i].isRunning();
                if(b==true)
                	vehicles[i].BoatRunning();
            }
        	else if(vehicles[i] instanceof Aeroplane)
            {
        		vehicles[i].Speed(10.0);
                boolean b = vehicles[i].isRunning();
                if(b==true)
                	vehicles[i].AeroplaneRunning();
            }
        	else if(vehicles[i] instanceof Helicopter)
            {
        		vehicles[i].Speed(10.0);
                boolean b = vehicles[i].isRunning();
                if(b==true)
                	vehicles[i].HelicopterRunning();
            }
     
        }
		
	}

}
