package fr.uga.devops;
import org.junit.*;
public class TestDatafram {
    public Datafram data;


    @Test
    public void testConstructeur2(){
        System.out.println(System.getProperty("user.dir"));
        Datafram d = new Datafram("src/main/resources/csvTest.csv");
    }



}
