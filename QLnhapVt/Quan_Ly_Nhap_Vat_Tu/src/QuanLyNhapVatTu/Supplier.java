package QuanLyNhapVatTu;

import java.util.ArrayList;
import java.util.Scanner;

public class Supplier extends Human {
    protected String address;
    private ArrayList<Items> products;

    public Supplier(String name, String contact, String address, ArrayList<Items> products) {
        super(name, contact);
        this.address = address;
        this.products = products;
    }

    public Supplier(String supplierName) {
    }

    public Supplier() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Items> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Items> products) {
        this.products = products;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thong tin cho nha cung cap: ");
        super.Input();

        System.out.print("Dia chi: ");
        address = scanner.nextLine();

        System.out.println("Nhap so luong san pham cua nha cung cap:");
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            Items product = new Items();
            product.Input();
            products.add(product);
        }
        System.out.println("Da duoc cap nhap");
    }

    public void Output() {
        System.out.println("Thong tin nha cung cap: ");
        super.Output();

        System.out.println("Danh sach sp: ");
        for (Items product : products) {
            product.Output();
        }
    }

}
