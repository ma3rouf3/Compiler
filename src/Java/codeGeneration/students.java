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


public class  students
 { 
	public   double   mark;  
	public   double   id;  
    public  String  name;  

    public  String type = "csv";  
    public  String path = "dd";  


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
      		              students temp = new students();
          		          String[] data_table = line.split(cvsSplitBy); 
						    temp.id = Double.parseDouble(data_table[0]);
						    temp.mark = Double.parseDouble(data_table[1]);
						    temp.name = data_table[2];

                   students.data.add(temp);
                

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
						jsonObject.forEach(students_o -> parseEmployeeObject( (JSONObject)students_o));
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
		 private static void parseEmployeeObject(JSONObject students1)
    
{

        JSONObject jsonObject = (JSONObject) students1.get("students");
        students temp = new students() ;
		double mark = ((Number)jsonObject.get("mark")).doubleValue();
        temp.mark = mark;

		double id = ((Number)jsonObject.get("id")).doubleValue();
        temp.id = id;

		String name = ((String)jsonObject.get("name"));
        temp.name = name;

		students.data.add(temp);
 } 

	static List <students>data = new ArrayList<students>();


			 public void setdata (List <students>students){  
				 this.data = students; }

			 public List<students> getdata(){ 
 			 if(data==null){
                     this.load();
                 }
				return this.data ; }

	public void print_list()
	{

	 }
			 public void setmark(double mark){
				 this.mark = mark; }

			 public double getmark(){
				 return mark; }

			 public void setid(double id){
				 this.id = id; }

			 public double getid(){
				 return id; }

			 public void setname( String  name){
				 this.name = name; }

			 public String getname(){
				 return this.name; }

		 }  
 



