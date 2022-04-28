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


public class  Faculties
 { 
	public   double   id;  
    public  String  name;  
    public  address  Address;  

    public  String type = "json";  
    public  String path = "C:\\Users\\Ma3roof\\Desktop\\json\\new data\\Uni.json";  


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
      		              Faculties temp = new Faculties();
          		          String[] data_table = line.split(cvsSplitBy); 
						    temp.id = Double.parseDouble(data_table[0]);
						    temp.name = data_table[1];

                   Faculties.data.add(temp);
                

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
						jsonObject.forEach(Faculties_o -> parseEmployeeObject( (JSONObject)Faculties_o));
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
		 private static void parseEmployeeObject(JSONObject Faculties1)
    
{

        JSONObject jsonObject = (JSONObject) Faculties1.get("Faculties");
        Faculties temp = new Faculties() ;
		double id = ((Number)jsonObject.get("id")).doubleValue();
        temp.id = id;

		String name = ((String)jsonObject.get("name"));
        temp.name = name;

		JSONObject jsonObject1 = (JSONObject) jsonObject.get("Address");
		address address1 = new address();
		String Country = (String) jsonObject1.get("Country");
		address1.Country = Country;

		String City = (String) jsonObject1.get("City");
		address1.City = City;

		 temp.setAddress(address1);

		Faculties.data.add(temp);
 } 

	static List <Faculties>data = new ArrayList<Faculties>();


			 public void setdata (List <Faculties>Faculties){  
				 this.data = Faculties; }

			 public List<Faculties> getdata(){ 
 			 if(data==null){
                     this.load();
                 }
				return this.data ; }

	public void print_list()
	{
		System.out.println("Country  =   "+ this.Address.Country);

		System.out.println("City  =   "+ this.Address.City);


	 }
			 public void setid(double id){
				 this.id = id; }

			 public double getid(){
				 return id; }

			 public void setname( String  name){
				 this.name = name; }

			 public String getname(){
				 return this.name; }

			 public void setAddress( address  Address){
				 this.Address = Address; }

			 public address getAddress(){
				 return this.Address; }

		 }  
 



