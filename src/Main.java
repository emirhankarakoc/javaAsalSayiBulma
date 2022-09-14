public class Main {
    public static void main(String[] args) {


int emir=1;

while(emir<=100){
    asalMi(emir);
    emir++;
}
    }
    public static void asalMi(int deger){
        int toplam=0;
        for (int i=1;i<=deger;i++){
            if (deger%i==0){
                toplam++;
            }
        }
        if (toplam<=2){
            System.out.print(deger + " ");
        }
    }
}