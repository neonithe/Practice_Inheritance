package org.example.Employee;

import java.util.Arrays;

public class SalesPerson extends Employee {

    private String[] clients = new String[10];
    private int aquiredClients;

    public SalesPerson(int id, String name, double salary, int dateHired) {
        super(id, name, salary, dateHired);
    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAquiredClients() {
        return aquiredClients;
    }

    public void setAquiredClients(int aquiredClients) {
        this.aquiredClients = aquiredClients;
    }

    @Override
    public void calc(){
        // Get the number of elements in array
        String[] clients = getClients();
        int newClient = getAquiredClients();

        int clientCount =0;

        for(int i=0; i< clients.length; i++){
            if(clients[i] != null){
                clientCount++;
            }
        }
        double sum = clientCount * 500;
        double sum2 = newClient * 1000;

        // Calculate the new salary
        double baseSalary = getSalary();
        double result = baseSalary+sum+sum2;

        setSalary(result);
    }

    @Override
    public String toString() {
        String[] tempArray1 = new String[0];

        for(int i=0; i < clients.length; i++){
            if(clients[i] != null){
                String[] temp = Arrays.copyOf(tempArray1, tempArray1.length +1);
                temp[tempArray1.length] = clients[i];
                tempArray1 = temp;
            }
        }

        return "SalesPerson: " + super.toString() +
                "\nClients: " + Arrays.toString(tempArray1) +
                ", AquiredClients: " + aquiredClients;
    }

}
