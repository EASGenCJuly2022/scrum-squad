public class Console extends com.cognizant.scrum.Inventory {

    private int consoleID;
    private int productID;
    private int consolePrice;
    private String consoleName;
    private int supplierID;



    public void Consoles(int consoleID, int productID, int consolePrice, String consoleName) {
        super();
        this.consoleID = consoleID;
        this.productID = productID;
        this.consolePrice = consolePrice;
        this.consoleName = consoleName;


    }


    public int getConsoleID() {
        return consoleID;
    }

    public void setConoleID(int consoleID) {
        this.consoleID = consoleID;
    }


    public int getProdctID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }


    public int getConsolePrice() {
        return consolePrice;
    }

    public void setConolePrice(int consolePrice) {
        this.consolePrice = consolePrice;
    }


    public String getConsoleName() {
        return consoleName;
    }

    public void setConoleName(String consoleName) {
        this.consoleName = consoleName;
    }









    public static void main(String[] args) {

    }

}

