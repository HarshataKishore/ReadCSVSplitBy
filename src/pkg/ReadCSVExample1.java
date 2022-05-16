package pkg;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;  
import java.io.IOException;  
import java.io.FileNotFoundException;

public class ReadCSVExample1 
{  
public static void main(String[] args)  throws IOException
  { 
File csvFile = new File("C:/WorkSpaceCode/CSVexample.csv");
BufferedReader br = new BufferedReader(new FileReader(csvFile));  
String line =  " ";
try {
	while ((line = br.readLine()) != null)   //returns a Boolean value  
         {  
String[] employee = line.split(",");    // use comma as separator  
System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] +"]");  
         }  
      }   
catch (FileNotFoundException e)   
      {  
e.printStackTrace();  
      }  
   }  
}  