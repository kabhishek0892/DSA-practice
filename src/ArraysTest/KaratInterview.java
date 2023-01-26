package ArraysTest;

import java.util.*;

public class KaratInterview {
    public static void main(String[] args) {
     String[][] users = {
             {"Martha", "exit"},
             {"Paul", "enter"},
             {"Martha", "enter"},
             {"Martha", "exit"},
             {"Jennifer", "enter"},
             {"Paul", "enter"},
             {"Curtis", "exit"},
             {"Curtis", "enter"},
             {"Paul", "exit"},
             {"Martha", "enter"},
             {"Martha", "exit"},
             {"Jennifer", "exit"},
             {"Paul", "enter"},
             {"Paul", "enter"},
             {"Martha", "exit"}
     };

     //Logged exit but dint log entry
     Set<String> invalidEntry  = new HashSet<>();
     //logged entry and when its not empty means they didnt exit
     Set<String> validEntry = new HashSet<>();
     for(String[] arr: users){

         String name = arr[0];
         String action = arr[1];

         switch (action){
             case "exit":{
                 if(validEntry.contains(name)){
                     validEntry.remove(name);
                 }
                 else{
                     invalidEntry.add(name);
                 }
                 break;
             }
             case "enter":{
                 validEntry.add(name);
                 break;
             }
         }

        }
        System.out.println("Case 1"+validEntry);
        System.out.println("Case 2"+invalidEntry);
    }

}
