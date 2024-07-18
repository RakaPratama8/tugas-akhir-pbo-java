public class prog {
    public static void main(String[] args) {
        Person person = new Person("Remi simajuntak", 19);
        System.out.println("Status login : " + person.isLogin());
        System.out.println();

        person.buat_akun("remi123@gmail.com", "admin123");
        System.out.println("Status login : " + person.isLogin());
        System.out.println();

        Aplikasi remi_acc = new Aplikasi(person);

        System.out.println("Poin Remi saat ini : " + remi_acc.getPoin());
        remi_acc.statusPendaftaran();
        System.out.println();

        remi_acc.daftarProgram();
        remi_acc.statusPendaftaran();
        System.out.println();

        remi_acc.pilihProduk("Handphone Asus");
        remi_acc.membagikanTautan();
        remi_acc.membagikanTautan();
        remi_acc.membagikanTautan();
        System.out.println("Poin Remi saat ini : " + remi_acc.getPoin());
    }
}