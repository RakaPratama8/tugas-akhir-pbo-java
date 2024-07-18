public class prog {
    public static void main(String[] args) {
        Person person = new Person("Remi simajuntak", 19);

        person.buat_akun("remi123@gmail.com", "admin123");

        Aplikasi remi_acc = new Aplikasi(person);

        remi_acc.isiSaldo(20000);
        remi_acc.daftarProgram();
        remi_acc.pilihProduk("Handphone Asus");
        remi_acc.membagikanTautan();
        remi_acc.membagikanTautan();

        System.out.println("Saldo saat ini: Rp." + remi_acc.getBalance());
    }
}