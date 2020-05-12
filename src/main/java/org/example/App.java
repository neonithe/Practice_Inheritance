package org.example;

import org.example.Employee.SalesPerson;
import org.example.Employee.SystemDeveloper;

public class App 
{

    public static void main( String[] args )
    {

        /*** Employee 1 : sysdev *****************************************************************************/
        SystemDeveloper employee1 = new SystemDeveloper(1, "Mattias", 25000,"2020-05-11");
        // Add cert and lang to increase salary
        String[] cert = new String[10];
        cert[0] = "Cert1";
        cert[1] = "Cert2";
        String[] lang = new String[10];
        lang[0] = "Lang1";
        lang[1] = "Lang2";

        //Set the new arrays
        employee1.setCertificates(cert);
        employee1.setLanguages(lang);
        //Calculate the new salary
        employee1.calc();

        /*** Employee 2 : Sale *******************************************************************************/
        SalesPerson employee2 = new SalesPerson(1,"Martin",25000, "2020-05-11");
        // Add clients to increase salary
        String[] clients = new String[10];
        clients[0] = "Client 1";
        clients[1] = "Client 2";
        // Add new clients to increase salary
        int newClients = 2;

        //Set the new array
        employee2.setClients(clients);
        //Set new value of new clients
        employee2.setAquiredClients(newClients);
        //Calculate the new salary
        employee2.calc();
        /**** END EMPLOYEES ***********************************************************************************/

        //Print
        // New salary SystemDev: 25000 + (3*1000 + 2*1500 = 5000) =30 000
        System.out.println(employee1);
        System.out.println();
        // New salary Sale: 25000 + (2*500 + 2*1000 = 3000) =28 000
        System.out.println(employee2);

        employee1.calc();

    }

}
