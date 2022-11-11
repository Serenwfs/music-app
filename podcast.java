public class podcast extends content{
  protected int episodeNum; // add a member variable for  the episode number

  public podcast(){ // default constructor
    super();
    episodeNum = -1;
  }

  public podcast(String t, artist a, String g, int e){ // overloaded constructor for one genre
    super(t,a,g);
    episodeNum = e; // add  the episode number
  }

  public podcast(String t, artist a, String g1, String g2, int e){ // overloaded constructor for two genres
    super (t,a,g1,g2);
    episodeNum = e; // add  the episode number

  }
  public podcast(String t, artist a, String g1, String g2, String g3, int e){ // overloaded constructor for three genres
    super (t,a,g1,g2);
    episodeNum = e; // add  the episode number
  }
  public void play(){ // play method from the parent
    super.play();
    
  }

  public String toString(){ //to string  from the parent
    String s=super.toString(); // we assign it to a string
    s+= "Episode: " + episodeNum+" ";
    return s; //the string
  }

  public int compareTo(content c){ // compare to from the the paremtere
    int result = super.compareTo(c); // assign the result to a string
    return result;

  }
}
