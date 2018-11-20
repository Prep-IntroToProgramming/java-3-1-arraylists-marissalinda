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
      CatList.get(2).setName("Belle");
      CatList.get(3).setName("Dex");
    }
}
