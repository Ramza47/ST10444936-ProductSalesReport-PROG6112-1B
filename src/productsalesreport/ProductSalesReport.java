
package productsalesreport;


public class ProductSalesReport {

    // Two dimensional array
    double[][] productSales = {
        {300, 150, 700}, // YEAR 1
        {250, 200, 600}, // YEAR 2
    };

     public static String[] years = {"YEAR 1", "YEAR 2"};
     public static String[] quarters = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};
   
    
    // Calculate total repair cost for a given technician
     double calculateTotalSales(int years) {
        double total = 0;
        for (double productSales : productSales[years]) {
            total += productSales;
        }
        return total;
    }
    
    
     
    
    
    public static void main(String[] args) {
       
        
    }
    
}
