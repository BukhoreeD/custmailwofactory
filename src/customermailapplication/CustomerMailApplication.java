/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

public class CustomerMailApplication {
    private Customer customer;

    public void getCustomerTypeFromUser(String customerType) {
        customer = CustomerFactory.createCustomer(customerType);
    }

    public String generateMail() {
        return customer.createMail();
    }

    public static void main(String[] args) {
        CustomerMailApplication app = new CustomerMailApplication();
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type: 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        
        String customerType;
        switch(type) {
            case 1:
                customerType = "Regular";
                break;
            case 2:
                customerType = "Mountain";
                break;
            case 3:
                customerType = "Delinquent";
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        
        app.getCustomerTypeFromUser(customerType);
        System.out.println(app.generateMail());
    }
}
