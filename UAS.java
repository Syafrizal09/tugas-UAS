/**
 * Program Uas
 * Nama : <<Syafrizal>>
 * kelas: <<Tif 1b>>
 **/
import java.util.*;
public class UAS{
	public static void main(String[]args){
		System.out.println("\t\t\t\t\t  Hallo Selamat Datang Di Program Mesin Kasir");
		System.out.println("\t\t\t\t\t\t\tPOLITEKNIK KAMPAR");
		String data[]={"admin","sandi"};
		String nama,sandi;
		System.out.print("\t\t\t===============");
		System.out.print("\t\t\t==POLKAM MART==");
		System.out.println("\t\t\t===============");
		Scanner apa=new Scanner(System.in);
		System.out.print("\t\t\tNama Pengguna : ");
		nama=apa.nextLine();
		System.out.print("\t\t\tSandi Pengguna : ");
		sandi=apa.nextLine();
		/**
		 * Percabangan untuk mengecek keberadaan 
		 * data
		 */
		if(nama.equals(data[0])&&sandi.equals(data[1])){
			System.out.println("\t\t\tSELAMAT DATANG");
			menu();
		}else{
			System.out.print("\t\t\tMaaf Nama Pengguna Atau Sandi Tidak Tersedia");
		}
	}

	/**
	 * Menu Sistem
	 */
	static void menu(){
		System.out.println("\t\t\t1. Penjualan");
		System.out.println("\t\t\t2. Pengurutan");
		System.out.println("\t\t\t3. Tambah Data");
		System.out.println("\t\t\t4. Luas Bangun Datar");
		System.out.println("\t\t\t5. Menghitung Volume");
		System.out.println("\t\t\t6. Keluar");
		Scanner apa=new Scanner(System.in);
		int menu;
		System.out.print("\t\t\tSilahkan Masukkan Menu : ");
		menu=apa.nextInt();
		if(menu==1){
			penjualan();
		}else if(menu==2){
			Pengurutan();
		}else if(menu==3){
			TambahData();
		}else if(menu==4){
			LuasBangunDatar();
		}else if(menu==5){
			MenghitungVolume();
		}else{
			System.exit(0);
		}

	}

	/**
	 * Fungsi Penjualan
	 */
	static void penjualan(){
		String barang[]=new String[3];
		int harga[]=new int[3], total, bayar;
		Scanner b1=new Scanner(System.in);
		Scanner h1=new Scanner(System.in);

			System.out.println("\t\t\t**********======================**********");
			System.out.println("\t\t\t|=====         POLKAM MART         ======|");
			System.out.println("\t\t\t|=======          KASIR          ========|");
			System.out.println("\t\t\t**********======================**********");
		System.out.print("\t\t\tMasukkan Nama Barang Pertama : ");
		barang[0]=b1.nextLine();
		System.out.print("\t\t\tMasukkan Harga Barang Pertama : ");
		harga[0]=h1.nextInt();
		System.out.print("\t\t\tMasukkan Nama Barang Kedua : ");
		barang[1]=b1.nextLine();
		System.out.print("\t\t\tMasukkan Harga Barang Kedua : ");
		harga[1]=h1.nextInt();
		System.out.print("\t\t\tMasukkan Nama Barang Ketiga : ");  
		barang[2]=b1.nextLine();
		System.out.print("\t\t\tMasukkan Harga Barang Ketiga : ");
		harga[2]=h1.nextInt();

		total=harga[0]+harga[1]+harga[2];
		System.out.println("\t\t\t     List barang                    harga barang            ");
		System.out.println("\t\t\t     "+barang[0]+"                         Rp. "+harga[0] );
		System.out.println("\t\t\t     "+barang[1]+"                         Rp. "+harga[1] );
		System.out.println("\t\t\t     "+barang[2]+"                         Rp. "+harga[2] );
		System.out.println("\t\t\t     Total                      Rp. "+total);
		System.out.print("\t\t\tMasukkan Pembayaran: ");
		bayar=h1.nextInt();
		System.out.println("\t\t\tKembalian : Rp. "+(bayar-total));
		System.out.println("\t\t\t|            TERIMA KASIH TELAH BERKUNJUNG                 |");
		System.out.println("\t\t\t|        **********======================**********        |");
		System.out.println("\t\t\t|______________________*********___________________________|");
		menu();
	}
	/**
	 * pengurutan (sorting)
	 */
	static void MenghitungVolume(){
	Double pi, t, volume;
		int r;
		Scanner masuk=new Scanner(System.in);
		Scanner terima=new Scanner(System.in);

		pi=3.14;

		System.out.println("\t\t\t======================================");
		System.out.println("\t\t\t                                      ");
		System.out.println("\t\t\t   PROGRAM MENGHITUNG VOLUME TABUNG  ");
		System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\t\t\t======================================");
		System.out.println();
		System.out.print("\t\t\tSilahkan Masukkan Jari-jari : ");
		r=masuk.nextInt();
		System.out.println();
		System.out.print("\t\t\tSilahkan Masukkan Tinggi : ");
		t=terima.nextDouble();
		System.out.println();

		volume=pi*t*r*r;

		System.out.println("\t\t\tVolume Tabung : " +volume);
	
		menu();
	}
	/**
	 * pengurutan (sorting)
	 */
	static void Pengurutan(){
		int a[]={200, 155, 505, 87, 234, 34, 202};
		int penampung;
			System.out.println("\t\t\tData tipe angka sebelum diurut : 200, 155, 505, 87, 234, 34, 202");
			System.out.println("\t\t\t**********======================**********");
			System.out.println("\t\t\t|=====          BUBLE SORT         ======|");
			System.out.println("\t\t\t|=======                         ========|");
			System.out.println("\t\t\t**********======================**********");
		for(int i = 0; i<a.length-1; i++){
			for(int b = 0; b<(a.length-1); b++){
			if(a[b]>a[b+1]){
				penampung=a[b];
				a[b]=a[b+1];
				a[b+1]=penampung;
			}
		}
		System.out.print("\t\t\t"+i+1+" = ");
		for(int c=0; (c<a.length); c++){
			System.out.print(a[c]+" ");
		}
		System.out.println();
		}
		System.out.print("\t\t\tData Pada Array = {");
		for(int b=0; b<a.length; b++){
			System.out.print(a[b]+", ");
		}
		System.out.println("}");
		menu();
	}
	static void TambahData(){
			System.out.println("\t\t\t**********======================**********");
			System.out.println("\t\t\t|=====         POLKAM MART         ======|");
			System.out.println("\t\t\t|=======          KASIR          ========|");
			System.out.println("\t\t\t**********======================**********");
		System.out.print("\t\t\tMasukkan Jumlah Barang yang akan di inputkan = ");
		Scanner brg=new Scanner(System.in);
		Scanner hrg=new Scanner(System.in);
		int n=hrg.nextInt();
		String barang[]=new String[n];
		int harga[]=new int[n];
		int jumlah[]=new int[n];
		
		int total=0;
		for (int i=1;i<=n;i++){
			System.out.print("\t\t\tMasukkan Nama barang ke :"+ i +": ");
			barang[i-1]=brg.nextLine();
			System.out.print("\t\t\tMasukkan harga barang ke :"+i+ ": ");
			harga[i-1]=hrg.nextInt();
			System.out.print("\t\t\tMasukkan Jumlah barang ke :"+i+": ");
			jumlah[i-1]=hrg.nextInt();
			
		}
		System.out.println();
		System.out.println("\t\t\tBarang yang diinputkan adalah sebagai berikut:");
		for (int j=1; j<=n; j++){
			System.out.println("\t\t\tNama Barang : "+barang[j-1]+"\t\t\tHarga Barang : "+harga[j-1]+"\t\t\tJumlah Barang: "+jumlah[j-1]);
			total =total + (harga[j-1]*jumlah[j-1]);
		}
		System.out.println("\t\t\ttotal harga :"+total); 
		System.out.print("\t\t\tMasukkan pembayaran : ");
		int bayar;
		bayar=hrg.nextInt();
		System.out.println();
		System.out.println("\t\t\tKembalian Anda Sebesar = "+(bayar-total));
		System.out.println();
		System.out.println("\t\t\t|**********======================**********|");
		System.out.println();
		System.out.println("\t\t\t|   Terima Kasih Telah Berbelanja Disini   |");
		System.out.println("\t\t\t|	   Silahkan Datang Kembali         |");
		System.out.println();
		System.out.println("\t\t\t|**********======================**********|");
		menu();
}
static void LuasBangunDatar(){
			System.out.println("\t\t\t**********======================**********");
			System.out.println("\t\t\t|=====         LUAS BANGUN         ======|");
			System.out.println("\t\t\t|=======          DATAR          ========|");
			System.out.println("\t\t\t**********======================**********");

int listTerima;

Scanner input=new Scanner(System.in);
String bangundatar[]={"Luas Lingkaran  ","Luas Persegi","Luas Segitiga","Keluar"}; 
System.out.println("\t\t 1. "+bangundatar[0]);
System.out.println("\t\t 2. "+bangundatar[1]); 
System.out.println("\t\t 3. "+bangundatar[2]);
System.out.println("\t\t 4. "+bangundatar[3]);
System.out.print("\t\t Silahkan Masukkan Nomor List yang akan dilakukan perhitungan : ");
listTerima=input.nextInt();

/* Percabangan
*/ 
switch(listTerima){ 
	case 1 :
//Menghitung Luas Lingkaran 
System.out.println("\t\t Menghitung Luas Lingkaran"); 
System.out.println("\t\t =========================================="); 
System.out.print("\t\t Masukkan Jari-Jari = ");
double jari2,luas,pi=3.14;
Scanner terimaL=new Scanner(System.in); 
jari2=terimaL.nextDouble(); 
luas=pi*jari2*jari2;
System.out.println("\t\t Luas Lingkaran = "+luas);
System.out.println("\t\t ==========================================");
System.out.println("\t\t Proses Melakukan Perhitungan Telah Selesai");
menu();
	case 2 :
//Menghitung Luas Luas Persegi
int panjang,lebar;
Scanner terimaP=new Scanner(System.in); 
System.out.println("\t\t Menghitung Luas Persegi"); 
System.out.println("\t\t ======================="); 
System.out.print("\t\t Masukkan Panjang = ");
panjang=terimaP.nextInt();
System.out.print("\t\t Masukkan Panjang = "); 
lebar=terimaP.nextInt(); 
luas=panjang*lebar;
System.out.println("\t\t Luas Persegi = "+luas);
System.out.println("\t\t ==========================================");
System.out.println("\t\t Proses Melakukan Perhitungan Telah Selesai");
menu();
	case 3 :
//Menghitung
System.out.print("\t\t Masukan Alas : ");
double f = input.nextInt();
System.out.print("\t\t Masukan Tinggi : ");
double g = input.nextInt();
double y = (f * g) / 2;
System.out.println("\t\t ==========================");
System.out.println("");
System.out.println("\t\t Luas Segitiga = " + y);
menu();
case 4 :
//Jika Masukan 4
System.out.println("\t\t Proses Telah Selesai Sistem Keluar"); 

default :
//Jika Masukan salah
System.out.print("Maaf Tidak ada Kode "+listTerima+" System Akan Keluar");
menu();
		}
	}
}