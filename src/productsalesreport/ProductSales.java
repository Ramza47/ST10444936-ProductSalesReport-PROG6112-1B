
package productsalesreport;


class ProductSales implements IProductSales {

    public ProductSales() {
    }
    
    //Data
    int totalSales;
    double averageeSales;
    int maximumSale;
    int minimumSale;
    
    // Constructor

    public ProductSales(int totalSales, double averageeSales, int maximumSale, int minimumSale) {
        this.totalSales = totalSales;
        this.averageeSales = averageeSales;
        this.maximumSale = maximumSale;
        this.minimumSale = minimumSale;
    }
    
    //Getter

    public int getTotalSales() {
        return totalSales;
    }

    public double getAverageeSales() {
        return averageeSales;
    }

    public int getMaximumSale() {
        return maximumSale;
    }

    public int getMinimumSale() {
        return minimumSale;
    }
    
    
    // Setter

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public void setAverageeSales(double averageeSales) {
        this.averageeSales = averageeSales;
    }

    public void setMaximumSale(int maximumSale) {
        this.maximumSale = maximumSale;
    }

    public void setMinimumSale(int minimumSale) {
        this.minimumSale = minimumSale;
    }
    
    
    
}
