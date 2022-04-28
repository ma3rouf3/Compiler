package Java.codeGeneration;

import Java.Main;
import Java.SymbolTable.Aggregationfunctionjar;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.lang.reflect.Type;
import java.util.*;



public class WriteClass {


    public static File errorFile = new File("C:\\Users\\Ma3roof\\IdeaProjects\\myAST\\src\\Java\\codeGeneration//");
    public static FileWriter myWriter;

//    static {
//        try {
//            myWriter = new FileWriter("samples//Classfile.java");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//    public List<Class<?>> print_data(List<Class<?>> data){
//    }




    public void print_json_abd(){
        ArrayList<colors> colors = new ArrayList<>();
        colors = load_json_abd("C:\\Users\\Ma3roof\\Desktop\\json\\new data\\Colors.json");
//        load_json();
        System.out.println(" size colors =  "+colors.size() );
        for (int i=0 ; i<colors.size() ; i++ )
        {

            System.out.println("\t\t\t block ==  "+ i);
            System.out.println(" id   =   "+ colors.get(i).id +"|  \t i = "+i);
            System.out.println("  color  =   "+ colors.get(i).color +"| \t i = "+i);
            System.out.println(" value   =   "+ colors.get(i).value +"|\t   i = "+i);
            System.out.println("__________________________________________________");
        }

    }

    public void print_faculty()
    {
        load_json();
        System.out.println(" size Uni =  "+Faculties.data.size() );
        for (int i=0 ; i<Faculties.data.size() ; i++ )
        {

            System.out.println("\t\t\t block ==  "+ i+1);
            System.out.println(" id   =   "+ Faculties.data.get(i).id +"\t|  \t i = "+i);
            System.out.println("  name   =   "+ Faculties.data.get(i).name +"\t| \t i = "+i);
            System.out.println(" address.Country   =   "+ Faculties.data.get(i).Address.Country +"\t|\t   i = "+i);
            System.out.println(" address,City      =   "+ Faculties.data.get(i).Address.City +" \t |\t   i = "+i);
            System.out.println("__________________________________________________");

        }

    }


    public void print_json()
    {
//        ArrayList<colors> colors = new ArrayList<>();
//        colors = load_json_abd("C:\\Users\\Ma3roof\\Desktop\\json\\new data/Colors.json");
        load_json();
        System.out.println(" size colors =  "+colors.data.size() );
       for (int i=0 ; i<colors.data.size() ; i++ )
       {

           System.out.println("\t\t\t block ==  "+ i);
           System.out.println(" id   =   "+ colors.data.get(i).id +"|  \t i = "+i);
           System.out.println("  color  =   "+ colors.data.get(i).color +"| \t i = "+i);
           System.out.println(" value   =   "+ colors.data.get(i).value +"|\t   i = "+i);
            System.out.println("__________________________________________________");

       }

    }

    public void print_test(){

        movies movies = new movies();
        movies.load();
//        movies.getdata();
        System.out.println("size = "+ movies.getdata().size());
        System.out.println("data movies  =   \n");
        for (int i=0 ; i<movies.getdata().size() ; i++) {

//                System.out.println("\t\t\t block =  "+i);
//                System.out.println("1-  name   =  " + movies.getdata().get(i).name);
//                System.out.println("2-  genre  =  " + movies.getdata().get(i).genre);
//                System.out.println("3-  lead_studio  =  " + movies.getdata().get(i).lead_studio);
//                System.out.println("4-  audience_score  =  " + movies.getdata().get(i).audience_score);
//                System.out.println("5-  profitability  =  " + movies.getdata().get(i).profitability);
//                System.out.println("6-  rotten_tomato  =  " + movies.getdata().get(i).rotten_tomato);
//                System.out.println("7-  worldwide_gross  =  " + movies.getdata().get(i).worldwide_gross);
//                System.out.println("8-  year  =  " + movies.getdata().get(i).year);
                System.out.println("________________________________________________");
        }
    }

        public void load_json(){
            JSONParser parser = new JSONParser();
            try {
                Object obj = parser.parse(new FileReader("C:\\Users\\Ma3roof\\Desktop\\json\\new data\\Uni.json"));
//                    JSONObject jsonObject1 = (JSONObject ) obj ;
                JSONArray jsonObject = (JSONArray) obj;
//                System.out.println("www");
                jsonObject.forEach(colors_o -> parseEmployeeObject( (JSONObject) colors_o));
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

    private static void parseEmployeeObject(JSONObject color)
    {

        JSONObject jsonObject = (JSONObject) color.get("Faculties");
        Faculties temp = new Faculties() ;
        double id = ((Number)jsonObject.get("id")).doubleValue();
        temp.id=id;
        System.out.println("id = "+id);

        String name=(String) jsonObject.get("name");
        System.out.println("name = "+ name);
        temp.name=name;

        JSONObject jsonObject1 = (JSONObject) jsonObject.get("Address");
//        address addres = (address) jsonObject.get("Address");
       address addres = new address();
        String country = (String) jsonObject1.get("Country");
        addres.Country = country;
        String City = (String) jsonObject1.get("City");
        addres.City = City;

        System.out.println("address.Country = "+country);
        System.out.println("address.City  = "+City);



        temp.setAddress(addres);

        System.out.println("---------------------------------------");
        Faculties.data.add(temp);
    }

    private static void parseEmployeeObject_colors(JSONObject color)
    {

        JSONObject jsonObject = (JSONObject) color.get("colors");
        colors temp = new colors() ;
        double id= ((Number)jsonObject.get("id")).doubleValue();
        temp.id=id;
        System.out.println("id = "+id);

        String name=(String) jsonObject.get("color");
        System.out.println("color = "+ name);
//        temp.color=name;

        String value = (String) jsonObject.get("value");
        System.out.println("value  = "+ value);
        temp.value = value;
            System.out.println("------------------------------------");
        colors.data.add(temp);
    }



    public ArrayList<colors> load_json_abd(String path)
    {
        System.out.println("path =  "+path);
        ArrayList<colors>  list= new ArrayList<>();

        try
        {
//            Object obj = new JSONParser().parse(new FileReader("C:\\Users\\Ma3roof\\Desktop\\json\\new data\\Colors.json"));
//            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("1 in try");
            Type listType = new TypeToken<colors>(){}.getType();
//            colors [] colors = (Java.codeGeneration.colors[]) obj;
//            JSONArray jsonArray = (JSONArray)  ((JSONObject) obj).get("color");

            System.out.println(" 2 in try");
            BufferedReader br =new BufferedReader(new FileReader(path));

//            System.out.println("jsonarray  =  "+ jsonArray.get(1));
            Gson gson = new Gson();

            list = gson.fromJson(br , listType);
            System.out.println(" 3 in try");
        } catch (Exception e) {
            System.out.println(e.toString());
//            e.printStackTrace();
        }


        return list;
    }

    public void loader_csv(String type ){

        if(type.equals("csv")) {
            String csvFile = "C:/Users/Ma3roof/Desktop/json/csvfile.csv";   //path;  //"D:/table_data.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";

            try {
                br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null)
//                while ((line = br.readLine()) != null)
                {
                    customer temp = new customer();
                    String[] data_table = line.split(cvsSplitBy);
//                        System.out.println("data_table =  "+ data_table[0]);
//                        System.out.println("data_table =  "+ data_table[1]);
//                        System.out.println("data_table =  "+ data_table[2]);
//                        System.out.println("data_table =  "+ data_table[3]);

                    temp.id = Double.parseDouble(data_table[0]);
                    temp.name = data_table[1];
                    temp.Country = data_table[2];
                    temp.is_marrid=Boolean.parseBoolean( data_table[3]);

//                    customer.data.add(temp);
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
        }


//            for(int i=0 ; i<customer.data.size() ; i++) {
//                System.out.println("csv file  id  = " + customer.data.get(i).Id);
//                System.out.println("csv file name  = " + customer.data.get(i).Name);
//                System.out.println("csv file  country = " + customer.data.get(i).Country);
////                System.out.println("csv file is 5ra = " + customer.data.get(i).is_marrid);
//                System.out.println("______________________________________________");
//            }


//        System.out.println("csv file  id  = " +customer.data.get(1).id);
//        System.out.println("csv file name  = " +customer.data.get(1).name);
//        System.out.println("csv file  country = " +customer.data.get(1).Country);
//        System.out.println("csv file is 5ra = " +customer.data.get(1).is_marrid);


//        try {
//            FileReader fileReader = new FileReader(path);
////            CSVReader csvReader = new CSVReader();
//
////            CSVParser csvParser = new CSVParser(fileReader);
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }

    public void loader(String path) throws IOException, ParseException {
//        Gson gson= new Gson();

//        try {
//            JsonReader reader = new JsonReader(new FileReader("C:\\Users\\Ma3roof\\Desktop\\json\\file1.json"));
//            JsonObject jsonObject = gson.fromJson(reader,JSONObject.class);
//            JsonElement jsonElement = jsonObject.get("Faculty");
//            faculty []f =gson.fromJson(jsonElement, faculty[].class);
//            f. = new ArrayList<>(Arrays.asList(f));
//        } catch (FileNotFoundException e)
//        {
//
//        }



//        JSONParser parser = new JSONParser();
//        try {
//            Object obj = parser.parse(new FileReader("C:\\Users\\Ma3roof\\Desktop\\json\\file1.json"));
//            JSONArray jsonObject = (JSONArray) obj;
//            String n= (String) jsonObject.get(0);
//            String n1 = (String) jsonObject.get(1);
//            System.out.println("n =  "+n +"\n n1 =   "+n1 );
//          //  jsonObject.forEach(users_o -> parseEmployeeObject( (JSONObject) users_o));
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }



        // had l func L 5ar ;
//        try {
//
//
//
//            myWriter.write(" public void loader(String path) throws IOException, ParseException {" +
//                    "    Gson gson= new Gson();  " + "\n { \n");
//            myWriter.write("              \n");
//            myWriter.write("            \n");
//            myWriter.write("            \n");
//            myWriter.flush();
//            //    System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }


//        InputStream is;

              Gson gson= new Gson();

            try {
                Object obj = new JSONParser().parse(new FileReader("C:\\Users\\Ma3roof\\Desktop\\json\\file1.json"));
                JSONObject jsonObject = (JSONObject) obj;

                JSONArray jsonArray = (JSONArray)  ((JSONObject) obj).get("Faculty");
                ArrayList list = new ArrayList<>(Arrays.asList(jsonObject));
//                faculty [] faculties = new
//                faculty faculty = new faculty();
//                faculty.setdata(jsonArray);

                for (int i=0 ; i<jsonArray.size() ; i++)
                {
//                    JsonElement jsonElement =list.get(i);
                    System.out.println("arr[i] =  "+jsonArray.get(i));
                }
//                System.out.println("faculty list =  "+ faculty.getdata());

//                String n = (String ) jsonArra;


//                System.out.println("dfdf = =  " +jsonObject.get("Faculty"));
//                System.out.println("n = =   " +list.get(0) +"cont = "+  "\n n1 = "+ "\n"+   list.contains("FacultyName"));

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }


//        for (Object o :     ) {
//
//        }






//
//        try
//        {
//            File jsonInputFile = new File ( "C:\\Users\\Ma3roof\\Desktop\\json\\file.json");
//            is = new FileInputStream(jsonInputFile);
//            JsonReader reader = new JsonReader(new InputStreamReader(is));
//            var_x x = gson.fromJson(reader, var_x[].class);
//            ArrayList list= new ArrayList<>(Arrays.asList(x));
//            x.setvar_xs(list);
//            System.out.println("sss = =  "+x.getvar_x());
//            System.out.println(" ddd= ==  "+ x.toString());
//            reader.close();
//        } catch (JsonIOException e) {
//            e.printStackTrace();
//        } catch (JsonSyntaxException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        Path pathArray = Paths.get("C:\\Users\\Ma3roof\\Desktop\\json\\file.json");
//        Path pathMap = Paths.get("C:\\Users\\Ma3roof\\Desktop\\json\\file.json");
//        Path pathRow = Paths.get("C:\\Users\\Ma3roof\\Desktop\\json\\file.json");
//        Gson gson= new Gson();
//        var_x [] x= gson.fromJson(Files.newBufferedReader(pathArray, UTF_8) , var_x[].class);

      //  final Content = new ArrayList<>(Arrays.asList(x));
//        System.out.println("json1    =  "+x.getClass() );
//        System.out.println("json1    =  "+x.toString() );


//        com.google.gson.stream.JsonReader reader = new com.google.gson.stream.JsonReader();
//      //  JsonReader reader = new com.google.gson.stream.JsonReader() ;
//
//
//            var_x[] data = gson.fromJson( reader, var_x[].class);

//        var_x[] data = gson.fromJson(reader,var_x[].class);
//          //  User[] data = gson.fromJson(reader, User[].class);



//        Object obj = null;
//        try {
//
//             obj = new JSONParser().parse(new FileReader("C:\\Users\\Ma3roof\\Desktop\\json\\file.json"));
//             System.out.println("ddsds");
//        } catch (IOException | ParseException e)
//        {
//            System.out.println("dddd");
//        }
//        //  Set key = type.getColumns().keySet();
//
//        try {
//
//            JSONObject jo = (JSONObject) obj;
//            String name = (String) jo.get("FacultyName");
//            System.out.println("in file json  =  " + name);
//
//
//       // Map d =( (Map) jo.get("Faculties"));
//
//            jo.containsValue("FacultyName");
//              System.out.println(  jo.get("Faculties").toString()+"kkk   "+jo.containsValue("Faculties"));  }
//        catch (java.lang.ClassCastException p)
//        {
//            System.out.println("cast erorr");
//        }

//        Iterator<Map.Entry> itr1= d.entrySet().iterator();
//        while (itr1.hasNext())
//        {
//            Map.Entry pair =itr1.next();
//            System.out.println("i file json  =  "+pair.getKey() );
//            System.out.println("i1 file json  =  "+pair.getValue());
//        }
//
    }




    public void write(List<String> type , List<String> path ) {

//        System.out.println("type in file = "+ type);
//        System.out.println("type in file = "+ path);


        List<String> s = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        List<String> s3 = new ArrayList<>();
        List<String> s4 = new ArrayList<>();
//        s.add("F");
//        s.add("U");
        Set keys; //= new HashSet();
        Iterator to,to1,to2,to3;
        int jj=0;

        for (int i = 0; i <  Main.symbolTable.getDeclaredTypes().size(); i++) {
            keys = Main.symbolTable.getDeclaredTypes().get(i).getColumns().keySet();
//            System.out.println(keys);
//            System.out.println("class name  :  "+ Main.symbolTable.getDeclaredTypes().get(i).getName());


                try {
                    myWriter = new FileWriter("C:\\Users\\Ma3roof\\IdeaProjects\\myAST\\src\\Java\\codeGeneration//"+
                            Main.symbolTable.getDeclaredTypes().get(i).getName() +".java");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            try {

                myWriter.write( "package Java.codeGeneration;\n" +
                        "import java.io.File;\n" +
                        "import java.io.FileWriter;\n" +
                        "import java.io.IOException;\n" +
                        "import java.io.File;\n" +
                        "import java.io.FileWriter;\n" +
                        "import java.io.IOException;\n" +
                        " import java.io.IOException;\n" +
                        "import java.io.*;"+
                        "import java.util.*;\n\n\nimport org.json.simple.JSONArray;\n" +
                        "import org.json.simple.JSONObject;\n" +
                        "import org.json.simple.parser.JSONParser;\n" +
                        "import org.json.simple.parser.ParseException;\n" +
                        "\n" +
                        "import java.io.BufferedReader;\n" +
                        "import java.io.FileNotFoundException;\n" +
                        "import java.io.FileReader;\n" +
                        "import java.io.IOException;\n" +
                        "import java.util.ArrayList;\n" +
                        "import Java.SymbolTable.Aggregationfunctionjar;\n" +
                        "import java.util.List;\n\n\n");

                myWriter.flush();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }



             to = keys.iterator();
//            System.out.println("set key =  "+keys);
            Stack <String >strings = new Stack<>();
            while (to.hasNext())
            {
                strings.push(to.next().toString());
            }
//            while (to.hasNext())
            while(!strings.isEmpty()) {
//                s.add(to.next().toString());
                s.add(strings.pop());

            }
//                System.out.println("list in for after stack :  "+s);
             try {

                 myWriter.write("public class  " + Main.symbolTable.getDeclaredTypes().get(i).getName() + "\n { \n");
               // myWriter.write("\n")
                myWriter.flush();
                //    System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            for (int j = 0; j < keys.size(); j++) {

                if(Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(j)).getName().equals("Number"))
                { try {
                    myWriter.write("\tpublic   double " +"  "+ s.get(j)+";  \n");
//                    System.out.println("s  name variable  =  "+s.get(j));
                   // myWriter.write("\n");
                   // myWriter.write(" ");
                 //   myWriter.write("___________________________________________________________________\n");
                    //  myWriter.close();
                    myWriter.flush();
                    //    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                }else{
                    try {
                        myWriter.write("    public  "+Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(j)).getName() +"  "+ s.get(j)+";  \n");
                       // myWriter.write("\n");
                       // myWriter.write(" ");
                        //   myWriter.write("___________________________________________________________________\n");
                        //  myWriter.close();
                        myWriter.flush();
                        //    System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }

                }
                    jj=j;
            }
                // fucking remove is here ;

            try {
                //   myWriter.write("Class  " + Main.symbolTable.getDeclaredTypes().get(i).getName() + "{ \n");
                //  myWriter.write(Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(j)).getName() +"  "+ s.get(j)+"  \n");

                myWriter.write("\n");

                if (i < type.size() && !type.get(i).equals("null")) {
                    myWriter.write("    public  String type = " + type.get(i) + ";  \n");
//                        myWriter.write("    public  String path = " + path.get(i) + ";  \n");
                    myWriter.write("    public  String path = " + path.get(i) + ";  \n\n\n");

                    /*"C:\\Users\\Ma3roof\\Desktop\\json\\Data/movies.csv"*/
                    // void load()
                    myWriter.write("\t\t\t public void load()\n{\n " +
                            "\tif(type.equals(\"csv\")) {" +
                            "\n\t\tString csvFile = path;  \n" +
                            "\t\t BufferedReader br = null;\n" +
                            "\t\t        String line = \"\";\n" +
                            "    \t\t    String cvsSplitBy = \",\"; \n" +
                            "\t\t\ttry {\n" +
                            "\t\t            br = new BufferedReader(new FileReader(csvFile));\n" +
                            "  \t\t          while ((line = br.readLine()) != null)  {\n" +
                            "      \t\t              " + Main.symbolTable.getDeclaredTypes().get(i).getName() + " temp = new " + Main.symbolTable.getDeclaredTypes().get(i).getName() + "();\n" +
                            "          \t\t          String[] data_table = line.split(cvsSplitBy); \n"
                    );

//                                  for(int j=s.size() -1; j>=0 ;j--)

                    for (int j = 0; j < Main.symbolTable.getDeclaredTypes().get(i).colunms_name.size(); j++) {
//                    System.out.println("set in fun load : "+Main.symbolTable.getDeclaredTypes().get(i).colunms_name +"j = " +j + " ,  s[] =  "+Main.symbolTable.getDeclaredTypes().get(i).colunms_name.get(j) );
                        try {
                            if (Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(Main.symbolTable.getDeclaredTypes().get(i).colunms_name.get(j)).getName().equals("Number"))
                                myWriter.write("\t\t\t\t\t\t    temp." + Main.symbolTable.getDeclaredTypes().get(i).colunms_name.get(j) + " = Double.parseDouble(data_table[" + (j) + "]);\n");
                            if (Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(Main.symbolTable.getDeclaredTypes().get(i).colunms_name.get(j)).getName().equals("Boolean"))
                                myWriter.write("\t\t\t\t\t\t    temp." + Main.symbolTable.getDeclaredTypes().get(i).colunms_name.get(j) + " = Boolean.parseBoolean(data_table[" + (j) + "]);\n");
                            if (Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(Main.symbolTable.getDeclaredTypes().get(i).colunms_name.get(j)).getName().equals("String"))
                                myWriter.write("\t\t\t\t\t\t    temp." + Main.symbolTable.getDeclaredTypes().get(i).colunms_name.get(j) + " = data_table[" + (j) + "];\n");

                            //     "                  \t\t  temp.Country= data_table[2];\n" +
                            //     "     \t\t               temp.is_marrid=Boolean.parseBoolean( data_table[3]);\n");
                        } catch (IOException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }

                    }


//                                  for (int j=0 ; j<s.size() ; j++ )
//                                  {
//
//                                          System.out.println("set in fun load : "+s +"j = " +j + " ,  s[] =  "+s.get(j) );
//                                          try {
//                                              if(Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(j)).getName().equals("Number"))
//                                              myWriter.write("\t\t\t\t\t\t    temp."+s.get(j)+"= Double.parseDouble(data_table["+(j)+ "]);\n" );
//                                              if(Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(j)).getName().equals("Boolean"))
//                                                  myWriter.write("\t\t\t\t\t\t    temp."+s.get(j)+"= Boolean.parseBoolean(data_table["+(j)+ "]);\n" );
//                                              if(Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(j)).getName().equals("String"))
//                                                  myWriter.write("\t\t\t\t\t\t    temp."+s.get(j)+"= data_table["+(j)+ "];\n" );
//
//                                              //     "                  \t\t  temp.Country= data_table[2];\n" +
//                                                 //     "     \t\t               temp.is_marrid=Boolean.parseBoolean( data_table[3]);\n");
//                                          } catch (IOException e) {
//                                              System.out.println("An error occurred.");
//                                              e.printStackTrace();
//                                          }
//
//                                  }

                    myWriter.write("\n                   " + Main.symbolTable.getDeclaredTypes().get(i).getName() +
                            ".data.add(temp);\n" +
                            "                \n" +
                            "\n" +
                            "        }\n" +
                            "\t\t\t }catch (FileNotFoundException e) {\n" +
                            "            e.printStackTrace();\n" +
                            "        } catch (IOException e) {\n" +
                            "            e.printStackTrace();\n" +
                            "        } finally {\n" +
                            "            if (br != null) {\n" +
                            "                try {\n" +
                            "                    br.close();\n" +
                            "                } catch (IOException e) {\n" +
                            "                    e.printStackTrace();\n" +
                            "                }\n" +
                            "            }\n" +
                            "        }\n\n" +
                            "        " +
                            "\t\t\t\t\n}" +
                            "\n\t\t\telse if(type.equals(\"json\"))\n" +
                            "\t\t\t\t{\n" +
                            "\t\t\t\t\t\n" +
                            "\t\t\t\t\tJSONParser parser = new JSONParser();\n" +
                            "\t\t\t\t\ttry {\n" +
                            "\t\t\t\t\t\tObject obj = parser.parse(new FileReader(path));\n" +
                            "\t\t\t\t\t\tJSONArray jsonObject = (JSONArray) obj;\n" +
                            "\t\t\t\t\t\tjsonObject.forEach(" + Main.symbolTable.getDeclaredTypes().get(i).getName() + "_o -> parseEmployeeObject( (JSONObject)" + Main.symbolTable.getDeclaredTypes().get(i).getName() + "_o));\n" +
                            "\t\t\t\t\t}\n" +
                            "\n" +
                            "\t\t\t\t\tcatch (FileNotFoundException e) {\n" +
                            "\t\t\t\t\t\te.printStackTrace();\n" +
                            "\t\t\t\t\t}\n" +
                            "\t\t\t\t\tcatch (IOException e) {\n" +
                            "\t\t\t\t\t\te.printStackTrace();\n" +
                            "\t\t\t\t\t} catch (ParseException e) {\n" +
                            "\t\t\t\t\t\te.printStackTrace();\n" +
                            "\t\t\t\t\t}\n" +
                            "\n" +
                            "\t\t\t\t}" +
                            "\t \n}\n");

                    myWriter.write("\t\t private static void parseEmployeeObject(JSONObject " + Main.symbolTable.getDeclaredTypes().get(i).getName() + "1)\n" +
                            "    \n{\n" +
                            "\n" +
                            "        JSONObject jsonObject = (JSONObject) " + Main.symbolTable.getDeclaredTypes().get(i).getName() + "1.get(\"" + Main.symbolTable.getDeclaredTypes().get(i).getName() +
                            "\");\n" +
                            "        " + Main.symbolTable.getDeclaredTypes().get(i).getName() + " temp = new " + Main.symbolTable.getDeclaredTypes().get(i).getName() + "() ;\n" +
                            "");
                    for (int k = 0; k < s.size(); k++) {
//                        System.out.println("column  : " + Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName());
//                        System.out.println("table on : " + Main.symbolTable.getDeclaredTypes().get(i).getName());

                        if (Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName().equals("Number")) {
                            myWriter.write("\t\tdouble " + s.get(k) + " = ((Number)jsonObject.get(\"" + s.get(k) + "\")).doubleValue();\n" +
                                    "        temp." + s.get(k) + " = " + s.get(k) + ";\n\n");
                        }
                        if (Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName().equals("String")) {
                            myWriter.write("\t\tString " + s.get(k) + " = ((String)jsonObject.get(\"" + s.get(k) + "\"));\n" +
                                    "        temp." + s.get(k) + " = " + s.get(k) + ";\n\n");
                        }
                        if (Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName().equals("Boolean")) {
                            myWriter.write("boolean " + s.get(k) + " = ((boolean)jsonObject.get(\"" + s.get(k) + "\"));\n" +
                                    "        temp." + s.get(k) + " = " + s.get(k) + ";\n\n");
                        }
//                            System.out.println("column  : "+Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName());
//                            System.out.println("table on : "+Main.symbolTable.getDeclaredTypes().get(i).getName());
//                            System.out.println("key_table_type   =   "+ key_table_type);

                        if (!Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName().equals("Number") && !Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName().equals("String") && !Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName().equals("Boolean")) {

//                          for (int l1=0 ; l1< Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().size() ; l1++)

                            myWriter.write("\t\tJSONObject jsonObject1 = (JSONObject) jsonObject.get(\"" + s.get(k) + "\");\n");
                            myWriter.write("\t\t" + Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName() + " " + Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName() +
                                    "1 = new " + Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName() + "();\n\n");


                            Set key_table_type = Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().keySet();
//                            System.out.println("not type  : ");
//                            System.out.println("key_table_type   =   " + key_table_type);
//                                System.out.println("key_table_type   =   "+ key_table_type);

                            to1 = key_table_type.iterator();
//            System.out.println("set key =  "+keys);
//                                Stack <String >strings1 = new Stack<>();
                            while (to1.hasNext()) {
                                s2.add(to1.next().toString());
                                //                                    strings1.push(to1.next().toString());
                            }
//                                while(!strings1.isEmpty()) {
//                s.add(to.next().toString());
//                                    s2.add(strings1.pop());

//                                }
                            System.out.println("s2 = " + s2);
                            for (int l = 0; l < key_table_type.size(); l++) {

                                if (Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().get(s2.get(l)).getName().equals("Number"))
                                {
                                    myWriter.write("\t\t" + "double " /*Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().get(s2.get(l)).getName()*/ + " " +
                                            s2.get(l) + l + "  = ((" + Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().get(s2.get(l)).getName() + ") " +
                                            "jsonObject1.get(\"" + s2.get(l) + "\")).doubleValue();\n"
                                            + "\t\t" + Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName() + "1." + s2.get(l) + " = " + s2.get(l) + l + " ;\n\n");
                                    }
                                if (Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().get(s2.get(l)).getName().equals("String"))
                                {
                                    myWriter.write("\t\t" + "String " /*Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().get(s2.get(l)).getName()*/ + " " +
                                            s2.get(l) + l + "  = ((" + Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().get(s2.get(l)).getName() + ") " +
                                            "jsonObject1.get(\"" + s2.get(l) + "\"));\n"
                                            + "\t\t" + Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName() + "1." + s2.get(l) + " = " + s2.get(l) + l + " ;\n\n");

                                }
                                if (Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().get(s2.get(l)).getName().equals("Boolean"))
                                {
                                    myWriter.write("\t\t" + "boolean " /*Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().get(s2.get(l)).getName()*/ + " " +
                                            s2.get(l) + l + "  = ((" + Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().get(s2.get(l)).getName() + ") " +
                                            "jsonObject1.get(\"" + s2.get(l) + "\"));\n"
                                            + "\t\t" + Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName() + "1." + s2.get(l) + " = " + s2.get(l) + l + " ;\n\n");


                                }
                                if(!Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().get(s2.get(l)).getName().equals("Number")
                                && !Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().get(s2.get(l)).getName().equals("String")
                                && !Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getColumns().get(s2.get(l)).getName().equals("Boolean"))
                                {


                                }
                            }
                            myWriter.write("\t\t temp.set" + s.get(k) + "(" + Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(k)).getName() + "1);\n\n");
                        }

                    }
                    myWriter.write("\t\t" + Main.symbolTable.getDeclaredTypes().get(i).getName() + ".data.add(temp);");
                    myWriter.write("\n } \n");


                    myWriter.write("\n\tstatic List <" + Main.symbolTable.getDeclaredTypes().get(i).getName() + ">" +   //Main.symbolTable.getDeclaredTypes().get(i).getName()+
                            "data = new ArrayList<" + Main.symbolTable.getDeclaredTypes().get(i).getName() + ">();" + "\n\n\n");


                    myWriter.write("\t\t\t public void set"/*+Main.symbolTable.getDeclaredTypes().get(i).getName()*/ + "data (" + "List <" + Main.symbolTable.getDeclaredTypes().get(i).getName() + ">" + Main.symbolTable.getDeclaredTypes().get(i).getName() + "){  \n" +
                            "\t\t\t\t this.data"/*+Main.symbolTable.getDeclaredTypes().get(i).getName()*/ + " = " + Main.symbolTable.getDeclaredTypes().get(i).getName() + "; }\n\n");

                    myWriter.write("\t\t\t public List<" + Main.symbolTable.getDeclaredTypes().get(i).getName() + "> getdata" +/*Main.symbolTable.getDeclaredTypes().get(i).getName()+*/ "(){ \n"
                            + " \t\t\t if(data==null){\n" +
                            "                     this.load();\n" +
                            "                 }\n\t\t\t\treturn this.data"/*+Main.symbolTable.getDeclaredTypes().get(i).getName()*/ + " ; }\n\n");

                    // print one object  list creat

                    myWriter.write("\tpublic void print_list()\n\t{\n" );
//                  for (int i1=0 ;i<Main.symbolTable.getDeclaredTypes().size() ; i1++)
                    for (int p=0 ; p<s.size(); p++) {

                    if(!Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(p)).getName().equals("Number")
                    &&! Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(p)).getName().equals("String")
                    &&! Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(p)).getName().equals("Boolean"))
                    {
                        Set column_type = null;
//                        System.out.println(" another type of address  :");
//                        for (int h=0 ;h<Main.symbolTable.getDeclaredTypes().size() ; h++)
//                            if(Main.symbolTable.getDeclaredTypes().get(h).getName().equals("address"))
//                                 column_type= Main.symbolTable.getDeclaredTypes().get(h).getColumns().keySet();
                        String n;
                        n = Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(p)).getName();
                        column_type= Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(p)).getColumns().keySet();
                         to2 = column_type.iterator();
                        while (to2.hasNext()) {
                            s3.add(to2.next().toString());
                        }
//                   System.out.println("tabel name =  "+n);
//                    System.out.println("set key =  "+column_type);
//                    System.out.println("s(p) = "+s.get(p));




//                        for (int ppn = 0 ; ppn < Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(p)).getColumns().size() ; ppn++)
                        for(int pp=0 ; pp<s3.size() ; pp++)
                        {
                            myWriter.write("\t\tSystem.out.println(\""/*+s.get(p)+"."*/+s3.get(pp)+"  =   \"+ this."+s.get(p)+"."+s3.get(pp)+");\n\n");
//                            System.out.println(" p333 ==  "+ Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(p)).getColumns().get(s3.get((ppn))).getName());  //.getColumns().get(s3.get(ppn)).getName());
                        }

                    }
// print object in ctrate class       else
//                        {
//                            myWriter.write("\t\tSystem.out.println(\""+s.get(p) +" = \" + this." +s.get(p)+");\n\n");
//                        }


                    }
                    myWriter.write("\n\t }\n");
                } else {
                    myWriter.write("\n\tstatic List <" + Main.symbolTable.getDeclaredTypes().get(i).getName() + ">" +   //Main.symbolTable.getDeclaredTypes().get(i).getName()+
                            "data = new ArrayList<" + Main.symbolTable.getDeclaredTypes().get(i).getName() + ">();" + "\n\n");


                    myWriter.write("\t\t\t public void set"/*+Main.symbolTable.getDeclaredTypes().get(i).getName()*/ + "data (" + "List <" + Main.symbolTable.getDeclaredTypes().get(i).getName() + ">" + Main.symbolTable.getDeclaredTypes().get(i).getName() + "){  \n" +
                            "\t\t\t\t this.data"/*+Main.symbolTable.getDeclaredTypes().get(i).getName()*/ + " = " + Main.symbolTable.getDeclaredTypes().get(i).getName() + "; }\n\n");

                    myWriter.write("\t\t\t public List<" + Main.symbolTable.getDeclaredTypes().get(i).getName() + "> getdata" +/*Main.symbolTable.getDeclaredTypes().get(i).getName()+*/ "(){ \n"
                            + "  \t\t\t\treturn this.data"/*+Main.symbolTable.getDeclaredTypes().get(i).getName()*/ + " ; }\n\n");

/*                  ||-----||      ||-----||
                    |\/\/\/\|______|\/\/\/\|
*                                        */
//                     void load for var class
//                    myWriter.write("\n\t\tvoid load() {\n" +
//                            "\t\tfor (int i = 0; i < "+Main.symbolTable.getCondition().get(0)+ ".data.size(); i++) {\n" );
//
//                    System.out.println(" i = "+i);
//                    System.out.println("s1221 = "+s);
////                    System.out.println("1 1 get flat name  =  "+Main.symbolTable.getFlat().get(0));
//
////                    for(int element_var= 0 ; element_var <s.size() ; element_var++)
//                    for(int element_var= 0 ; element_var <Main.symbolTable.getDeclaredTypes().size() ; element_var++)
////                    {       for (int si= 0 ; si <s.size() ; si++)
////                    { if( !Main.symbolTable.getDeclaredTypes().get(element_var).getName().equals(Main.symbolTable.getCondition().get(0))
//                    {
////                        System.out.println("----------- column----------- = "+s.get());
//                        for (int si=0 ; si<s.size() ; si++) {
//                            if (Main.symbolTable.getDeclaredTypes().get(element_var).getName().equals(Main.symbolTable.getFlat().get(0))
//                                    && !Main.symbolTable.getFlat().isEmpty()) {
////                            for(int tem= element_var ; tem<s.size() ; tem++)
////                            {
////                                if(Main.symbolTable.getDeclaredTypes().get(element_var).getName().equals(Main.symbolTable.getFlat().get(0)))
////                                {
////                                    System.out.println("2   get flat name  =  "+Main.symbolTable.getFlat().get(0));
////                                    myWriter.write( "\t\t\tthis.getdata().get(i)."+ s.get(element_var)+" = "+Main.symbolTable.getCondition().get(0)+".data.get(i)."+ Main.symbolTable.getFlat().get(1) +"."+s.get(tem) +";\n");
////
////                                    System.out.println("table  = " + Main.symbolTable.getDeclaredTypes().get(element_var).getName() );
////                                    System.out.println("colums = s = "+s.get(element_var));
//////                            System.out.println("type  = " + Main.symbolTable.getDeclaredTypes().get(element_var).getColumns().get(s.get(si)).getName() );
////                                    System.out.println("______________________________");
////                                }
////
////                            }
//                                System.out.println("2   get flat name  =  " + Main.symbolTable.getFlat().get(0));
//                                myWriter.write("\t\t\tthis.getdata().get(i)." + s.get(si) + " = " + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + Main.symbolTable.getFlat().get(1) + "." + s.get(si) + ";\n");
//
//                                System.out.println("table  = " + Main.symbolTable.getDeclaredTypes().get(si).getName());
//                                System.out.println("colums = s = " + s.get(si));
////                            System.out.println("type  = " + Main.symbolTable.getDeclaredTypes().get(element_var).getColumns().get(s.get(si)).getName() );
//                                System.out.println("______________________________");
//                            } else {
//                                myWriter.write("\t\t\tthis.getdata().get(i)." + s.get(si) + " = " + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + s.get(si) + ";\n");
//                            }
//                        }
//                        // don't show that if
////                        if(!Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(element_var)).getName().equals("Number")
////                       &&  !Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(element_var)).getName().equals("String")
////                       &&  !Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(element_var)).getName().equals("Boolean")){
////                          Set columns_type =Main.symbolTable.getDeclaredTypes().get(i).getColumns().keySet();
////                            to3 = columns_type.iterator();
////                            while (to3.hasNext()) {
////                                s4.add(to3.next().toString());
////                            }
////                            System.out.println("s4 = "+s4);
////                            for(int n=0 ; n<Main.symbolTable.getDeclaredTypes().get(element_var).getColumns().size() ; n++) {
////
////                                myWriter.write("\t\t\tthis.getdata().get(i)." + s.get(element_var) +s4.get(n) +" = " + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + s.get(element_var) +s4.get(n) +";\n");
////                            }
////                        }
//                    }
//
//                    myWriter.write("}\n" +
//                            "\t}\n\n");


                }





                //         set & get
                for (int j = 0; j < s.size(); j++) {
                    if (Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(j)).getName().equals("Number")) {

                        myWriter.write("\t\t\t public void set" + s.get(j) + "(double " + s.get(j) + "){\n" +
                                "\t\t\t\t this." + s.get(j) + " = " + s.get(j) + "; }\n\n");
                        myWriter.write("\t\t\t public double get" + s.get(j) + "(){\n" +
                                "\t\t\t\t return " + s.get(j) + "; }\n\n");

                    } else {
                        myWriter.write("\t\t\t public void set" + s.get(j) + "( " + Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(j)).getName() + "  " + s.get(j) + "){\n" +
                                "\t\t\t\t this." + s.get(j) + " = " + s.get(j) + "; }\n\n");
                        myWriter.write("\t\t\t public " + Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(s.get(j)).getName() + " get" + s.get(j) + "(){\n" +
                                "\t\t\t\t return this." + s.get(j) + "; }\n\n");

                    }
                }




//                void print()

                    if (Main.symbolTable.getDeclaredTypes().get(i).getName().startsWith("var")) {
//                        System.out.println("in var print ");

                        System.out.println("Column name =  " + Aggregationfunctionjar.ColumnName);
                        myWriter.write("\t\t  public void print() \n\t\t\t{\n" +
                                "\t\t" + Main.symbolTable.getCondition().get(0) + " " + Main.symbolTable.getCondition().get(0) + "1 = new " + Main.symbolTable.getCondition().get(0) + "();\n\t\t" +
                                Main.symbolTable.getCondition().get(0) + "1.load() ; \n");
                        for (int h = 0; h < Aggregationfunctionjar.Name1.size(); h++) {
                            System.out.println(" agg size =  " + Aggregationfunctionjar.Name1.size());
                            System.out.println(" agg  =  " + Aggregationfunctionjar.Name1);
                            myWriter.write("\t\t double  " + Aggregationfunctionjar.Name1.get(h) + "1 =0;\t\n");
                        }

                        myWriter.write("\t\t for (int i=0 ; i<" + Main.symbolTable.getCondition().get(0) + "1.getdata().size() ; i++) {\n");


//                            System.out.println("condition in  where write = "+Main.symbolTable.getCondition().get(1));
                        try {
                            if (Main.symbolTable.getCondition().get(1) != null) {
                                if (Main.symbolTable.getCondition().get(1).contains(".contains(\"")) {
//                                System.out.println("cond list =  =  "+Main.symbolTable.getCondition().get(1)+"\n like ");
                                    myWriter.write("\t\t\t\tif(" + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + Main.symbolTable.getCondition().get(1) + ") \n\t\t{\n");
                                } else {
//                                System.out.println("cond list 0 =  =  "+Main.symbolTable.getCondition().get(0)+"\n not like ");
//                                System.out.println("cond list 1=   =  "+Main.symbolTable.getCondition().get(1)+"\n not like ");

                                    myWriter.write("\t\t\t\tif(" + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + Main.symbolTable.getCondition().get(1) + ") \n\t\t{\n");
                                }
                            }
                        } catch (java.lang.IndexOutOfBoundsException e) {

                        }
                        myWriter.write("\t\t\tSystem.out.println(\"\\t\\t\\t block ==  \"+ (i+1));\n");

//                        myWriter.write("\t\t\t"+Main.symbolTable.getCondition().get(0)+".data.get(i).print_list();\n");
                        int count_print_object = 0;
                        for (int k = s.size() - 1; k >= 0; k--) {

                            if (!Main.symbolTable.column_in_table(Main.symbolTable.getCondition().get(0), s.get(k))) {
//                                System.out.println("in if  s ==  "+s.get(k) );
//                                System.out.println("in if  table ==  "+Main.symbolTable.getCondition().get(0) );
                                if (count_print_object < 1) {
                                    myWriter.write("\t\t\t" + Main.symbolTable.getCondition().get(0) + ".data.get(i).print_list();\n");
                                    count_print_object++;
                                }
                            } else {
                                myWriter.write("\t\t\tSystem.out.println(\" " + s.get(k) + "   =   \"+ " + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + s.get(k) + " +\"\\t \");\n\t\t\n");
                            }
//                                   }else{
//                                       myWriter.write("\t\t\tSystem.out.println(\" " + s.get(k) + "   =   \"+ " + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + s.get(k) + " +\"\\t|  \\t i = \"+i);\n");
//
//                                   }
                        }
                        // agg func in print
                        for (int o = 0; o < Aggregationfunctionjar.Name1.size(); o++) {
                            try {
                                if (Aggregationfunctionjar.Name1.get(o).equals("count")) {
                                    myWriter.write("\t\t\t " + Aggregationfunctionjar.Name1.get(o) + "1 =+ " + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + Aggregationfunctionjar.ColumnName1.get(o) + ";");
                                }
                                if (Aggregationfunctionjar.Name1.get(o).equals("max")) {
                                    myWriter.write("\t\tif(" + Aggregationfunctionjar.Name1.get(o) + "1 < " + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + Aggregationfunctionjar.ColumnName1.get(o) + ")" +
                                            "\n\t\t{\n\t\t\t " + Aggregationfunctionjar.Name1.get(o) + "1=" + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + Aggregationfunctionjar.ColumnName1.get(o) + "; \n\t\t}");
                                }
                                if (Aggregationfunctionjar.Name1.get(o).equals("min")) {
                                    myWriter.write("\t\tif(" + Aggregationfunctionjar.Name1.get(o) + "1 > " + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + Aggregationfunctionjar.ColumnName1.get(o) + ")" +
                                            "\n\t\t{\n\t\t\t " + Aggregationfunctionjar.Name1.get(o) + "1=" + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + Aggregationfunctionjar.ColumnName1.get(o) + "; \n\t\t}");
                                }
                                if (Aggregationfunctionjar.Name1.get(o).equals("avg")) {
                                    myWriter.write("\t\t\t " + Aggregationfunctionjar.Name1.get(o) + "1 =+ " + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + Aggregationfunctionjar.ColumnName1.get(o) + ";");
                                }
                                if (Aggregationfunctionjar.Name1.get(o).equals("sum")) {
                                    myWriter.write("\t\t\t " + Aggregationfunctionjar.Name1.get(o) + "1 =+ " + Main.symbolTable.getCondition().get(0) + ".data.get(i)." + Aggregationfunctionjar.ColumnName1.get(o) + ";");
                                }
                            } catch (NullPointerException e) {
                            }
                        }

                            try {
                                Main.symbolTable.getCondition().get(1);
//                               System.out.println("error in try ");
                                myWriter.write("\t\t\t\n}\n");

                            } catch (java.lang.IndexOutOfBoundsException e) {
                            }

//                        if(o < 1) {

                        myWriter.write("\t\tSystem.out.println(\"-------------------------------------------------\");");
                        myWriter.write("\t\t\t\n}\n");
//                        }
//                        System.out.println("ccvcc");
                        for (int o = 0; o < Aggregationfunctionjar.Name1.size(); o++)
                        {  try {

                                if (Aggregationfunctionjar.Name1.get(o).equals("avg"))
                                    myWriter.write("\t\t\t System.out.print(\"  " + Aggregationfunctionjar.Name1.get(o) + "  = \"+  " + "(" + Aggregationfunctionjar.Name1.get(o) + "1 / " + Main.symbolTable.getCondition().get(0) + ".data.size() )" + " );\n\n");
                                else
                                    myWriter.write("\t\t\t System.out.print(\"  " + Aggregationfunctionjar.Name1.get(o) + "1  = \"+  " + Aggregationfunctionjar.Name1.get(o) + "1);\n\n");
                            } catch (NullPointerException e) {
                            }
                    }
                        myWriter.write("\t}\n");
            }
                   myWriter.write("\t\t } ");
                myWriter.write(" \n \n\n\n\n");
                //   myWriter.write("___________________________________________________________________\n");
                //  myWriter.close();
                myWriter.flush();
                //    System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            s.removeAll(s);

        }
    }




}
