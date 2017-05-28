package objectOrientedPrograming;

public class WindowsXP { 
	private String osName="Windows XP";

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}
	public void displayScreen(){
		System.out.println(osName+" display screen based on monitor size");
		}
	public void controlScreen(){
		System.out.println(osName+" control screen using keyboard and mouse");
		}
	public void providesMSofficeForFree(){
		System.out.println(osName+" provides MS office for free");
		
	}

}
