package QuanLyNhapVatTu;

import java.util.*;
import java.util.stream.Collectors;

public class ListSuplier {
    private ArrayList<Supplier> listSuplier;

    public ArrayList<Supplier> getListSuplier() {
        return listSuplier;
    }

    public ListSuplier() {
        listSuplier = new ArrayList<>();
    }

    public void addSupplier(Supplier supplier) {
        this.listSuplier.add(supplier);
        System.out.println("Nha cung cap moi da duoc them");
    }

    public void removeSupplier(Supplier supplier) {
        this.listSuplier.remove(supplier);
    }

    public List<Supplier> changeSuppliers(String name) {
        return this.listSuplier.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }
    public void Output() {
        this.listSuplier.forEach(o -> o.Output());
    }
    
}
