
package pbo_project;


public class Mhs {
    //Atribut
     int angka;
   private String nim, prodi;
   private int spp, angkatan, semester, bayar_spp_semester;

   //setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setSpp(int spp) {
        this.spp = spp;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setBayar_spp_semester(int bayar_spp_semester) {
        this.bayar_spp_semester = bayar_spp_semester;
    }

    //getter
    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }


    public int getAngkatan() {
        return angkatan;
    }

    public int getSemester() {
        return semester;
    }
    
    public int getSpp() {
        if (getAngkatan() >  17) {
        angka = 15000000;
        }
        else {
        angka = 12000000;
        }
        return angka * getSemester();
    }
    
    public int getBayar_spp_semester() {
        bayar_spp_semester = getSpp();
        return bayar_spp_semester;
    }
   
}

