package QuanLyNhapVatTu;

import java.util.Scanner;

public class Warehouse {
    private String name;;
    private String address;
    private int tankage;
    private int inventory;

    public Warehouse(String name, String address, int tankage, int inventory) {
        this.name = name;
        this.address = address;
        this.tankage = tankage;
        this.inventory = inventory;
    }

    public Warehouse() {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getTankage() {
        return tankage;
    }

    public int getInventory() {
        return inventory;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten kho hang: ");
        name = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        address = scanner.nextLine();
        System.out.print("Nhap suc chua: ");
        tankage = scanner.nextInt();
        System.out.print("Nhap hang ton kho: ");
        inventory = scanner.nextInt();
    }

    public void Output() {
        System.out.println("Ten kho hang: " + name);
        System.out.println("Dia chi: " + address);
        System.out.println("Suc chua: " + tankage + " (đơn vị)");
        System.out.println("Hang ton kho: " + inventory + " (đơn vị)");
    }

    public int getFreeSpace() {
        return tankage - inventory;

    }

}
