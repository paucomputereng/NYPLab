/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;
 // Constructor: Sets up the sales person object with
// the given data. //-

public Salesperson (String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
}
//------------------------------------------- // Returns the sales person as a string. //-------------------------------------------         
public String toString()
    {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
//------------------------------------------- // Returns true if the sales people have
// the same name. //-------------------------------------------         
public boolean equals (Object other)
    {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
        firstName.equals(((Salesperson)other).getFirstName()));
    }
//-------------------------------------------------- // Order is based on total sales with the name
// (last, then first) breaking a tie. //--------------------------

    public int compareTo(Object digerSalesPerson){
        if(this.totalSales > ((Salesperson)digerSalesPerson).totalSales)
            return 1;
        else if(this.totalSales == ((Salesperson)digerSalesPerson).totalSales)
            return 0;
        else
            return -1;
    }

    public String getFirstName()
    {
            return firstName;
    }
    //-------------------------
    //  Last name accessor.
    //-------------------------
    public String getLastName()
    {
        return lastName;
    }
    //-------------------------
    //  Total sales accessor.
    //-------------------------
    public int getSales()
    {
        return totalSales;
} 
}