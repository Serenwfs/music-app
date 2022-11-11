import java.util.LinkedList;
import java.util.Random;
public class playlist extends contentColl implements Comparable<contentColl>{
  protected LinkedList<content>collection; // add a memeber variable fro the list of conrtent(either song of playlst)

  public playlist(String t){ // constructor for playlist
    super(t); // access the parent class method
    collection = new LinkedList<content>(); // add the assignment of the collection
  }

  public void add(content c){ // add method takes in a content
    this.collection.add(c); // add the content to the colllection
  }

  public void remove(content c){ // takes in a content
    this.collection.remove(c); // remove that content from the collection
  }

  public void shuffle(){ // impliment the shuffle method
    for(int i = 0; i<this.collection.size();++i){
      Random randGen = new Random();
      int num = randGen.nextInt(this.collection.size()); // get random number
      content c = this.collection.get(num); // get a content at that position
      c.play(); // play that content
    }
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



  public int compareTo(playlist p){ // compare method
    int result = super.compareTo(p);
    return result;
  }

  // mutators
  public void setTitle(String t){ // for the title
    super.setTitle(t);
  }

  public void setColl(LinkedList<content> c){ // for the collection
    collection = c;
  }


  // accessors

  public String getTitle(){ // for the title
    String s = super.getTitle();
    return s;
  }

  public LinkedList<content> getColl(){ // for the collection
    return collection;
  }


}
