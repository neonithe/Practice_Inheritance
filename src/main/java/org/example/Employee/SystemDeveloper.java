package org.example.Employee;

import java.util.Arrays;

public class SystemDeveloper extends Employee {

    private String[] certificates = new String[10];
    private String[] languages = new String[10];

    public SystemDeveloper(int id, String name, double salary, int dateHired) {
        super(id, name, salary, dateHired);
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public void calc(){

        // Get the number of elements in array
        String[] cert = getCertificates();
        String[] lang = getLanguages();

        int certCount =0;
        int langCount =0;

        for(int i=0; i< cert.length; i++){
               if(cert[i] != null){
                   certCount++;
               }
        }
        for(int i=0; i< cert.length; i++) {
            if (cert[i] != null) {
                langCount++;
            }
        }
        double sum = certCount * 1000;
        double sum2 = langCount * 1500;

        // Calculate the new salary
        double baseSalary = getSalary();
        double result = baseSalary+sum+sum2;

        setSalary(result);
    }

    @Override
    public String toString() {
        String[] tempArray1 = new String[0];
        String[] tempArray2 = new String[0];

        for(int i=0; i < certificates.length; i++){
            if(certificates[i] != null){
                String[] temp = Arrays.copyOf(tempArray1, tempArray1.length +1);
                temp[tempArray1.length] = certificates[i];
            tempArray1 = temp;
            }
        }

        for(int i=0; i < languages.length; i++){
            if(languages[i] != null){
                String[] temp = Arrays.copyOf(tempArray2, tempArray2.length +1);
                temp[tempArray2.length] = languages[i];
            tempArray2 = temp;
            }
        }

        return "SystemDeveloper: " + super.toString() +
                "\nCertificates: " + Arrays.toString(tempArray1) +
                ", Languages: " + Arrays.toString(tempArray2);

    }

}
