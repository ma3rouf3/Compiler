package Java.codeGeneration;
import java.util.ArrayList;
import java.util.List;

//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;


public class  country
 { 
    public  region  region;  
	public   double   id;  
    public  String  name;  


	static List <country>data = new ArrayList<country>();

			 public void setdata (List <country>country){  
				 this.data = country; }

			 public List<country> getdata(){ 
  				return this.data ; }

			 public void setregion( region  region){
				 this.region = region; }

			 public region getregion(){
				 return this.region; }

			 public void setid(double id){
				 this.id = id; }

			 public double getid(){
				 return id; }

			 public void setname( String  name){
				 this.name = name; }

			 public String getname(){
				 return this.name; }

		 }  
 



