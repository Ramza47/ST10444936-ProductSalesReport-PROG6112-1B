
package productsalesreport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProductSalesReportTest {
    
    public ProductSalesReportTest() {
    }
    
    ProductSalesReport report = new ProductSalesReport();

    @Test
    public void CalculateTotalSales_ReturnTotalSales() {
       // Arrange
        double[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Act
        double total = report.calculateTotalSales(productSales);

        // Assert
        assertEquals(2200.0, total, 0.001, "Total sales should be 2200.0"); 
        
    }

    @Test
    public void AvergeSales_ReturnsAverageProductSales() {
        
        // Arrange
        double[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Act
        double average = report.calculateAverageSales(productSales);

        // Assert
        assertEquals(366.6667, average, 0.001, "Average sales should be approximately 366.67");
            
        }

}