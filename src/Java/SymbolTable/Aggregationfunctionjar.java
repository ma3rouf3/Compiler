package Java.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class Aggregationfunctionjar {

    public static String Name ;
    public static List<String> Name1 =new ArrayList<>();
    public static String ColumnName ;
    public static List <String> ColumnName1 =  new ArrayList<>();
    public String getColumnName() {
        return ColumnName;
    }

    public void setColumnName(String columnNamename) {
        this.ColumnName = columnNamename;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public static Double avg(List<Double> numbers){
        if(numbers == null)
            return 0.0;
        else
            return numbers.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
    }

    public static Double sum(List<Double> numbers){
        if(numbers == null)
            return 0.0;
        else
            return numbers.stream().mapToDouble(Double::doubleValue).sum();
    }

    public static Double max(List<Double> numbers){
        if(numbers == null)
            return 0.0;
        else
            return numbers.stream().mapToDouble(Double::doubleValue).max().getAsDouble();
    }

    public static Double min(List<Double> numbers){
        if(numbers == null)
            return 0.0;
        else
            return numbers.stream().mapToDouble(Double::doubleValue).min().getAsDouble();
    }

    public static long count(List<Double> numbers){
        if(numbers == null)
            return 0;
        else
            return numbers.stream().mapToDouble(Double::doubleValue).count();
    }

    public static void calculate(List<Double> ColumnName)
    {
        if(Name == "avg")
        {
            System.out.println("avg ="+avg(ColumnName));
        }
        if(Name == "sum")
        {

            System.out.println("sum ="+sum(ColumnName));

        }  if(Name == "max")
    {

        System.out.println("max ="+max(ColumnName));

    }  if(Name == "min")
    {

        System.out.println("min ="+min(ColumnName));


    }  if(Name == "count")
    {

        System.out.println("count ="+count(ColumnName));

    }
    }
}
