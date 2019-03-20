import java.util.ArrayList;

public class Starfleet {
	ArrayList<Captain> listcaptain = new ArrayList();
	ArrayList<Vessel> listvessel = new ArrayList();

	
	public void Remove(Captain c)
	{
		for(int i = 0; i<listcaptain.size();i++)
			if (c.getCaptainname() == listcaptain.get(i).getCaptainname().toString()){
				listvessel.remove(i);
				listcaptain.remove(i);
				
			}
		
	}
		
	public void Remove(Vessel v)
	{
		for(int i = 0; i<listvessel.size();i++)
			if (v.getVeseelname() == listvessel.get(i).getVeseelname().toString()){
				listcaptain.remove(i);
				listvessel.remove(i);
			}
		
	}
	
	 static class Captain {
		 
		public String captainname;
		public String vesselname;
		
		public String getCaptainname() {
			return captainname;
		}
	
		public String getVesselname() {
			return vesselname;
		}
		
		
		public Captain(String name) {
			vesselname = "";
			this.captainname = name;
		}
	 }
	 
	static class Vessel{
		String veseelname;	
		String captainname;
		String type;
		
		public String getVeseelname() {
			return veseelname;
		}

		public String getCaptainname() {
			return captainname;
		}

		public String getType() {
			return type;
		}

		
		
		public Vessel(String type,String veseelname) {
			this.captainname = "";
			this.type = type;
			this.veseelname = veseelname;
		}
	}
	
	public String assignCaptain(Captain cap, Vessel ves){	
		cap.getVesselname();
		ves.getCaptainname();
		listcaptain.add(cap);
		listvessel.add(ves);
		return "Captain "+cap.getCaptainname()+" commands the vessel "+ves.getVeseelname();
	}
	

	
	

}
