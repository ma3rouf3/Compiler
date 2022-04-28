package Java.codeGeneration;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 import java.io.IOException;
import java.io.*;import java.util.*;


public class  customer
 { 
	public   double   id;  
    public  String  Country;  
    public  String  name;  
    public  Boolean  is_marrid;  

    public  String type = "csv";  
    public  String path = "C:\\Users\\Ma3roof\\Desktop\\json\\Data/movies.csv";  



	static List <customer>data = new ArrayList<customer>();


			 public void load(){
 		String csvFile = "C:\\Users\\Ma3roof\\Desktop\\json\\Data/movies.csv";  
		 BufferedReader br = null;
		        String line = "";
    		    String cvsSplitBy = ","; 
			try {
		            br = new BufferedReader(new FileReader(csvFile));
  		          while ((line = br.readLine()) != null)  {
      		              customer temp = new customer();
          		          String[] data_table = line.split(cvsSplitBy); 
						    temp.id = Double.parseDouble(data_table[0]);
						    temp.name = data_table[1];
						    temp.Country = data_table[2];
						    temp.is_marrid = Boolean.parseBoolean(data_table[3]);

                   customer.data.add(temp);
                }

        } catch (FileNotFoundException e) {
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
        }			 public void setdata (List <customer>customer){  
				 this.data = customer; }

			 public List<customer> getdata(){ 
 			 if(data==null){
                     this.load();
                 }
				return this.data ; }

			 public void setid(double id){
				 this.id = id; }

			 public double getid(){
				 return id; }

			 public void setCountry( String  Country){
				 this.Country = Country; }

			 public String getCountry(){
				 return this.Country; }

			 public void setname( String  name){
				 this.name = name; }

			 public String getname(){
				 return this.name; }

			 public void setis_marrid( Boolean  is_marrid){
				 this.is_marrid = is_marrid; }

			 public Boolean getis_marrid(){
				 return this.is_marrid; }

 }  
 



