package Java.codeGeneration;
import java.util.ArrayList;
import java.util.List;


public class  var_co
 { 
    public  String  value;  
    public  String  color;  
	public   double   id;  
	public   double   profitability;  


	static List <var_co>data = new ArrayList<var_co>();

			 public void setdata (List <var_co>var_co){  
				 this.data = var_co; }

			 public List<var_co> getdata(){ 
  				return this.data ; }

			 public void setvalue( String  value){
				 this.value = value; }

			 public String getvalue(){
				 return this.value; }

			 public void setcolor( String  color){
				 this.color = color; }

			 public String getcolor(){
				 return this.color; }

			 public void setid(double id){
				 this.id = id; }

			 public double getid(){
				 return id; }

			 public void setprofitability(double profitability){
				 this.profitability = profitability; }

			 public double getprofitability(){
				 return profitability; }

		  public void print() 
			{
		colors colors1 = new colors();
		colors1.load() ; 
		 for (int i=0 ; i<colors1.getdata().size() ; i++) {
			System.out.println("\t\t\t block ==  "+ i+1);
				if(colors.data.get(i).id ==2008 ||  colors.data.get(i).id==2010) 
{
//			System.out.println(" profitability   =   "+ colors.data.get(i).profitability +"\t|  \t i = "+i);
		
			System.out.println(" id   =   "+ colors.data.get(i).id +"\t|  \t i = "+i);
		
			System.out.println(" color   =   "+ colors.data.get(i).color +"\t|  \t i = "+i);
		
			System.out.println(" value   =   "+ colors.data.get(i).value +"\t|  \t i = "+i);
		
			
}
			
}
	}
 }  
 



