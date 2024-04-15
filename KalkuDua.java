import java.util.Scanner;

public class KalkuDua {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int ulangi = 0;
        do {
            
            Kalkulator();

            System.out.print("> Pilih Opsi Hitung: ");
            int opsi = inp.nextInt();

            if (opsi == 1) {
                DenganRumus();
            
                System.out.print("> Masukkan Pilihan anda: ");
                int a = inp.nextInt();
            
                if (a == 1) {
                    RumusPersegi();
                
                    System.out.print("Masukkan Pilihan Anda: ");
                    int Pilihan = inp.nextInt();
        
                    if (Pilihan == 1) {
                        System.out.println(LuasPersegi(Pilihan));
        
                    } else if (Pilihan == 2) {
                        System.out.println(KelilingPersegi(Pilihan));
        
                    } 


                }if (a == 2) {
                    RumusLingkaran();
                
                    System.out.print("> Masukkan Opsi yang Anda Pilih: ");
                    int rl = inp.nextInt();

                    if (rl == 1) {
                        System.out.println(LuasLingkaran(rl));
            
                    } 
                    else if (rl == 2){
                        System.out.println(KelilingLingkaran(rl));
                    }
                }if (a == 3) {
                    RumusSegitiga();

                    System.out.print("Masukkan Opsi Yang Anda Pilih: ");
                    int rs = inp.nextInt();

                    if (rs == 1) {
                        System.out.println(LuasSegitiga(rs));
                    }
                    if (rs == 2) {
                        System.out.println(KelilingSegitiga(rs));
                    }

                }


            }   else if (opsi == 2) {
                TanpaRumus();
            
                
                System.out.print("> MASUKKAN OPERASI HITUNG YANG AKAN ANDA PILIH: ");
                int operasi = inp.nextInt();
                
                if (operasi == 1) {
                    System.out.println(Penjumlahan(operasi));
                
                }
                if (operasi == 2) {
                    System.out.println(Pengurangan(operasi));
                }
                if (operasi == 3) {
                    System.out.println(Perkalian(operasi));
                }
                if (operasi == 4) {
                    System.out.println(Pembagian(operasi));
                }
        
            } 
            if (opsi == 3) {
                Suhu();

                System.out.print("Masukan Opsi Pilihanmu: ");
                int temperatur = inp.nextInt();

                if (temperatur == 1) {
                    SuhuCelcius();
                    
                    System.out.println("Masukkan Opsi Yang Kamu pilih: ");
                    int c = inp.nextInt();

                    if (c == 1) {
                        System.out.println(CelciusReamur(c));
                    }
                    if (c == 2) {
                        System.out.println(CelciusFahrenheit(c));
                    }
                    if (c == 3) {
                        System.out.println(CelciusKelvin(c));
                    }
            
                }
                if (temperatur == 2) {
                    SuhuReamur();

                    System.out.print("Masukkan Opsi Yang Anda Pilih >");
                    int r = inp.nextInt();

                    if (r == 1) {
                        System.out.println(ReamurCelcius(r));
                    }
                    if (r == 2) {
                        System.out.println(ReamurFahrenheit(r));
                    }
                    if (r == 3) {
                        System.out.println(ReamurKelvin(r));
                    }
                }
                if (temperatur == 3) {
                    SuhuFahrenheit();

                    System.out.print("Masukkan Opsi Yang Anda Pilih: ");
                    int f = inp.nextInt();

                    if (f == 1) {
                        System.out.println(FahrenheitCelcius(f));
                    }
                    if (f == 2) {
                        System.out.println(FahrenheitReamur(f));
                    }
                    if (f == 3) {
                        System.out.println(FahrenheitKelvin(f));
                    }
                }
                if (temperatur == 4) {
                    SuhuKelvin();

                    System.out.print("Masukkan Opsi Yang Anda Pilih: ");
                    int k = inp.nextInt();

                    if (k == 1) {
                        System.out.println(KelvinCelcius(k));
                    }
                    if (k == 2) {
                        System.out.println(KelvinReamur(k));
                    }
                    if (k == 3) {
                        System.out.println(KelvinFahrenheit(k));
                    }
                }
            
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Apakah Anda ingin Menggunakan kalkulator lagi?");
            System.out.println("Ketik 1 untuk menggunakan lagi");
            System.out.println("Ketik 0 untuk Selesai");
            System.out.print("Masukkan pilihan Kamu: ");
        
            ulangi = inp.nextInt();
        }while (ulangi==1);

        
    
    }

    public static void Kalkulator(){
            System.out.println("===============================================");
            System.out.println("        SELAMAT DATANG DI KALKULATOR           ");
            System.out.println("===============================================");
            System.out.println("!!!!!!!!!!!!!!!!!! PERINGATAN !!!!!!!!!!!!!!!!!");
            System.out.println("    ");
             
            System.out.println("_KALKULATOR INI DIBUAT OLEH ADRIAN FATIH NUR M_");
            System.out.println("    ");
            
            System.out.println("<<<<<<<<<<<<<<<<<< X PPLG 4 >>>>>>>>>>>>>>>>>>>");
            System.out.println("    ");
            System.out.println("===============================================");
            System.out.println("-------------------KALKULATOR------------------");
            System.out.println("===============================================");
            System.out.println("1. Dengan Rumus");
            System.out.println("2. Tanpa Rumus");
            System.out.println("3. Suhu");

            
    }

    public static void DenganRumus(){
        System.out.println("    ");
        System.out.println("Anda memilih Opsi Berhitung 1");
        System.out.println("===============================================");
        System.out.println("------------------DENGAN RUMUS-----------------");
        System.out.println("===============================================");
        System.out.println("Dalam Opsi Hitung Dengan Rumus ini ada 2 Opsi hitung, yaitu: ");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        
        
            
    }

    public static void RumusPersegi(){
        System.out.println("");
        System.out.println("Anda Memilih Persegi");
        System.out.println("Dalam Opsi Persegi Ada 2 Perumusan, yaitu: ");
        System.out.println("1. Rumus Luas Persegi");
        System.out.println("2. Rumus Keliling Persegi");
        
        
    }

    public static int LuasPersegi(int sisi){
        Scanner sc = new Scanner(System.in);
        System.out.println("Anda Memilih Luas Persegi");
        System.out.print("Masukkan Sisi: ");
        int s = sc.nextInt();
        System.out.print("Hasil Hitung Luas Persegi  adalah: ");
        

        return s*s;
    }

    public static int KelilingPersegi(int sisi){
        Scanner sc = new Scanner(System.in);
        System.out.println("Anda Memilih Keliling Persegi");
        System.out.print("Masukkan Sisi: ");
        int s = sc.nextInt();
        System.out.print("Hasil Hitung Keliling Persegi adalah: ");
        
    
        
        return s*4;
    }

    public static void RumusLingkaran(){
        System.out.println(" ");
        System.out.println("Anda Memilih Lingkaran");

        System.out.println("Dalam Opsi Lingkaran ada 2 Perumusan, yaitu: ");
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Keliling Lingkaran");

    
    }

    public static double LuasLingkaran(double jarijari){
        Scanner sc = new Scanner(System.in);
        System.out.println("Anda Memilih Luas Lingkaran");
        System.out.print("Masukkan jari-jari: ");
        double r = sc.nextDouble();
        System.out.println("Hasil Hitung Luas Lingkaran adalah: ");
    
        return 3.14*r*r;
    }

    public static double KelilingLingkaran(double jarijari){
        Scanner sc = new Scanner(System.in);
        System.out.println("Anda Memilih Keliling Lingkaran");
        System.out.print("Masukkan jari-jari: ");
        double r = sc.nextDouble();
        System.out.println("Hasil Hitung Keliling lingkaran adalah: ");
        
        return 2*3.14*r;
    }

    public static void RumusSegitiga(){
        System.out.println("");
        System.out.println("Anda Memilih Rumus Segitiga");
        System.out.println("===============================================");
        System.out.println("-----------------Rumus Segitiga----------------");
        System.out.println("===============================================");
        System.out.println("Dalam Opsi Segitiga memiliki 2 Perumusan, yaitu");
        System.out.println("1. Luas Segitiga");
        System.out.println("2. Keliling Segitiga");

        
    }

    public static double LuasSegitiga(double rs){
        Scanner sc = new Scanner(System.in);
        System.out.println("    ");
        System.out.println("===============================================");
        System.out.println("-----------------Luas Segitiga-----------------");
        System.out.println("===============================================");
                    
        System.out.print("Masukkan Alas: ");
        int a = sc.nextInt();
                    
        System.out.print("Masukkan Tinggi: ");
        int t = sc.nextInt();
        
        int hitungSegitiga = a*t/2;
        System.out.println("Jadi Hasil Hitung dari Luas Segitiga adalah: ");

        return hitungSegitiga;
    }

    public static int KelilingSegitiga(int rs){
        Scanner sc = new Scanner(System.in);
        System.out.println("    ");
        System.out.println("===============================================");
        System.out.println("---------------Keliling Segitiga---------------");
        System.out.println("===============================================");
        System.out.print("Masukkan Panjang sisi pertama: ");
        int s1 = sc.nextInt();

        System.out.print("Masukkan Panjang Sisi kedua: ");
        int s2 = sc.nextInt();

        System.out.println("Masukkan Panjang Sisi Ketiga: ");
        int s3 = sc.nextInt();
        
        int hitungSegitiga = s1+s2+s3;
        System.out.print("Jadi Hasil Hitung dari Keliling Segitiga adalah: ");

        return hitungSegitiga;
    }

    public static void TanpaRumus(){
        System.out.println("    ");
        System.out.println("Anda memilih Hitung Tanpa Rumus");
        System.out.println("===============================================");
        System.out.println("------------------TANPA RUMUS------------------");
        System.out.println("===============================================");
        System.out.println("1. PENJUMLAHAN");
        System.out.println("2. PENGURANGAN");
        System.out.println("3. PERKALIAN");
        System.out.println("4. PEMBAGIAN");
        
    }

    public static int Penjumlahan(int Jumlah){
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("------------------PENJUMLAHAN------------------");
        System.out.println("===============================================");
                    
        System.out.print("Pilih Angka Pertama: ");
        int angka1Tambah = sc.nextInt();
                    
                    
        System.out.print("Pilih Angka Kedua: ");
        int angka2Tambah = sc.nextInt();

        int hasiljumlah = angka1Tambah + angka2Tambah;
        System.out.print("Hasil dari Penjumlahan berikut adalah: ");

        
        return hasiljumlah;
    }

    public static int Pengurangan(int kurang){
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("------------------PENGURANGAN------------------");
        System.out.println("===============================================");
                    
        System.out.print("Pilih Angka Pertama: "); 
        int angka1Kurang = sc.nextInt();
                    
        System.out.print("Pilih Angka Kedua: ");
        int angka2Kurang = sc.nextInt();
            

        int hasilkurang = angka1Kurang - angka2Kurang;
        System.out.print("Hasil Hitung Pengurangan adalah  ");

        

        return hasilkurang;

    }

    public static int Perkalian(int kali){
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("-------------------PERKALIAN-------------------");
        System.out.println("===============================================");
                    
        System.out.print("Pilih Angka pertama: ");
        int angka1Kali = sc.nextInt();
            
        System.out.print("Pilih Angka kedua: ");
        int angka2Kali = sc.nextInt();
            

        int hasilKali = angka1Kali * angka2Kali;
        System.out.print("Hasil hitung Perkalian Adalah: ");
            
    

        return hasilKali;
    }

    public static double Pembagian(double bagi){
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("-------------------PEMBAGIAN-------------------");
        System.out.println("===============================================");
                    
        System.out.print("Pilih Angka pertama: ");
        double angka1Bagi= sc.nextInt();
            
        System.out.print("Pilih Angka kedua: ");
        double angka2Bagi = sc.nextInt();
            

        double hasilBagi = angka1Bagi/angka2Bagi;
        System.out.print("Hasil hitung Pembagian Adalah: ");

        

        return hasilBagi;
    }

    public static void Suhu(){
        System.out.println("===============================================");
        System.out.println("        Anda memilih Kalkulator Suhu           ");
        System.out.println("===============================================");
        System.out.println("----------------------SUHU---------------------");
        System.out.println("===============================================");
        System.out.println("1. Suhu Celsius");
        System.out.println("2. Suhu Reamur");
        System.out.println("3. Suhu Fahreinheit");
        System.out.println("4. Suhu Kelvin");

        
        
    }

    public static void SuhuCelcius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("        Anda Memilih Hitung Suhu Celcius       ");
        System.out.println("===============================================");
        System.out.println("------------------SUHU CELCIUS-----------------");
        System.out.println("===============================================");
        System.out.println("Dalam Hitung Suhu Celcius ini memiliki 3 Opsi");
        System.out.println("1. Celcius ke Reamur");
        System.out.println("2. Celcius ke Fahrenheit");
        System.out.println("3. Celcius ke Kelvin");

                  
    }
    
    public static double CelciusReamur(double c){
        Scanner ian = new Scanner(System.in);
        System.out.println("OPSI HITUNG TEMPERATUR");
        System.out.println("SUHU CELCIUS -->>> REAMUR");
        System.out.print("Input Temperatur Celcius: ");
        double cr = ian.nextDouble();
        double hasil = cr*4/5;
        System.out.print("Hasil Hitung Temperatur CELCIUS -->>> REAMUR: ");

        return hasil;
    }

    public static double CelciusFahrenheit(double c){
        Scanner ian = new Scanner(System.in);
        System.out.println("OPSI HITUNG TEMPERATUR");
        System.out.println("CELCIUS -->>> FAHRENHEIT");
        System.out.print("Input Temperatur Celcius: ");
        double cf = ian.nextInt();
        double hasil = cf*9/5+32;
        System.out.print("Hasil Hitung Temperatur CELCIUS -->>> FAHRENHEIT: ");

        return hasil;
    }

    public static int CelciusKelvin(int c){
        Scanner ian = new Scanner(System.in);
        System.out.println("OPSI HITUNG TEMPERATUR");
        System.out.println("CELCIUS -->>> KELVIN");
        System.out.print("Input Temperatur Celcius: ");
        int ck = ian.nextInt();
        int hasil = ck+273;
        System.out.print("Hasil Hitung Temperatur CELCIUS -->>> KELVIN: ");

        return hasil;
    }

    public static void SuhuReamur(){
        System.out.println("===============================================");
        System.out.println("        Anda Memilih Hitung Suhu Reamur        ");
        System.out.println("===============================================");
        System.out.println("------------------SUHU REAMUR-----------------");
        System.out.println("===============================================");
        System.out.println("Dalam Hitung Suhu Reamur ini memiliki 3 Opsi");
        System.out.println("1. Reamur ke Celcius");
        System.out.println("2. Reamur ke Fahrenheit");
        System.out.println("3. Reamur ke Kelvin");

        
    }

    public static int ReamurCelcius(int r){
        Scanner ian = new Scanner(System.in);
        System.out.println("Convert Reamur To Celsius");
        System.out.println("    REAMUR --->>> CELCIUS" );
        System.out.print("Input Temperatur Reamur: ");
        int rc = ian.nextInt();
        int hasil = rc*5/4;
        System.out.print("Hasil Hitung Temperatur REAMUR --->>> CELCIUS: ");

        return hasil;
    }

    public static double ReamurFahrenheit(double r){
        Scanner ian = new Scanner(System.in);
        System.out.println("Convert Reamur To Fahrenheit");
        System.out.println("    REAMUR --->>> FAHRENHEIT");
        System.out.print("Input Temperatur Reamur: ");
        double rf = ian.nextInt();
        double hasil = rf*9/4+32;
        System.out.print("Hasil Hitung Temperatur REAMUR --->>> FAHRENHEIT: ");

        return hasil;
    }

    public static double ReamurKelvin(double r){
        Scanner ian = new Scanner(System.in);
        System.out.println("Convert Reamur To Kelvin");
        System.out.println("    REAMUR --->>> KELVIN");
        System.out.print("Input Temperatur Reamur: ");
        double rk = ian.nextDouble();
        double hasil = rk*5/4+273;
        System.out.print("Hasil Hitung Temperatur REAMUR --->>> KELVIN: ");

        return hasil;
    }

    public static void SuhuFahrenheit(){
        System.out.println("===============================================");
        System.out.println("        Anda Memilih Hitung Suhu Fahrenheit        ");
        System.out.println("===============================================");
        System.out.println("-----------------SUHU FAHRENHEIT---------------");
        System.out.println("===============================================");
        System.out.println("Dalam Hitung Suhu Fahrenheit ini memiliki 3 Opsi");
        System.out.println("1. Fahrenheit ke Celcius");
        System.out.println("2. Fahrenheit ke Reamur");
        System.out.println("3. Fahrenheit ke Kelvin");
        
    }

    public static double FahrenheitCelcius(int f){
        Scanner ian = new Scanner(System.in);
        System.out.println("Convert Fahrenheit To Celcius");
        System.out.println("   FAHRENHEIT ---->>> CELCIUS");
        System.out.print("Input Temperatur Fahrenheit: ");
        double fc = ian.nextInt();
        double hasil = (fc-32)*5/9;
        System.out.print("Hasil Hitung Temperatur FAHRENHEIT --->>> CELCIUS: ");

        return hasil;
    }

    public static double FahrenheitReamur(int f){
        Scanner ian = new Scanner(System.in);
        System.out.println("Convert Fahrenheit To Reamur");
        System.out.println("    FAHRENHEIT --->>> REAMUR");
        System.out.print("Input Temperatur Fahrenheit: ");
        double fr = ian.nextInt();
        double hasil = (fr-32)*4/9;
        System.out.print("Hasil Hitung Temperatur FAHRENHEIT --->>> REAMUR: ");

        return hasil;
    }

    public static double FahrenheitKelvin(int f){
        Scanner ian = new Scanner(System.in);
        System.out.println("Convert Fahrenheit To Kelvin");
        System.out.println("    FAHRENHEIT --->>> KELVIN");
        System.out.print("Input Temperatur Fahrenheit: ");
        double fk = ian.nextInt();
        double hasil = (fk-32)*5/9+273;
        System.out.print("Hasil Hitung Temperatur FAHRENHEIT --->>> KELVIN: ");

        return hasil;
    }

    public static void SuhuKelvin(){
        System.out.println("===============================================");
        System.out.println("        Anda Memilih Hitung Suhu Fahrenheit        ");
        System.out.println("===============================================");
        System.out.println("-------------------SUHU KELVIN-----------------");
        System.out.println("===============================================");
        System.out.println("Dalam Hitung Suhu Fahrenheit ini memiliki 3 Opsi");
        System.out.println("1. Kelvin ke Celcius");
        System.out.println("2. Kelvin ke Reamur");
        System.out.println("3. Kelvin ke Fahrenheit");
        
    }

    public static int KelvinCelcius(int k){
        Scanner ian = new Scanner(System.in);
        System.out.println("Convert Kelvin To Celcius");
        System.out.println("    KELVIN --->>> CELCIUS");    
        System.out.print("Input Temperatur Kelvin: ");
        int kc = ian.nextInt();
        int hasil = kc-273;
        System.out.print("Hasil hitung temperatur KELVIN --->>> CELCIUS: ");

        return hasil;
    }

    public static double KelvinReamur(int k){
        Scanner ian = new Scanner(System.in);
        System.out.println("Convert Kelvin To Reamur");
        System.out.println("    KELVIN --->>> REAMUR");
        System.out.print("Input Temperatur Kelvin: ");
        double kr = ian.nextInt();
        double hasil = (kr-273)*4/5;
        System.out.print("Hasil hitung temperatur KELVIN --->>> CELCIUS: ");

        return hasil;
    }

    public static int KelvinFahrenheit(int k){
        Scanner ian = new Scanner(System.in);
        System.out.println("Convert Kelvin To Fahrenheit");
        System.out.println("    KELVIN --->>> FAHRENHEIT");
        System.out.print("Input Temperatur Kelvin: ");
        int kf = ian.nextInt();
        int hasil = (kf-273)*9/5+32;
        System.out.print("Hasil hitung temperatur KELVIN --->>> FAHRENHEIT: ");

        return hasil;
    }
}