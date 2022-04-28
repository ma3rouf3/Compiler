package Java.codeGeneration;
import java.util.ArrayList;
import java.util.List;


public class  var_in_q
 { 
	public   double   id;  
    public  String  City;  
    public  String  Country;  
    public  String  name;  


	static List <var_in_q>data = new ArrayList<var_in_q>();

			 public void setdata (List <var_in_q>var_in_q){  
				 this.data = var_in_q; }

			 public List<var_in_q> getdata(){ 
  				return this.data ; }


		void load() {
		for (int i = 0; i < Faculties.data.size(); i++) {
//			this.getdata().get(i).id = Faculties.data.get(i).id;
//			this.getdata().get(i).City = Faculties.data.get(i).City;
//			this.getdata().get(i).Country = Faculties.data.get(i).Country;
//			this.getdata().get(i).name = Faculties.data.get(i).name;
//			this.getdata().get(i).id = Faculties.data.get(i).id;
//			this.getdata().get(i).City = Faculties.data.get(i).City;
//			this.getdata().get(i).Country = Faculties.data.get(i).Country;
//			this.getdata().get(i).name = Faculties.data.get(i).name;
//			this.getdata().get(i).id = Faculties.data.get(i).Address.id;
//			this.getdata().get(i).City = Faculties.data.get(i).Address.City;
//			this.getdata().get(i).Country = Faculties.data.get(i).Address.Country;
//			this.getdata().get(i).name = Faculties.data.get(i).Address.name;
//			this.getdata().get(i).id = Faculties.data.get(i).id;
//			this.getdata().get(i).City = Faculties.data.get(i).City;
//			this.getdata().get(i).Country = Faculties.data.get(i).Country;
//			this.getdata().get(i).name = Faculties.data.get(i).name;
//			this.getdata().get(i).id = Faculties.data.get(i).id;
//			this.getdata().get(i).City = Faculties.data.get(i).City;
//			this.getdata().get(i).Country = Faculties.data.get(i).Country;
//			this.getdata().get(i).name = Faculties.data.get(i).name;
}
	}

			 public void setid(double id){
				 this.id = id; }

			 public double getid(){
				 return id; }

			 public void setCity( String  City){
				 this.City = City; }

			 public String getCity(){
				 return this.City; }

			 public void setCountry( String  Country){
				 this.Country = Country; }

			 public String getCountry(){
				 return this.Country; }

			 public void setname( String  name){
				 this.name = name; }

			 public String getname(){
				 return this.name; }

		  public void print() 
			{
		Faculties Faculties1 = new Faculties();
		Faculties1.load() ; 
		 for (int i=0 ; i<Faculties1.getdata().size() ; i++) {
				if(Faculties.data.get(i).id<2008) 
		{
			System.out.println("\t\t\t block ==  "+ (i+1));
			System.out.println(" name   =   "+ Faculties.data.get(i).name +"\t|  \t i = "+i);
		
			Faculties.data.get(i).print_list();
			System.out.println(" id   =   "+ Faculties.data.get(i).id +"\t|  \t i = "+i);
		
			
}
			
}
	}
		 }  
 



