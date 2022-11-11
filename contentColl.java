import java.util.LinkedList;
import java.util.Random;
public class contentColl implements Comparable<contentColl>{ // make it abstract to implimet the shuffle method after
  protected String title;
  protected LinkedList<content>collection;


  public contentColl(String t){ // constructor
    title = t;
  }

  public String toString(){
    String s ="";
    s+=title+"\n"; // pretty print the title
    return s;
  }


  public int compareTo(contentColl c){ // compare method
    int result = 8;
    if(this.collection.size() > c.collection.size()){ // if the number of content is greater
      result =1; //we will return 1
    }
    if(this.collection.size() < c.collection.size()){ // if the number of content is inferior
      result =-1; //we will return -1
    }
    if(this.collection.size() == c.collection.size()){ // if the number of content is thesame
      result =0; //we will return 0
    }
    return result;
  }

  //mutators

  public void setTitle(String t){ // for the title
    title = t;
  }
  // accessor

  public String getTitle(){ // for the title
    return title;
  }

}
