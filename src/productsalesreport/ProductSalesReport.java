package productsalesreport;

public class ProductSalesReport {

    // Two-dimensional array
    double[][] productSales = {
        {300, 150, 700}, // YEAR 1
        {250, 200, 600}, // YEAR 2
    };

    String[] years = {"YEAR 1", "YEAR 2"};
    String[] quarters = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};

    // Method to calculate total sales
    public double calculateTotalSales(double[][] productSales) {
        double total = 0;

        for (double[] year : productSales) {
            for (double sale : year) {
                total += sale;
            }
        }

        return total;
    }

    // Method to calculate average sales
     double calculateAverageSales(double[][] productSales) {
        double total = 0;
        int count = 0;

        for (double[] year : productSales) {
            for (double sale : year) {
                total += sale;
                count++;
            }
        }

        return (count > 0) ? total / count : 0;
    }

    // Method to calculate maximum sale
    double calculateMaximumSale(double[][] productSales) {
        double max = productSales[0][0];

        for (double[] year : productSales) {
            for (double sale : year) {
                if (sale > max) {
                    max = sale;
                }
            }
        }

        return max;
    }

    // Method to calculate minimum sale
    double calculateMinimumSale(double[][] productSales) {
        double min = productSales[0][0];

        for (double[] year : productSales) {
            for (double sale : year) {
                if (sale < min) {
                    min = sale;
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {
        // Create an instance of the class
        ProductSalesReport report = new ProductSalesReport();

        // Display results
        System.out.println("Total Sales: " + report.calculateTotalSales(report.productSales));
        System.out.println("Average Sales: " + report.calculateAverageSales(report.productSales));
        System.out.println("Maximum Sale: " + report.calculateMaximumSale(report.productSales));
        System.out.println("Minimum Sale: " + report.calculateMinimumSale(report.productSales));
    }
}
