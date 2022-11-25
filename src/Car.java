public class Car {
   int modelYear;
  private final String modelName;

    //   Class Constructor Parameter
    public  Car(String name,int year){
        modelName=name;
        modelYear=year;
    }

    public void Print(){
        System.out.println(modelName);
    }

}
