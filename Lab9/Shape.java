package Lab9;
import java.util.ArrayList;

public abstract class Shape {
     public double x;
     public double y;
     public int varlikID;
     private static ArrayList<Shape> list =new ArrayList();

     public Shape(double x,double y){
         varlikID=list.size()-1;
         this.x=x;
         this.y=y;
         list.add(this);
         varlikID++;
     }
      public abstract double area();
      public abstract double perimeter();
      public  void sil(int ID){
          System.out.print(ID+" is REMOVED \n");
          list.remove(ID);

      }
     public void list(){
          for(int i=0;i<list.size();++i){
              System.out.print("Created in "+list.get(i).varlikID+" place.\n");
              System.out.print("X: "+ list.get(i).x+"\n");
              System.out.print("Y: "+list.get(i).y+"\n");


          }
     }
     public void top(){
         System.out.print("Shape Class: "+list.get(list.size()-1).getClass().getSimpleName()+"\n");
         System.out.print("X: "+ list.get(list.size()-1).x+"\n");
         System.out.print("Y: "+list.get(list.size()-1).y+"\n");
         System.out.print("Area: "+ list.get(list.size()-1).area()+"\n");
         System.out.print("Perimeter: "+list.get(list.size()-1).perimeter()+"\n");
     }
}
