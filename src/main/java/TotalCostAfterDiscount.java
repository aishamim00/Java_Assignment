public class TotalCostAfterDiscount {
    public static void main(String[] args) {

        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.";

        String laptopPriceString = paragraph.replaceAll("[^0-9]", "").substring(0, 5);
        String mousePriceString = paragraph.replaceAll("[^0-9]", "").substring(5);

        int laptopPrice = Integer.parseInt(laptopPriceString);
        int mousePrice = Integer.parseInt(mousePriceString);

        int totalCost = laptopPrice + mousePrice;

        double discount = totalCost * 0.15;
        double totalCostAfterDiscount = totalCost - discount;

        System.out.println("Laptop Price: " + laptopPrice + " tk");
        System.out.println("Mouse Price: " + mousePrice + " tk");
        System.out.println("Total Cost Before Discount: " + totalCost + " tk");
        System.out.println("Discount (15%): " + discount + " tk");
        System.out.println("Total Cost After Discount: " + totalCostAfterDiscount + " tk");
    }
}

