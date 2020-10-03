//姓名 : 鍾明智
//學號 : 107213067
import java.util.Scanner;
class PhoneData {
    String Name;
    String Phone;
    public PhoneData(String Name,String Phone) {
        this.Name = Name;//name as name
        this.Phone = Phone;//phone as phone
    }
}
public class PhoneBook { //class to show or find contact
    public static void nocommand(String type,String find,String show){
        if (type.equals(find)||type.equals(show));// nocommand method
        else{
            System.out.println("No such instruction");
        }
    }
    public static void find(String type,int n,PhoneData[] data,String find,String masukan) {
        int none = 0;// marker for there have the contact or not
        if (type.equals(find)) {//find method
            for (int i = 0; i < n; i++) {//searching contact
                if (data[i].Name.equals(masukan)) {
                    none = 1; //marker value change, cause there found contact match
                    System.out.println("Name: "+data[i].Name+", Phone: "+data[i].Phone);
                }
            }
            if (none == 0)//there no contact that named you type
                System.out.println("Check no such person");
        }
    }
    public static void show (String type,int n,PhoneData[] data,String show) {
        if (type.equals(show)) {//show method
            for (int i = 0; i < n; i++) {
                System.out.println("Name: "+data[i].Name+", Phone: "+data[i].Phone);
            }
        }
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//input number of contact you want to input
        PhoneData[] data = new PhoneData[n];//make new data object
        String show = "show"; //show as show
        String find = "find"; ////find as find
        for ( int i = 0; i < n; i++) {//for input name and number
            data [i] = new PhoneData(input.next(),input.next());
        }
        while(input.hasNext()) {//run again and again
            String type = input.next();//to input show or find
            if (type.equals(find))//if input was find
                find(type,n,data,find,input.next());//run find method
            else{
                show(type,n,data,show);//run show method
                nocommand(type,show,find);//run nocommand method
            }
        }
    }
}