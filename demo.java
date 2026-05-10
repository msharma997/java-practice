class Main1  {
    int a ;
    string name; 
    Main1() {
        a = 0;
        name= null;
    
    }
void display() {
    System.out.println("value of a: " + a);
    System.out.println("Name:"+ name);

}
}
public class main {
    public static void main( String[] args){
    Main1 obj = new Main1();
    obj.display();
}
}