public class BankAdmin {
    public static void main(String[] args) {
        BankHolder bh = new BankHolder();
        bh.setAcc_no(123123);
        bh.setAmount(19400);
        bh.setEmail("Elephantpaw@gmail.com");
        bh.setName("Elephant");
        System.out.println(bh.getAcc_no);
        System.out.println(bh.getAmount);
        System.out.println(bh.getEmail);
        System.out.println(bh.getName);
    }
}