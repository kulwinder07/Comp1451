package bcitca.kulwinder.sam.comp1451;

public class Main {
	public static final String IPOD_PURPOSE   = "music";
    public static final String IPAD_PURPOSE   = "learning";
    public static final String IPHONE_PURPOSE = "talking";

	public static void main(String[] args) {
		Main main = new Main();
		main.IDeviceTest();
		main.ipodEquals();
		main.ipadEquals();
		main.iphoneEquals();
		
	}
	
	public void IDeviceTest() {
		 IPod   ipod   = new IPod   ("music", 17, 25.0);
	        IPad   ipad   = new IPad   ("learning", false, "iPadOS 14");
	        IPhone iphone = new IPhone ("taking", 200.0, "Bell");
	        
	        ipod.printDetails();
	        ipad.printDetails();
	        iphone.printDetails();
	        System.out.println(ipod.toString());
	        System.out.println(ipad.toString());
	        System.out.println(iphone.toString());
	}
	
	public void ipodEquals() {
		IPod   ipod   = new IPod   ("music", 17, 25.0);
		IPod   ipod1   = new IPod   ("music", 17, 25.0);
		IPod   ipod2  = new IPod   ("music", 17, 25.0);
		IPod   ipod3   = new IPod   ("music", 17, 25.0);
		
		System.out.println(ipod.equals(ipod1));
		System.out.println(ipod.equals(ipod2));
		System.out.println(ipod.equals(ipod3));
		
	}
	
	public void ipadEquals() {
		IPad   ipad   = new IPad   ("learning", false, "iPadOS 14");
		IPad   ipad1   = new IPad   ("learning", false, "iPadOS 14");
		IPad   ipad2   = new IPad   ("learning", false, "iPadOS 14");
		IPad   ipad3   = new IPad   ("learning", false, "iPadOS 14");
		System.out.println(ipad.equals(ipad1));
		System.out.println(ipad.equals(ipad2));
		System.out.println(ipad.equals(ipad3));
	}
	
	public void iphoneEquals() {
		IPhone iphone = new IPhone ("taking", 200.0, "Bell");
		IPhone iphone1 = new IPhone ("taking", 200.0, "Bell");
		IPhone iphone2= new IPhone ("taking", 200.0, "Bell");
		IPhone iphone3 = new IPhone ("taking", 200.0, "Bell");
		System.out.println(iphone.equals(iphone1));
		System.out.println(iphone.equals(iphone2));
		System.out.println(iphone.equals(iphone3));
	}

}
