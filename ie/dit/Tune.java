package ie.dit;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;
public class Tune
{
  private int x;
  private String title;
  private String altTitle;
  private String notation; 
  
  public int getX()
  {
    return x;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public String getAltTitle()
  {
    return altTitle;
  }
  
  public String getNotation()
  {
    return notation;
  }
  
  public String toString()
  {
    StringBuffer s = new StringBuffer();
    String s = getX() +", "+ getTitle() +", " +getAltTitle();
    return s;
  }
  
  public class Play implements Player
  {
    String b = getNotation;
	//System.out.pritnln(String b);
  }  

}