import java.util.LinkedList;
import java.util.Random;
public class album extends contentColl implements Comparable<contentColl>{
  protected LinkedList<song>collection; // add member variable forthe song

  public album(String t){ // constructor for the album
    super(t);
    collection = new LinkedList<song>(); // add the collection
  }

  public void add(song c){ // add method takes in a song
    this.collection.add(c); // add the content to the collection

  }

  public void remove(song c){ // remove method takes in a song
    this.collection.remove(c); // remove that song from the collection
  }

  public String toString(){ // to string method
    String s = super.toString(); // get the result fromthe parent class and assign it to a new class
    for(content c: this.collection){
      s+=c+"\n"; // pretty print all the content
    }
    return s;
  }

  public int size(){ // size method to get the size of the Collection list
    int size = collection.size();
    return size;
  }


  public int compareTo(album a){ // compare method
    int result = super.compareTo(a);
    return result;
  }

  // mutators
  public void setTitle(String t){ // for the title
    super.setTitle(t);
  }

  public void setColl(LinkedList<song> c){ // for the collection
    collection = c;
  }


  // accessors

  public String getTitle(){ // for the title
    String s = super.getTitle();
    return s;
  }

  public LinkedList<song> getColl(){ // for the collection
    return collection;
  }


}
