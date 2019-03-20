import java.util.ArrayList;

public class main {
		public static void main(String[] args) {
			Starfleet a = new Starfleet();
			
			Starfleet.Captain cap1 = new Starfleet.Captain("Jean-Luc Picard");
			Starfleet.Captain cap2 = new Starfleet.Captain("Benjamin Sisco");
			Starfleet.Captain cap3 = new Starfleet.Captain("Katherine Janeway");
			
			Starfleet.Vessel ves1 = new Starfleet.Vessel("ship","Enterprise");
			Starfleet.Vessel ves2 = new Starfleet.Vessel("star base","Deep Space 9");
			Starfleet.Vessel ves3 = new Starfleet.Vessel("ship","Voyaguer");
			
		ArrayList listcaptain = new ArrayList();
		listcaptain.add(cap1);
		listcaptain.add(cap2);
		listcaptain.add(cap3);
		ArrayList listvessel = new ArrayList();
		listvessel.add(ves1);
		listvessel.add(ves2);
		listvessel.add(ves3);
		
		ArrayList assign = new ArrayList();
		assign.add(a.assignCaptain(cap1, ves1));
		assign.add(a.assignCaptain(cap2, ves2));
		assign.add(a.assignCaptain(cap3, ves3));
		
		for (int i = 0; i < assign.size(); i++)
		{
			System.out.println(assign.get(i).toString());
		}
		
		for (int i = 0; i < assign.size(); i++)
		{
			System.out.println("The vessel "+a.listvessel.get(i).getVeseelname().toString()+" is of type "+a.listvessel.get(i).getType().toString()+" and it is commanded by Captian"+a.listcaptain.get(i).getCaptainname().toString());
		}
		
		a.Remove(cap3);
		a.Remove(ves1);
		
		}	
		
		
			
}
