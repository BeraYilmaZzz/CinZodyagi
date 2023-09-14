import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        int ay ;
        String burç = "" ;
        Scanner inp = new Scanner(System.in) ;
        System.out.print("Doğum yılınızı giriniz : ");
        ay = inp.nextInt();
        if(ay%12 == 0) {
            burç = "Maymun";
        }else if  (ay%12 == 1){
            burç = "Horoz" ;
        }else if (ay%12 == 2 ){
            burç ="Köpek" ;
        }else if (ay%12 == 3 ) {
            burç = "Domuz" ;
        }else if (ay%12 == 4 ) {
            burç = "Fare" ;
        }else if (ay%12 == 5 ) {
            burç = "Öküz" ;
        }else if (ay%12 == 6 ) {
            burç = "Kaplan" ;
        }else if (ay%12 == 7 ) {
            burç = "Tavşan" ;
        }else if (ay%12 == 8 ) {
            burç = "Ejderha" ;
        }else if (ay%12 == 9 ) {
            burç = "Yılan" ;
        }else if (ay%12 == 10 ) {
            burç = "At" ;
        }else if (ay%12 == 11 ) {
            burç = "Koyun" ;
        }
        System.out.println("Çin Zodyağı Burcunuz :"+ burç);
    }
}
/* if(DEĞER % SAYI == KALAN ) /*