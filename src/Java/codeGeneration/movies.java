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


public class  movies
 { 
	public   double   worldwide_gross;  
	public   double   rotten_tomato;  
    public  String  genre;  
    public  String  name;  
    public  String  lead_studio;  
	public   double   year;  
	public   double   profitability;  
	public   double   audience_score;  

    public  String type = "csv";  
    public  String path = "movies.csv";  


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
      		              movies temp = new movies();
          		          String[] data_table = line.split(cvsSplitBy); 
						    temp.name = data_table[0];
						    temp.genre = data_table[1];
						    temp.lead_studio = data_table[2];
						    temp.audience_score = Double.parseDouble(data_table[3]);
						    temp.profitability = Double.parseDouble(data_table[4]);
						    temp.rotten_tomato = Double.parseDouble(data_table[5]);
						    temp.worldwide_gross = Double.parseDouble(data_table[6]);
						    temp.year = Double.parseDouble(data_table[7]);

                   movies.data.add(temp);
                

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
						jsonObject.forEach(movies_o -> parseEmployeeObject( (JSONObject)movies_o));
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
		 private static void parseEmployeeObject(JSONObject movies1)
    
{

        JSONObject jsonObject = (JSONObject) movies1.get("movies");
        movies temp = new movies() ;
		double worldwide_gross = ((Number)jsonObject.get("worldwide_gross")).doubleValue();
        temp.worldwide_gross = worldwide_gross;

		double rotten_tomato = ((Number)jsonObject.get("rotten_tomato")).doubleValue();
        temp.rotten_tomato = rotten_tomato;

		String genre = ((String)jsonObject.get("genre"));
        temp.genre = genre;

		String name = ((String)jsonObject.get("name"));
        temp.name = name;

		String lead_studio = ((String)jsonObject.get("lead_studio"));
        temp.lead_studio = lead_studio;

		double year = ((Number)jsonObject.get("year")).doubleValue();
        temp.year = year;

		double profitability = ((Number)jsonObject.get("profitability")).doubleValue();
        temp.profitability = profitability;

		double audience_score = ((Number)jsonObject.get("audience_score")).doubleValue();
        temp.audience_score = audience_score;

		movies.data.add(temp);
 } 

	static List <movies>data = new ArrayList<movies>();


			 public void setdata (List <movies>movies){  
				 this.data = movies; }

			 public List<movies> getdata(){ 
 			 if(data==null){
                     this.load();
                 }
				return this.data ; }

	public void print_list()
	{

	 }
			 public void setworldwide_gross(double worldwide_gross){
				 this.worldwide_gross = worldwide_gross; }

			 public double getworldwide_gross(){
				 return worldwide_gross; }

			 public void setrotten_tomato(double rotten_tomato){
				 this.rotten_tomato = rotten_tomato; }

			 public double getrotten_tomato(){
				 return rotten_tomato; }

			 public void setgenre( String  genre){
				 this.genre = genre; }

			 public String getgenre(){
				 return this.genre; }

			 public void setname( String  name){
				 this.name = name; }

			 public String getname(){
				 return this.name; }

			 public void setlead_studio( String  lead_studio){
				 this.lead_studio = lead_studio; }

			 public String getlead_studio(){
				 return this.lead_studio; }

			 public void setyear(double year){
				 this.year = year; }

			 public double getyear(){
				 return year; }

			 public void setprofitability(double profitability){
				 this.profitability = profitability; }

			 public double getprofitability(){
				 return profitability; }

			 public void setaudience_score(double audience_score){
				 this.audience_score = audience_score; }

			 public double getaudience_score(){
				 return audience_score; }

		 }  
 



