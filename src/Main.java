import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /* Garden garden1=new Woods("Ель",5,100,15);
Woods woods=new Woods("сосна",8,120,15);
Garden garden11=new Flowers("rosa",2,12);*/
        ArrayList<Garden> qqq=new ArrayList();

        qqq.add(new Flowers("fialka",1, 45));
        qqq.add(new Flowers("rosa",2, 40));
        qqq.add(new Woods("sosna",4, 100,15));
        System.out.println(qqq);
        System.out.println("_______________________________________________");
        sesonSeveral(2,qqq);

      //  System.out.println(qqq.get(0).getGrowth());
        //System.out.println(Season.winter());
      //  System.out.println(garden1.growPlants());
      //  System.out.println(garden11.growPlants());

      // garden1.setHeigth(garden1.heigth + woods.growth);

     //   System.out.println(garden1.heigth );
     //   garden11.setHeigth(garden11.heigth+ garden11.getGrowth());
     //   System.out.println(garden11.heigth );
        //System.out.println("Hello world!");
    }
    public  static  void sesonSeveral(int seson, ArrayList<Garden> gardens){

        if (seson>1){
            for (int j = 1; j <= seson; j++) {
                System.out.println("сезон "+j);
                for (int i = 0; i < gardens.size() ; i++) {
                    System.out.println(gardens.get(i).growPlants());

                }

            }


        }

    }
}