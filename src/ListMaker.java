import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker
{    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args)
    {
    Scanner pipe = new Scanner(System.in);
    final String menu = "A - Add, D - Delete, P - Print, Q - Quit" ;
    boolean done = false;
    String opt ="";
    String data ="";
    boolean var;
    do
    {
        displayList();
        //Get the user input for the option
         //Display the menu/options

            opt = SafeInput.getRegExString(pipe, menu, "[AaDdPpQq]");
            opt = opt.toUpperCase();

            //Runs options

              switch(opt)
              {
                  //adds to the list
                  case "A":
                  if(list.size() == 0)
                  {
                     list.add(SafeInput.getNonZeroLengthString(pipe, "Enter information"));
                      list.add(0,data);
                     break;
                  }
                  //removes items from the list
                  case "D":
                      break;
                  //Prints the list
                  case "P":
                      if(var int i; i = list.size();){
                          System.out.println("-------------------------------------------------------------------------------------");
                          if (list.size() != 0) {
                              for (int i = 0; i < list.size(); i++) {
                                  System.out.println(list);
                              }
                          } else
                              System.out.println("---                               List is currently empty                         ---");
                          System.out.println("-------------------------------------------------------------------------------------");
                          break;
                      }
                      //Quits the program
                  case "Q":
                      System.exit(0);
                      break;

              }
                      System.out.println("Your option is " + opt);
    }while(!done);





    }

    private static void displayList()
    {
        System.out.println("-------------------------------------------------------------------------------------");
        if(list.size() != 0)
        {
            for (int i = 0; i < list.size(); i++)
            {
                System.out.printf("%3d%40s", i + 1, list.get(i));
            }
        }
        else
            System.out.println("---                               List is currently empty                         ---");
        System.out.println("-------------------------------------------------------------------------------------");
    }
}