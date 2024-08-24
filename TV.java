
public class TV {

	int channel = 1;
	int volume = 1;
	boolean isOn;
	
	public TV() { }
	public void turnOn() { isOn = true; }
	public void turnOff() { isOn = false; }
	public void setChannel(int newChannel) { 
		if (isOn && channel >= 1 && channel <= 120) {
			channel = newChannel;
		} 
	}
	public void setVolume(int newVolumeLevel) {
		if (isOn && volume >= 1 && volume <= 7) {
			volume = newVolumeLevel;
		}
	}
	public void channelUp() { if (isOn & channel < 120) channel++;}
	public void channelDown() { if (isOn & channel > 1) channel--;}
	public void volumeUp() { if (isOn & volume < 7) volume++;}
	public void volumeDown() { if (isOn & volume > 1) volume--;}
	
	public String toString() {
		return "This TV is " + isOn + "\nTV channel: " + channel + "/120" + "\nTV volume: " + volume + "/7\n";
	}
	
	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.channelUp();
		tv.volumeUp();
		tv.volumeUp();
		System.out.println(tv);
		
		TV tv1 = new TV();
		tv1.turnOn();
		for (int i = 0; i < 6; i++) {
			tv1.channelUp();
		}
		tv1.volumeUp();
		System.out.println(tv1);
	}

}