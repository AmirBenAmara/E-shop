/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.shop;

import eshop.models.Claim;
import eshop.models.Customer;
import eshop.models.Order;
import eshop.models.Product;
import eshop.services.ClaimServices;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gold Solution
 */
public class ClaimTest {
    public static void main(String[] args) throws ParseException {
        
        //Order o1 = new Order();
        
       /* Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d2 = sdf.parse("2017-09-25");*/
       
        String d1 = "01-02-1994";
        java.util.Date utilDate = new SimpleDateFormat("dd-MM-yyyy").parse(d1);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        Claim c1 = new Claim(sqlDate,"il m'a arnaqué");
        
        ClaimServices claimservice = new ClaimServices();
        //claimservice.add(c1);
        //claimservice.remove(c1);
        //claimservice.afficher();
        Claim c = claimservice.findById(2);
        System.out.println(c);
        
        System.out.println(c1.toString());
        
    }
}
