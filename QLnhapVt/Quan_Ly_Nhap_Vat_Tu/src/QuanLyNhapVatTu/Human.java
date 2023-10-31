package QuanLyNhapVatTu;

import java.util.Scanner;

public class Human {
    protected String name;
    protected String contact;

    public Human(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public void Input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap ho ten: ");
            name = sc.nextLine();
            System.out.print("Nhap lien he: ");
            contact = sc.nextLine();
        }
    }

    public void Output() {
        System.out.println("\nHo ten: " + name);
        System.out.println("\nLien he: " + contact);
    }
}
