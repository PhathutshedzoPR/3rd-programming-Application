/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.application;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current estate agent name:");
        String agentName = scanner.nextLine();

        System.out.println("Enter the property price:");
        double propertyPrice = scanner.nextDouble();

        EstateAgentSales agent = new EstateAgentSales(agentName, propertyPrice);
        agent.printPropertyReport();

        scanner.close();
    }

    static class EstateAgentSales {
        private String agentName;
        private double propertyPrice;

        public EstateAgentSales(String agentName, double propertyPrice) {
            this.agentName = agentName;
            this.propertyPrice = propertyPrice;
        }

        public String getAgentName() {
            return agentName;
        }

        public void setAgentName(String agentName) {
            this.agentName = agentName;
        }

        public double getPropertyPrice() {
            return propertyPrice;
        }

        public void setPropertyPrice(double propertyPrice) {
            this.propertyPrice = propertyPrice;
        }

        public double getAgentCommission() {
            return propertyPrice * 0.20;
        }

        public void printPropertyReport() {
            System.out.println("Estate Agent Report");
            System.out.println("........................");
            System.out.println("Estate Agent Name: " + agentName);
            System.out.println("Property Sale Price: R" + propertyPrice);
            System.out.println("Agent Commission: R" + getAgentCommission());
        }
    }
}



