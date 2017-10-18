package vehicleproblem;

public class Vehicle {
		double speed = 0.0;
		
		public void Speed(double speed){
			this.speed = speed;
		}
		public boolean isRunning(){
			if(speed>0.0) return true;
			else return false;
		}
	
}
