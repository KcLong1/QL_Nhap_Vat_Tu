package QuanLyNhapVatTu;

import java.util.ArrayList;

public class PurchaseOrderList {
    private ArrayList<PurchaseOrder> listPurchaseOrders;
    public ArrayList<PurchaseOrder> getListPurchaseOrders() {
        return listPurchaseOrders;
    }
    public PurchaseOrderList(){
        this.listPurchaseOrders = new ArrayList<PurchaseOrder>();
    }
    public double getTotalPayment(){
        double totalPayment = 0.0;
        for(PurchaseOrder p : listPurchaseOrders){
            totalPayment += p.getTotalPayment();
        }
        return totalPayment;
    }
    public double getTotalPayment(double discount){
        double totalPayment = getTotalPayment();
        return totalPayment -(totalPayment*discount);
    }
    public int getTotalQuantity(){
        int totalQuantity = 0;
        for(PurchaseOrder p : listPurchaseOrders){
            totalQuantity += p.getTotalQuantity();
        }
        return totalQuantity;
    }
    public ArrayList<Supplier> getListSuppliers(){
        ArrayList<Supplier> list = new ArrayList<>();
        for(PurchaseOrder p : listPurchaseOrders){
            list.add(p.getSupplier());
        }
        return list;
    }
}
