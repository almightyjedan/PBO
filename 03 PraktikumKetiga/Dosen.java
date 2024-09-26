class Dosen extends Karyawan {
    private String NIDN;
    
    public Dosen(String KodeKaryawan, String nama, String NIDN) {
        super(KodeKaryawan, nama);
        this.NIDN = NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public void getNIDN(){
        System.out.println("NIDN : " + this.nama);
    }

    public void ngajar() {
        System.out.println(this.nama + ": sedang mengajar");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("NIDN: " + this.NIDN);
    }
}