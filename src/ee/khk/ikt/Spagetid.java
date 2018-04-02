package ee.khk.ikt;

public class Spagetid {
    private String spaghetti;
    private String tomatoPaste;
    private double price;

    public Spagetid(String spaghetti, String tomatoPaste, double price) {
        this.spaghetti = spaghetti;
        this.tomatoPaste = tomatoPaste;
        this.price = price;
    }

    private String addition1;
    private double additionPrice;

    private String addition2;
    private double additionPrice2;

    private String addition3;
    private double additionPrice3;

    public String getAddition1() {
        return addition1;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public double getAdditionPrice() {
        return additionPrice;
    }

    public void setAdditionPrice(double additionPrice) {
        this.additionPrice = additionPrice;
    }

    public String getAddition2() {
        return addition2;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public double getAdditionPrice2() {
        return additionPrice2;
    }

    public void setAdditionPrice2(double additionPrice2) {
        this.additionPrice2 = additionPrice2;
    }

    public String getAddition3() {
        return addition3;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public double getAdditionPrice3() {
        return additionPrice3;
    }

    public void setAdditionPrice3(double additionPrice3) {
        this.additionPrice3 = additionPrice3;
    }

    public double customizeSpaghetti() {
        double customizePrice = this.price;
        if(addition1 != null) {
            customizePrice+= additionPrice;

        }
        if(addition2 != null) {
            customizePrice+= additionPrice2;

        }
        if(addition3 != null) {
            customizePrice+= additionPrice3;

        }
        return customizePrice;
}
}
