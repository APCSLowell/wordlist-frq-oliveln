import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int counter = 0;
    for(int i = 0; i < myList.size(); i++){
      if(myList.get(i).length() == len){
        counter++;
      }
    }
    return counter;
  }

  public void removeWordsOfLength(int len)
  {
    int counter = 0;
    for(int i = myList.size() - 1; i >= 0; i--){
      if(myList.get(i).length(0 == len){
        myList.remove(i);
      }
    }
  }
