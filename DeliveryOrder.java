public class DeliveryOrder extends Order{
    private String customer, adress, phone;
    
    public DeliveryOrder(String customer, String adress, String phone){
        super();
        this.customer = customer;
        this.adress = adress;
        this.phone = phone;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}