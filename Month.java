public class Month {
    public static void main(String[] args) {
      
        String month = "February";

        switch (month) {
            case "February":
                System.out.println("28 days");
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 days");
                break;

            default:
                System.out.println("31 days");
                break;
        }
    }
}
