public class Main {
    public static void main(String[] args) {
        CustomerManager manager=new CustomerManager();
        manager.customerHashMap.put("CG1",new Customer("CG1","Anh Trường",15,2,"Thái Bình"));
        manager.customerHashMap.put("CG2",new Customer("CG3","Anh Tiến",15,1,"Hải Phòng"));
        manager.customerHashMap.put("CG3",new Customer("CG3","Anh Tuấn",15,1,"Nghệ An"));
        manager.display();
        manager.editByID();
        manager.display();
    }
}
