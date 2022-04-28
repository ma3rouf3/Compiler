package Java.codeGeneration;
import java.util.ArrayList;
import java.util.List;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;


public class  region
 { 
    public  String  name;  


	static List <region>data = new ArrayList<region>();

			 public void setdata (List <region>region){  
				 this.data = region; }

			 public List<region> getdata(){ 
  				return this.data ; }

			 public void setname( String  name){
				 this.name = name; }

			 public String getname(){
				 return this.name; }

		 }  
 



