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
//public class  countries
// {
//    public  String  region;
//	public   double   id;
//    public  String  name;
//    public  String  post_code;
//    public  String  code;
//
//    public  String type = "json";
//    public  String path = "C:\\Users\\Ma3roof\\Desktop\\samples\\countries.json";
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
//      		              countries temp = new countries();
//          		          String[] data_table = line.split(cvsSplitBy);
//						    temp.id = Double.parseDouble(data_table[0]);
//						    temp.name = data_table[1];
//						    temp.code = data_table[2];
//						    temp.post_code = data_table[3];
//						    temp.region = data_table[4];
//
//                   countries.data.add(temp);
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
//						jsonObject.forEach(countries_o -> parseEmployeeObject( (JSONObject)countries_o));
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
//		 private static void parseEmployeeObject(JSONObject countries1)
//
//{
//
//        JSONObject jsonObject = (JSONObject) countries1.get("countries");
//        countries temp = new countries() ;
//		String region = ((String)jsonObject.get("region"));
//        temp.region = region;
//
//		double id = ((Number)jsonObject.get("id")).doubleValue();
//        temp.id = id;
//
//		String name = ((String)jsonObject.get("name"));
//        temp.name = name;
//
//		String post_code = ((String)jsonObject.get("post_code"));
//        temp.post_code = post_code;
//
//		String code = ((String)jsonObject.get("code"));
//        temp.code = code;
//
//		countries.data.add(temp);
// }
//
//	static List <countries>data = new ArrayList<countries>();
//
//
//			 public void setdata (List <countries>countries){
//				 this.data = countries; }
//
//			 public List<countries> getdata(){
// 			 if(data==null){
//                     this.load();
//                 }
//				return this.data ; }
//
//	public void print_list()
//	{
//
//	 }
//			 public void setregion( String  region){
//				 this.region = region; }
//
//			 public String getregion(){
//				 return this.region; }
//
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
//			 public void setpost_code( String  post_code){
//				 this.post_code = post_code; }
//
//			 public String getpost_code(){
//				 return this.post_code; }
//
//			 public void setcode( String  code){
//				 this.code = code; }
//
//			 public String getcode(){
//				 return this.code; }
//
//		 }
//
//
//
//
