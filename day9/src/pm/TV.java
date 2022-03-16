package pm;

public interface TV {
		
	public int Min_VOLUME =0;
	public int Max_VOLUME =100;
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);	


}


