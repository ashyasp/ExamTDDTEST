package assessment;

import java.util.ArrayList;

public class SocialHandle {
    private static ArrayList<String> handles = new ArrayList<>();


    public String checkHandle (String userInput){
        if (userInput == null) {
            throw new NullPointerException("Input cannot be empty or blank");
        }
if (userInput.trim().isEmpty()) {
    throw new IllegalArgumentException("Input cannot be empty");
}
String handle= userInput.toLowerCase().substring(0,Math.min(userInput.length(),10));
handle="@"+handle;
return handle;
    }
    public void addHandle (String input){
        String handle= checkHandle(input);
        if (!handles.contains(handle)){
            handles.add(handle);
        }
    }
    public String removeHandle(String handle){
     handles.remove(handle);
        return "@ ";
    }

    public String updateHandle(String updated) {
        String newHandle = removeHandle(updated);
        if (!handles.contains(newHandle)) {
            handles.add(newHandle);
        }
//public static int getHandleCount(){
//        return handles.size();
//
//}
return newHandle;

        public void createFile(){

        }
    }
}
