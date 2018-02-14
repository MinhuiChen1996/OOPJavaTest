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
	System.out.pritnln(String b);
  }  

}

public class TuneBook
{
   ArrayList<Tune> tunes = new ArrayList<Tune>();
   
   public TuneBook()
   {
     loadTune();
   }
   
   public void loadTune()
   {
     BufferedReader inputStream = null;
	 
	 try
	 {
	  inputStream = new BufferedReader(new FileReader("hnjo.abc.txt")); 
	  
	  String l;
	  while((l = inputStream.readLine()) != null)
	  {
	    tune.add(l);
	  }
	 }
	 catch (IOException e)
	 {
	   e.printStackTreace();
	 }
	 finally
	 {
	   if(inputStream != null)
	   try
	   {
	     inputStream.close();
	   }
	   catch(Exception e)
	   {
	     e.printStackTrace();
	   }
	 }
   }
   
   public String toString()
   {
     StringBuffer sb = new StringBuffer();
     for(String tune:tunes)
	 {
       sb.append(word + ", ");
     }

     return sb.toString();
   }
   
   public Tune findTune(String title)
   {
     int closestEd = Integer.MAX_VALUE;
	 String closeetTune = "";
	 for(tune t:tunes)
	 {
	   int ed = EditDistance.MinimumEditDistance(title, t);
	   if(ed == 0)
	   {
	     return title;
	   }
	   if (ed < closestEd)
	   {
	     closestEd = ed;
		 closestTune = t;
	   }
	 }
   }
   
   interface Player
   {
     void play();
   }
   
   
    public static void main(String[] args)
	{
	  TuneBook tb = new TuneBook("hnjo.abc");
	  System.out.println(tb);
	  
	  Tune t = tb.findTune("Scotsman over the Border");
	  t.play();
	}
}

