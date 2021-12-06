public class Addamount {
    int Amount=50;
    public Addamount(){

    }
    public Addamount(int a){
        Amount=a+Amount;
    }

    public void displayAmount(){
        System.out.println(Amount);
    }
}
class ans{
    public static void main(String[] args) {
        Addamount A= new Addamount();
        Addamount B = new Addamount(40);
        A.displayAmount();
        B.displayAmount();
    }
}