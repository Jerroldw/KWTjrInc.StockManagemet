public class PurchasesTester {
    public static void main (String[] arges){
        Purchases Purchases1 = new Purchases();
        Purchases1.setPurchaseID(1);
        Purchases1.setSupplierID(2);
        Purchases1.setItemID(3);
        Purchases1.settotalPrice(4);
        Purchases1.setPurchaseDate(5);
        Purchase1.setPaymentDate(6);
        System.out.println("Purchases");
        System.out.println("PurchaseID"+ Purchases1.getPurchaseID());
        System.out.println("SupplierID"+ Purchases1.getSupplierID());
        System.out.println("ItemID"+ Purchases1.getItemID());
        System.out.println("totalPrice"+ Purchases1.gettotalPrice());
        System.out.println("PurchaseDate"+ Purchases1.getPurchaseDate());
        System.out.println("PaymentDate"+ Purchases1.getPaymentDate());

    }
}