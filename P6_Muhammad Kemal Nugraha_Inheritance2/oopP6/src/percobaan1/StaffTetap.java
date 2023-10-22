/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan1;

/**
 *
 * @author Farisa
 */
public class StaffTetap extends Staff{
   public String golongan;
   public int asuransi;

    public StaffTetap() {
    }

    public StaffTetap(String golongan, int asuransi, int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    
    public void tampilStaffTetap(){
        System.out.println("================Data Staff Tetap===================");
        super.tampilDataStaff();
        System.out.println("Golongan : "+golongan);
        System.out.println("Jumlah Asuransi : "+asuransi);
        System.out.println("Gaji Bersih : "+(gaji+lembur-potongan-asuransi));
    }
}
