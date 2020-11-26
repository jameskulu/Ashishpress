package ashishpress;

public class PurchaseHistorySets {
    String date,purchased_item,quantity,party_name,payment_method,invoice_no,remarks;
    int Id;
    double amount,debit,credit;
    public PurchaseHistorySets(int Id,String date, String party_name,String invoice_no,String payment_method,String purchased_item,String quantity,double debit,double credit,double amount,String remarks){
        this.date = date;
        this.Id = Id;
        this.party_name = party_name;
        this.quantity = quantity;
        this.purchased_item = purchased_item;
        this.quantity = quantity;
        this.amount = amount;
        this.debit = debit;
        this.credit = credit;
        this.payment_method = payment_method;
        this.invoice_no = invoice_no;
        this.remarks = remarks;
       
}
    
    public int getId(){
    return Id;
    }
    
    public String getdate(){
    return date;
    }
    
    public String getparty_name(){
    return party_name;
    }
    
     public String getinvoice_no(){
    return invoice_no;
    }
     
      public String getremarks(){
    return remarks;
    }
    
     public String getquantity(){
    return quantity;
    }
     
     public String getpurchased_item(){
    return purchased_item;
    }
       
      public double getamount(){
    return amount;
    }
          
       public double getdebit(){
    return debit;
    }
       
          public double getcredit(){
    return credit;
    }
         
        public String getpayment_method(){
    return payment_method;
    }
               
    }   
