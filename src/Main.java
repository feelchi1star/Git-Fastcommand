import root.mypack.myPackagrClass;
public class Main {


  public static void main(String[] args){
      myPackagrClass mp = new myPackagrClass(0);
      System.out.println(mp.test);



  }

}

 class Person{
     private String name;


     //Getter
     public String getName(){
         return name;
     }


     //Setter
     public void setName(String newName){
         this.name =newName;

     }

 }
