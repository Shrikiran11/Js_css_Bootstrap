class Hotel {
    static String tS = "tableSalt";
    static String p = "pepper";
    static int billCount = 0;
    String cusine1 = "Chinese";
    String cusine2 = "South";

    Hotel() {
        billCount++;
    }
}

class BillCounter {
    public static void main(String args[]) {
        Hotel h1 = new Hotel();
        Hotel h2 = new Hotel();
        Hotel h3 = new Hotel();
        Hotel h4 = new Hotel();
        System.out.println("count is" + Hotel.billCount);

    }
}