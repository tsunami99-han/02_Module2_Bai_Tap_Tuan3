import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CustomerManager {
    HashMap<String, Customer> customerHashMap;
    Scanner sc = new Scanner(System.in);

    public CustomerManager() {
        customerHashMap = new HashMap<>();
    }

    public CustomerManager(HashMap<String, Customer> customerHashMap) {
        this.customerHashMap = customerHashMap;
    }

    public Customer creatCustomer() {
        System.out.println("Enter ID:");
        String id = sc.nextLine();
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter gender(1.Male/2.Famale)");
        int gender = sc.nextInt();

        while (gender != 1 && gender != 2) {
            System.out.println("Error, re-enter(1.Male/2.Famale):");
            gender = sc.nextInt();
        }
        String trash = sc.nextLine();
        System.out.println("Enter address:");
        String address = sc.nextLine();
        return new Customer(id, name, age, gender, address);
    }

    public void addCustomer() {
        Customer customer = creatCustomer();
        customerHashMap.put(customer.getIdCustomer(), customer);
    }

    public void display() {
        Set<String> keys = customerHashMap.keySet();
        for (String key : keys) {
            System.out.println(customerHashMap.get(key).toString());
        }
    }

    public String checkID() {
        System.out.println("Enter ID:");
        String id = sc.nextLine();
        Set<String> keys = customerHashMap.keySet();
        for (String key : keys) {
            if (customerHashMap.get(key).getIdCustomer().equals(id)) {
                return id;
            }
        }
        return null;
    }

    public void findByID() {
        String check = checkID();
        if (check == null) {
            System.out.println("Nothing!");
        } else {
            System.out.println(customerHashMap.get(check).toString());
        }
    }

    public void deleteByID() {
        String check = checkID();
        if (check == null) {
            System.out.println("Nothing!");
        }else {
//check nhận giá của key
            customerHashMap.remove(check);
        }
    }
    public void editInfomation(String key){
        System.out.println("Name is:");
        String name=sc.nextLine();
        if(name.equals("")){
            customerHashMap.get(key).setName(customerHashMap.get(key).getName());
        }else {
            customerHashMap.get(key).setName(name);
        }
        System.out.println("Age is:");
        String ageSt=sc.nextLine();
        if (!ageSt.equals("")){
            int age=Integer.parseInt(ageSt);
            customerHashMap.get(key).setAge(age);
        }
        System.out.println("Gender is(1.Male/2.Famale)");
        int gender=sc.nextInt();
//        Máy dọn rác
        String trash2=sc.nextLine();
        if (gender==1||gender==2){
            customerHashMap.get(key).setGender(gender);
        }
        System.out.println("Address is:");
        String address=sc.nextLine();
        if (address!=null){
            customerHashMap.get(key).setAddress(address);
        }
        }
//        while (gender!=1&&gender!=2){
//            System.out.println("Error, re-enter(1.Male/2.Famale):");
//        }
//
//    }
    public void editByID(){
        String check = checkID();
        if (check == null) {
            System.out.println("Nothing!");
        } else {
           editInfomation(check);
        }
    }


}
