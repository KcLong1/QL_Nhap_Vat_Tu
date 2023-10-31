package QuanLyNhapVatTu;

import java.util.ArrayList;
import java.util.Scanner;

public class ListWarehouse {
    private ArrayList<Warehouse> listWarehouse;

    public ArrayList<Warehouse> getListWarehouse() {
        return listWarehouse;
    }

    public ListWarehouse() {
        listWarehouse = new ArrayList<>();
    }

    public void Ouput() {
        System.out.println("Danh sach cac kho: ");
        for (Warehouse warehouse : listWarehouse) {
            System.out.println(warehouse);
        }
    }

    public void addWarehouse(Warehouse warehouse) {
        this.listWarehouse.add(warehouse);
        System.out.println("Kho moi da duoc them");
    }

    public void removeWarehouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten kho can xoa: ");
        String name = scanner.nextLine();

        Warehouse warehouseToRemove = null;
        for (Warehouse warehouse : listWarehouse) {
            if (warehouse.getName().equals(name)) {
                warehouseToRemove = warehouse;
                break;
            }
        }
        if (warehouseToRemove != null) {
            listWarehouse.remove(warehouseToRemove);
            System.out.println("Kho da bi xoa.");
        } else {
            System.out.println("Khong tim thay kho co ten " + name);
        }
    }

    public void changeWarehouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten kho can chinh sua");
        String name = scanner.nextLine();

        boolean found = false;
        for (Warehouse warehouse : listWarehouse) {
            if (warehouse.getName().equalsIgnoreCase(name)) {
                warehouse.Input();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay kho co ten " + name);
        }
    }

}
