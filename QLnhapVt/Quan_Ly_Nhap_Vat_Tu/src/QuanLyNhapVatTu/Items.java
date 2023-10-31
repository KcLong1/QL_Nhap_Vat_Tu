package QuanLyNhapVatTu;

import java.util.Scanner;

public class Items {
    private String name;
    private String code;
    private String unit;
    private double price;
    private int quantity;
    Supplier supplier;

    public Items(String name, String code, String unit, double price, int quantity, Supplier supplier) {
        this.name = name;
        this.code = code;
        this.unit = unit;
        this.price = price;
        this.quantity = quantity;
        this.supplier = supplier;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public double getPayment() {
        return price * quantity;
    }

    public void Input() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap ma san pham: ");
            name = scanner.nextLine();
            System.out.print("Nhap code: ");
            code = scanner.nextLine();
            System.out.print("Nhap unit: ");
            unit = scanner.nextLine();
            System.out.print("Nhap price:");
            price = scanner.nextDouble();
            System.out.print("Nhap quantity: ");
            quantity = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Suppier: ");
            String supplierName = scanner.nextLine();
            supplier = new Supplier(supplierName);

            System.out.println("Thong tin mat hang da duoc cap nhap");
        }

    }

    public void Output() {

        System.out.println("Name: " + name);
        System.out.println("Code: " + code);
        System.out.println("Unit: " + unit);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Supplier: " + supplier.getName());
    }

}
