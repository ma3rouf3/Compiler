//package Java.codeGeneration;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
// import java.io.IOException;
//import java.io.*;import java.util.*;
//
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import Java.SymbolTable.Aggregationfunctionjar;
//import java.util.List;
//
//
//public class  clubs
// {
//	public   double   id;
//    public  String  name;
//    public  city  city;
//
//    public  String type = "json";
//    public  String path = "C:\\Users\\Ma3roof\\Desktop\\samples\\clubs.json";
//
//
//			 public void load()
//{
// 	if(type.equals("csv")) {
//		String csvFile = path;
//		 BufferedReader br = null;
//		        String line = "";
//    		    String cvsSplitBy = ",";
//			try {
//		            br = new BufferedReader(new FileReader(csvFile));
//  		          while ((line = br.readLine()) != null)  {
//      		              clubs temp = new clubs();
//          		          String[] data_table = line.split(cvsSplitBy);
//						    temp.id = Double.parseDouble(data_table[0]);
//						    temp.name = data_table[1];
//
//                   clubs.data.add(temp);
//
//
//        }
//			 }catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//
//}
//			else if(type.equals("json"))
//				{
//
//					JSONParser parser = new JSONParser();
//					try {
//						Object obj = parser.parse(new FileReader(path));
//						JSONArray jsonObject = (JSONArray) obj;
//						jsonObject.forEach(clubs_o -> parseEmployeeObject( (JSONObject)clubs_o));
//					}
//
//					catch (FileNotFoundException e) {
//						e.printStackTrace();
//					}
//					catch (IOException e) {
//						e.printStackTrace();
//					} catch (ParseException e) {
//						e.printStackTrace();
//					}
//
//				}
//}
//		 private static void parseEmployeeObject(JSONObject clubs1)
//
//{
//
//        JSONObject jsonObject = (JSONObject) clubs1.get("clubs");
//        clubs temp = new clubs() ;
//		double id = ((Number)jsonObject.get("id")).doubleValue();
//        temp.id = id;
//
//		String name = ((String)jsonObject.get("name"));
//        temp.name = name;
//
//		JSONObject jsonObject1 = (JSONObject) jsonObject.get("city");
//		city city1 = new city();
//
//		String  name1  = ((String) jsonObject1.get("name"));
//		city1.name = name1 ;
//
//		double  id2  = ((Number) jsonObject1.get("id")).doubleValue();
//		city1.id = id2 ;
//
//		 temp.setcity(city1);
//
//		clubs.data.add(temp);
// }
//
//	static List <clubs>data = new ArrayList<clubs>();
//
//
//			 public void setdata (List <clubs>clubs){
//				 this.data = clubs; }
//
//			 public List<clubs> getdata(){
// 			 if(data==null){
//                     this.load();
//                 }
//				return this.data ; }
//
//	public void print_list()
//	{
//		System.out.println("country  =   "+ this.city.country);
//
//		System.out.println("name  =   "+ this.city.name);
//
//		System.out.println("id  =   "+ this.city.id);
//
//
//	 }
//			 public void setid(double id){
//				 this.id = id; }
//
//			 public double getid(){
//				 return id; }
//
//			 public void setname( String  name){
//				 this.name = name; }
//
//			 public String getname(){
//				 return this.name; }
//
//			 public void setcity( city  city){
//				 this.city = city; }
//
//			 public city getcity(){
//				 return this.city; }
//
//		 }
//
//
//
//
