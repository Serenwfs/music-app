
public class content implements Comparable<content>{
  protected String title; //member variable for the title
  protected artist m_artist; //member variable for the artist
  protected String genre1;//member variable for the first genre
  protected String genre2; //member variable for the second genre
  protected String genre3;//member variable for the third genre
  protected int streams;//member variable for the title

  public content(){ // default constructor
    title = "none";
    m_artist = null;
    genre1 = "none";
    genre2 = "none";
    genre3 = "none";
    streams = -1;
  }

  public content(String t, artist a, String g){ // overloaded constructor  with 1 genre
    title = t;
    m_artist = a;
    genre1 = g;
  }

  public content(String t, artist a, String g1, String g2){ // overloaded constructor  with 2 genre
    title = t;
    m_artist = a;
    genre1 = g1;
    genre2 = g2;

  }
  public content(String t, artist a, String g1, String g2, String g3){  // overloaded constructor  with 3 genre
    title = t;
    m_artist = a;
    genre1 = g1;
    genre2 = g2;
    genre3 = g3;
  }


  public void play(){ // add the 1 to the streams whem the song is played
    streams++;
  }

  public int compareTo(content c){ // compare to method
    int result=9;
    if(this.streams>c.streams){ // if the number of streams is superior
      result = 1; // we will return 1
    }
    if(this.streams<c.streams){ // if the number of streams is inferior
      result = -1; // we will return -1
    }
    if(this.streams==c.streams){  // if the number of streams are equal
      result = 0; // we will return 0
    }
    return result;
  }

  public String toString(){ // to string method
    String s=""; //create a string
    s+= title+": "+m_artist.toString()+", genre: "+genre1+" "; // add the member variable to the string
    if (genre2 != null){ // if there is a second genre add it to the string
      s+=", " + genre2+" ";
    }
    if (genre3 != null){ // if there is a third genre add it to the string
      s+=", "+ genre3+" ";
    }
    return s;
  }



}
