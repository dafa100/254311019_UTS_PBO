abstract class LayananTransportasi {
    protected String namaDriver;
    protected double jarak;
    protected double saldoUser;

    public LayananTransportasi(String namaDriver, double jarak, double saldoUser){
        this.namaDriver = namaDriver;
        this.saldoUser = saldoUser;
        if (jarak <= 0) {
            this.jarak = 1;
        } else {
            this.jarak = jarak;
        }
    }
    public abstract void hitungTarif();
}

class MadiunMotor extends LayananTransportasi {
    private double tarif;
    private int nim;
    private String nama;
    
    public MadiunMotor(String namaDriver, double jarak, double saldoUser, int nim, String nama){
        super(namaDriver, jarak, saldoUser);
        this.tarif = 2500;
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public void hitungTarif(){
        System.out.println("Tarif perjalanan adalah: "+tarif*jarak);
    }
    
    public void prosesTransaksi(){
        System.out.println("Transaksi oleh "+nama+" - "+nim+"");
        System.out.println("Nama driver "+namaDriver);
        System.out.println("Jarak "+jarak+" km ");
        System.out.println("Saldo "+saldoUser);
    }
}

class MadiunMobil extends LayananTransportasi {
    private int nim;
    private String nama;
    private double tarif;
    
    public MadiunMobil(String namaDriver, double jarak, double saldoUser, int nim, String nama){
        super(namaDriver, jarak, saldoUser);
        this.tarif = 5000;
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public void hitungTarif(){
        System.out.println("Tarif perjalanan adalah: "+tarif*jarak);
    }

    public void prosesTransaksi(){
        System.out.println("Transaksi oleh "+nama+" - "+nim+"");
        System.out.println("Nama driver "+namaDriver);
        System.out.println("Jarak "+jarak+" km ");
        System.out.println("Saldo "+saldoUser);
    }
}

public class AplikasiMadiunJak {
    public static void main(String[] args) {
        MadiunMotor motor = new MadiunMotor("Dafa",12,10000,254311019,"Sebastian");
        MadiunMobil mobil = new MadiunMobil("Hermawan",5,5600,254311022,"Tia");
        motor.prosesTransaksi();
        motor.hitungTarif();
        mobil.prosesTransaksi();
        mobil.hitungTarif();
    }
}