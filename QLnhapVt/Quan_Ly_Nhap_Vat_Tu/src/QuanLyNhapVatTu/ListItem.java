package QuanLyNhapVatTu;

import java.util.ArrayList;

public class ListItem {
    private ArrayList<Items> listItem;

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

    public void changeItem(String name, String newCode, String newUnit, double newPrice, int newQuantity) {
        for (Items product : listItem) {
            if (product.getName().equals(name)) {
                product.setCode(newCode);
                product.setUnit(newUnit);
                product.setPrice(newPrice);
                product.setQuantity(newQuantity);
                return;
            }
        }
        System.out.println("Khong tim thay mat hang ten: " + name);
    }
}
