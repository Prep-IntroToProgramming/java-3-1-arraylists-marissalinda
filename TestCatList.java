import java.util.ArrayList;
public class TestCatList
{
    public static void main(String[] args){
        ArrayList<Cat> CatList = new ArrayList<Cat>();
        for(int i=0; i<4; i++){
            CatList.add(new Cat());
        }
        CatList.get(0).setName("John");
        CatList.get(1).setName("Mary");
        CatList.get(2).setName("Mark");
        CatList.get(3).setName("Dido");
        for(Cat Cat: CatList){
            Cat.setWeight(Math.random()*10+5);     
        }
        System.out.println(CatList.get(0).getName() + " weighs " + CatList.get(0).getWeight() + " pounds");
        CatList.get(0).meow();
        System.out.println(CatList.get(1).getName() + " weighs " + CatList.get(1).getWeight() + " pounds");
        CatList.get(1).meow();    
        System.out.println(CatList.get(2).getName() + " weighs " + CatList.get(2).getWeight() + " pounds");
        CatList.get(2).meow();
        System.out.println(CatList.get(3).getName() + " weighs " + CatList.get(3).getWeight() + " pounds");
        CatList.get(3).meow();
    }
}
