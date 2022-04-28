package Java.codeGeneration;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 import java.io.IOException;
import java.io.*;import java.util.*;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class  colors
 { 
    public  String  value;  
	public   double   id;  
    public  String  color;  

    public  String type = "json";  
    public  String path = "C:\\Users\\Ma3roof\\Desktop\\json\\new data\\colors.json";  


			 public void load()
{
 	if(type.equals("csv")) {
		String csvFile = path;  
		 BufferedReader br = null;
		        String line = "";
    		    String cvsSplitBy = ","; 
			try {
		            br = new BufferedReader(new FileReader(csvFile));
  		          while ((line = br.readLine()) != null)  {
      		              colors temp = new colors();
          		          String[] data_table = line.split(cvsSplitBy); 
						    temp.id = Double.parseDouble(data_table[0]);
						    temp.color = data_table[1];
						    temp.value = data_table[2];

                   colors.data.add(temp);
                

        }
			 }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        				
}
			else if(type.equals("json"))
				{
					
					JSONParser parser = new JSONParser();
					try {
						Object obj = parser.parse(new FileReader(path));
						JSONArray jsonObject = (JSONArray) obj;
						jsonObject.forEach(colors_o -> parseEmployeeObject( (JSONObject)colors_o));
					}

					catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					catch (IOException e) {
						e.printStackTrace();
					} catch (ParseException e) {
						e.printStackTrace();
					}

				}	 
}
		 private static void parseEmployeeObject(JSONObject colors1)
    
{

        JSONObject jsonObject = (JSONObject) colors1.get("colors");
        colors temp = new colors() ;
		String value = ((String)jsonObject.get("value"));
        temp.value = value;

		double id = ((Number)jsonObject.get("id")).doubleValue();
        temp.id = id;

		String color = ((String)jsonObject.get("color"));
        temp.color = color;

		colors.data.add(temp);
 } 

	static List <colors>data = new ArrayList<colors>();


			 public void setdata (List <colors>colors){  
				 this.data = colors; }

			 public List<colors> getdata(){ 
 			 if(data==null){
                     this.load();
                 }
				return this.data ; }

	public void print_list()
	{

	 }
			 public void setvalue( String  value){
				 this.value = value; }

			 public String getvalue(){
				 return this.value; }

			 public void setid(double id){
				 this.id = id; }

			 public double getid(){
				 return id; }

			 public void setcolor( String  color){
				 this.color = color; }

			 public String getcolor(){
				 return this.color; }

		 }  
 



