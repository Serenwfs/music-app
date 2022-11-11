public class artist extends account{

  public artist(){ // default constructor
    super();
  }

  public artist(String u){ //overloaded constructor
    super(u);
  }

  //ACCESORS from the parent class

  public String getUserName(){
    String s = super.getUserName();
    return s;
  }



// MUTATOR

  public void setUsernam(String u){
    super.setUsernam(u);
  }


//TOSTRING

  public String toString(){
    String s = super.toString(); // call to the parent class
    return s;
  }
}
