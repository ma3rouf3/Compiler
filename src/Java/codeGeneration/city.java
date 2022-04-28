package Java.codeGeneration;
import java.util.ArrayList;
import java.util.List;

//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;


public class  city
 { 
	public   double   id;  
    public  String  name;  
    public  country  country;  


	static List <city>data = new ArrayList<city>();

			 public void setdata (List <city>city){  
				 this.data = city; }

			 public List<city> getdata(){ 
  				return this.data ; }

			 public void setid(double id){
				 this.id = id; }

			 public double getid(){
				 return id; }

			 public void setname( String  name){
				 this.name = name; }

			 public String getname(){
				 return this.name; }

			 public void setcountry( country  country){
				 this.country = country; }

			 public country getcountry(){
				 return this.country; }

		 }  
 



