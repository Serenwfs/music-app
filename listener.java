import java.util.LinkedList;
public class listener extends account{
  protected LinkedList<content>favorite; // add memener variable for the favorite list

  public listener(){
    super();
  }

  public listener(String u){
    super(u);
  }

  public void add(content c){ // override the add method
    favorite.add(c);
  }

  //ACCESORS

  public String getUserName(){
    String s = super.getUserName();
    return s;
  }


  public LinkedList<content> getfav(){ // create a a favorite accessors
    return favorite;
  }


// MUTATOR

  public void setUsernam(String u){
    super.setUsernam(u);
  }


  public void set(LinkedList<content> f){ // create a a favorite mutators
    favorite = f;
  }

//TOSTRING

  public String toString(){
    String s = super.toString(); // call the parent to string and assign it to a string
    for(content c: favorite){ // get all the content from the favorite list
      s+=c+"\n";
    }
    return s; // return the string
  }
}
