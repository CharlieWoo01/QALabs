package Basics;

public class lab02 {

    public static void main (String args[]){
        int age, houseNumber;
        String name, street, postCode, telephoneNum, company, formattedText;
        double salary;
        boolean drivingLicense;

        age = 18;
        name = "Charlie";
        street = "Some Street";
        postCode = "ME207HS";
        telephoneNum = "0494002020405";
        salary = 78.09;
        company = "NatWest";
        drivingLicense = true;
        formattedText = name + ' ' + age + ' ' + street +  ' ' + postCode +  ' ' + telephoneNum +  ' ' + salary +  ' ' + company + ' ' + drivingLicense;
        System.out.printf(formattedText);
    }
}
