public class song extends content implements Comparable<content>{ // implement the comparable interface

  public song(){ // default constructor
    super ();
    }

  public song(String t, artist a, String g){ // overloaded constructor is one genre
    super (t,a,g);
    }

  public song(String t, artist a, String g1, String g2){ // overloaded constructor for two genres
    super (t,a,g1,g2);

  }
  public song(String t, artist a, String g1, String g2, String g3){ // overloaded constructor for three genres
    super (t,a,g1,g2);
  }


  public void play(){ // use  the play method from the parent class
    super.play();
    }

  public String toString(){ // toString method from the parent class
    String s = super.toString();
    return s;
  }

  public int compareTo(content c){ // use compare to
    int result = super.compareTo(c);
    return result;
    }
}
