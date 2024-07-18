import java.security.spec.RSAOtherPrimeInfo;

class Aplikasi {
    Person person;
    boolean isDaftarProgram = false;
    Aplikasi(Person person) {
        this.person = person;
    }
    void isiSaldo(double balance){
        person.setBalance(balance);
        System.out.println("Saldo saat ini : Rp." + person.getBalance());
    }
    void daftarProgram(){
        if(person.isLogin){
            System.out.println("Anda terdaftar di program afiliasi");
            isDaftarProgram = true;
        } else {
            System.out.println("Anda harus login terlebih dahulu");
        }
    }
    void pilihProduk(String produk){
        if(isDaftarProgram) {
            System.out.println("Anda telah memilih produk " + produk + " Untuk di promosikan");
        } else {
            System.out.println("Anda harus mendaftar program afiliasi terlebih dahulu");
        }
    }
    void membagikanTautan(){
        if(isDaftarProgram){
            System.out.println("Anda sudah membagikan link afiliasi (poin +10)");
            person.addPoint(10);
        } else {
            System.out.println("Anda harus mendaftar program afiliasi terlebih dahulu");
        }
    }
    public double getBalance() {
        return person.getBalance();
    }
}
