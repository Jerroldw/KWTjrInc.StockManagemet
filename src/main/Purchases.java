public class Purchases {
private int PurchaseID;
private int SupplierID; 
private int ItemID;
private double totalPrice; 
private String PurchaseDate;
private String PaymentDate;
public purchases (){

}
public purchase (int purchaseID, int supplierID, int itemID, double totalPrice, String purchaseDate, String paymentDate){
    this.purchaseID = purchaseID;
    this.supplierID = supplierID;
    this.itemID = itemID;
    this.totalPrice = totalPrice;
    this.purchaseDate = purchaseDate;
    this.paymentDate = paymentDate;

}
public int getPurchaseID(){
return PurchaseID;
}
public int getSupplierID(){
    return SupplierID;
}
public int getItemID(){
    return ItemID;
}
public double gettotalPrice(){
    return totalPrice;
}
public String getPurchaseDate(){
    return PurchaseDate;
}
public String getPaymentDate(){
    return PaymentDate;
}
public void setPurchaseID(int PurchaseID){
    this.PurchaseID = PurchaseID;
}
public void setSupplierID(int SupplierID){
    this.SupplierID = SupplierID;
}
public void setItemID(int ItemID){
    this.ItemID = ItemID;
}
public void settotalPrice(double totalPrice){
    this.totalPrice = totalPrice;
}
public void setPurchaseDate(String PurchaseDate){
    this.PurchaseDate = PurchaseDate;
}
public void setPaymentDate(String PaymentDate){
    this.PaymentDate = PaymentDate;
}


}
