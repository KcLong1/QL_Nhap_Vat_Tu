package QuanLyNhapVatTu;

import java.util.*;

public class ListItem {
    private ArrayList<Items> listItem = new ArrayList<Items>();

    public ArrayList<Items> getListItem() {
        return listItem;
    }

    public ListItem() {
        listItem = new ArrayList<Items>();
    }

    public void Output() {
        if (listItem.isEmpty()) {
            System.out.println("Danh sach mat hang rong");
        } else {
            System.out.println("Danh sach mat hang");
            for (Items product : listItem) {
                product.Output();
            }
        }
    }

    public void addItem(Items product) {
        listItem.add(product);
    }

    public void removeItem(Items product) {
        listItem.remove(product);
    }

    public void removeItem(String code) {
        for (Items item : listItem) {
            if (item.getCode().equals(code)) listItem.remove(item);
        }
    }

    public void changeItem(String name, String newCode, String newUnit, double newPrice, int newQuantity) {
        for (Items product : listItem) {
            if (product.getName().equals(name)) {
                product.setCode(newCode);
                product.setUnit(newUnit);
                product.setPrice(newPrice);
                return;
            }
        }
        System.out.println("Khong tim thay mat hang ten: " + name);
    }d

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListItem items = new ListItem();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Items item = new Items();
            item.Input();
            items.addItem(item);
        }
        items.Output();
        Items temp = new Items("A", "1a", "cai", 10000.0, "Nguyen Van A");
        temp.Output();
        items.removeItem(temp);
        items.removeItem("1b");
        items.Output();
    }
}
