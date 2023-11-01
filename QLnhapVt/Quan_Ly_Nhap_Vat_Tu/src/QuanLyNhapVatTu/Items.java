package QuanLyNhapVatTu;

import java.util.*;

public class Items {
    private String name;
    private String code;
    private String unit;
    private double price;
    Supplier supplier;

    public Items(String name, String code, String unit, double price, String supplierName) {
        this.name = name;
        this.code = code;
        this.unit = unit;
        this.price = price;
        this.supplier = new Supplier(supplierName);
    }

    public Items() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        name = scanner.nextLine();
        System.out.print("Nhap code: ");
        code = scanner.nextLine();
        System.out.print("Nhap don vi: ");
        unit = scanner.nextLine();
        System.out.print("Nhap gia:");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nha cung cap: ");
        String supplierName = scanner.nextLine();
        supplier = new Supplier(supplierName);

        System.out.println("Thong tin mat hang da duoc cap nhap");
    }

    public void Output() {

        System.out.println("Ten san pham: " + name);
        System.out.println("Ma san pham: " + code);
        System.out.println("Don vi: " + unit);
        System.out.println("Gia: " + price);
        System.out.println("Nha cung cap: " + supplier.getName());
    }

}
