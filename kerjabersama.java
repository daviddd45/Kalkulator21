import java.util.Scanner;
public class CalculatorToko {
public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);

System.out.print("Masukan harga barang =");
double hargaSayuran=scanner.nextDouble();
double subTotal=hargaBarang + hargaSayuran ;

double pajak =subTotal *1;
double tips =subTotal *0.010;
double total=subTotal + pajak + tips;

System.out.println("subTotal :" + subTotal);
System.out.println("pajak :" + pajak);
System.out.println("tips :" + tips);
System.out.println("total :" + total);
}
}
