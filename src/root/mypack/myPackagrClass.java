package root.mypack;

public class myPackagrClass {
   public int test=22;
  public myPackagrClass(int test ){
int v = test > 0 ? test : 3;
       this.test = v;
   }

    public  static void main(String[] args){
        System.out.println("From my Package class");
    }
}
