import java.util.Scanner;
public class Main {
    static int r;
    public static int reverse(int arithmos){
        if(arithmos>0){
            r=(r*10)+(arithmos % 10);
            reverse(arithmos/10);
        }
        return r;
    }
    public static int power(int a,int n){
        int p;
        if(n==0){
            p=1;
        }
        else{
            p=a*power(a,n-1);
        }
        return p;
    }
    public static void moveDisks(int n, char polos1, char polos3, char polos2){ 
        if (n == 1) { 
            System.out.println("metakinise ton disko 1 apo ton polo " +  polos1 + " sto " + polos3); 
            return; }
        moveDisks(n-1, polos1, polos2, polos3); 
        System.out.println("metakinise to disko " + n + " apo ton polo " +  polos1 + " ston polo " + polos3); 
        moveDisks(n-1, polos2, polos3, polos1);
    } 
    
    public static void main(String[] args) {
        Scanner isodos = new Scanner(System.in);
        System.out.println("dose ton arithmo kai ton ektheti");
        System.out.println(power(isodos.nextInt(),isodos.nextInt()));
        System.out.println("Dose arithmo gia anastrofi");
        System.out.println(reverse(isodos.nextInt()));
        System.out.println("Dose ton arithmo ton diskon");
        int disks=isodos.nextInt();
        moveDisks(disks,'A','C','B');
    }
    
}
