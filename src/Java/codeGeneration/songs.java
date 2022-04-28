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
//public class  songs
// {
//	public   double   time_signature;
//	public   double   key;
//    public  String  title;
//	public   double   tempo;
//	public   double   loudness;
//    public  String  track_id;
//    public  String  initials;
//	public   double   year;
//    public  String  artist_name;
//	public   double   duration;
//	public   double   mode;
//
//    public  String type = "csv";
//    public  String path = "C:\\Users\\Ma3roof\\Desktop\\samples\\songs.csv";
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
//      		              songs temp = new songs();
//          		          String[] data_table = line.split(cvsSplitBy);
//						    temp.initials = data_table[0];
//						    temp.track_id = data_table[1];
//						    temp.artist_name = data_table[2];
//						    temp.title = data_table[3];
//						    temp.loudness = Double.parseDouble(data_table[4]);
//						    temp.tempo = Double.parseDouble(data_table[5]);
//						    temp.time_signature = Double.parseDouble(data_table[6]);
//						    temp.key = Double.parseDouble(data_table[7]);
//						    temp.mode = Double.parseDouble(data_table[8]);
//						    temp.duration = Double.parseDouble(data_table[9]);
//						    temp.year = Double.parseDouble(data_table[10]);
//
//                   songs.data.add(temp);
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
//						jsonObject.forEach(songs_o -> parseEmployeeObject( (JSONObject)songs_o));
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
//		 private static void parseEmployeeObject(JSONObject songs1)
//
//{
//
//        JSONObject jsonObject = (JSONObject) songs1.get("songs");
//        songs temp = new songs() ;
//		double time_signature = ((Number)jsonObject.get("time_signature")).doubleValue();
//        temp.time_signature = time_signature;
//
//		double key = ((Number)jsonObject.get("key")).doubleValue();
//        temp.key = key;
//
//		String title = ((String)jsonObject.get("title"));
//        temp.title = title;
//
//		double tempo = ((Number)jsonObject.get("tempo")).doubleValue();
//        temp.tempo = tempo;
//
//		double loudness = ((Number)jsonObject.get("loudness")).doubleValue();
//        temp.loudness = loudness;
//
//		String track_id = ((String)jsonObject.get("track_id"));
//        temp.track_id = track_id;
//
//		String initials = ((String)jsonObject.get("initials"));
//        temp.initials = initials;
//
//		double year = ((Number)jsonObject.get("year")).doubleValue();
//        temp.year = year;
//
//		String artist_name = ((String)jsonObject.get("artist_name"));
//        temp.artist_name = artist_name;
//
//		double duration = ((Number)jsonObject.get("duration")).doubleValue();
//        temp.duration = duration;
//
//		double mode = ((Number)jsonObject.get("mode")).doubleValue();
//        temp.mode = mode;
//
//		songs.data.add(temp);
// }
//
//	static List <songs>data = new ArrayList<songs>();
//
//
//			 public void setdata (List <songs>songs){
//				 this.data = songs; }
//
//			 public List<songs> getdata(){
// 			 if(data==null){
//                     this.load();
//                 }
//				return this.data ; }
//
//	public void print_list()
//	{
//
//	 }
//			 public void settime_signature(double time_signature){
//				 this.time_signature = time_signature; }
//
//			 public double gettime_signature(){
//				 return time_signature; }
//
//			 public void setkey(double key){
//				 this.key = key; }
//
//			 public double getkey(){
//				 return key; }
//
//			 public void settitle( String  title){
//				 this.title = title; }
//
//			 public String gettitle(){
//				 return this.title; }
//
//			 public void settempo(double tempo){
//				 this.tempo = tempo; }
//
//			 public double gettempo(){
//				 return tempo; }
//
//			 public void setloudness(double loudness){
//				 this.loudness = loudness; }
//
//			 public double getloudness(){
//				 return loudness; }
//
//			 public void settrack_id( String  track_id){
//				 this.track_id = track_id; }
//
//			 public String gettrack_id(){
//				 return this.track_id; }
//
//			 public void setinitials( String  initials){
//				 this.initials = initials; }
//
//			 public String getinitials(){
//				 return this.initials; }
//
//			 public void setyear(double year){
//				 this.year = year; }
//
//			 public double getyear(){
//				 return year; }
//
//			 public void setartist_name( String  artist_name){
//				 this.artist_name = artist_name; }
//
//			 public String getartist_name(){
//				 return this.artist_name; }
//
//			 public void setduration(double duration){
//				 this.duration = duration; }
//
//			 public double getduration(){
//				 return duration; }
//
//			 public void setmode(double mode){
//				 this.mode = mode; }
//
//			 public double getmode(){
//				 return mode; }
//
//		 }
//
//
//
//
