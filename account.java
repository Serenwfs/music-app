import java.util.LinkedList;
public abstract class account{
  protected String username;

  public account(){ // default constructer
    username = "None";
  }

  public account(String u){ // overloaded conttrector
    username = u;
  }

  //ACCESORS

  public String getUserName(){
    return username;
  }


// MUTATOR 

  public void setUsernam(String u){
    username =u;
  }


//TOSTRING

  public String toString(){ // to tring method
    String s = ""; //create a string
    s+= this.username;  //  add the username
    return s;
  }

}
