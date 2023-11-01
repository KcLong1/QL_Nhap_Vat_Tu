package QuanLyNhapVatTu;

import java.util.ArrayList;

public class PurchaseOrder {
    private String code;
    private String date;
    Supplier supplier;
    Employee membership;
    private ArrayList<Items> listProducts;

    public PurchaseOrder(String code, String date, Supplier supplier, Employee membership,
            ArrayList<Items> listProducts) {
        this.code = code;
        this.date = date;
        this.supplier = supplier;
        this.membership = membership;
        this.listProducts = listProducts;
    }

    public PurchaseOrder() {

    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void setMembership(Employee membership) {
        this.membership = membership;
    }

    public void setListProducts(ArrayList<Items> listProducts) {
        this.listProducts = listProducts;
    }

    public String getCode() {
        return code;
    }

    public String getDate() {
        return date;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Employee getMembership() {
        return membership;
    }

    public ArrayList<Items> getListProducts() {
        return listProducts;
    }

//    public double getBuildPayment() {
//        double totalPayment = 0.0;
//        for (Items item : listProducts) {
//            totalPayment += item.getPrice() * item.getQuantity();
//        }
//        return totalPayment;
//    }

//    public double getBuildPayment(double discount) {
//        double totalPayment = getBuildPayment();
//        return totalPayment - (totalPayment * discount);
//    }
//    public int getBuildQuantity(){
//        int totalQuantity = 0;
//        for (Items item : listProducts) {
//            totalQuantity += item.getQuantity();
//        }
//        return totalQuantity;
//    }

    public double getTotalPayment() {
        return 0;
    }

    public int getTotalQuantity() {
        return 0;
    }

}
