public class App {
    public static void main(String[] args) throws Exception {
        
        Karyawan Ridho = new Karyawan("12345", "Ridho");
        Karyawan Melan = new Karyawan("12346","Melan");

        Ridho.getInfo();
        Ridho.absenPagi();
        Ridho.kerja();
        Melan.getInfo();
        Melan.absenPagi();
        Melan.kerja();
        Ridho.absenPulang();
        Melan.absenPulang();

        Dosen Andiani = new Dosen("23455", "Andiani", "332211");
        Dosen Ionia  = new Dosen("23456", "Ionia", "332212");

        Andiani.getInfo();
        Andiani.absenPagi();
        Andiani.ngajar();
        Ionia.getInfo();
        Ionia.absenPagi();
        Ionia.kerja();
        Ionia.absenPulang();
        Andiani.absenPulang();        
    }
}