
import com.mycompany.mavenproject2.Months;
import static org.junit.Assert.*;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author mariumbinteibrahim
 */
public class Test1 {
    
    @Test
    public void testParse(){   
      
       assertNotNull(Months.parse("January"));
       assertNotNull(Months.parse("Jan"));
       assertNull(Months.parse("Febu"));  
       assertEquals(Months.FEBRUARY,Months.parse("Feb"));
       assertNotEquals(Months.AUGUST, Months.parse("Augs"));  
       
                //Examples of wrong result
      // assertNotNull(Months.parse("Janu")); 
      // assertNull(Months.parse("Feb")); 
      // assertEquals(Months.FEBRUARY,Months.parse("Febus")); 
       
    }
    
    @Test
    public void testShortName(){
        
        assertEquals("Jan",Months.JANUARY.getShortName());
        assertNotEquals("Janu",Months.JANUARY.getShortName());
        assertNotNull(Months.FEBRUARY.getShortName());
        
                //Examples of wrong result
        //assertEquals("January",Months.JANUARY.getShortName());
 
    }
    
    @Test
    public void testDaysInMonths(){
        
        assertEquals(31,Months.JANUARY.daysInMonth());
        assertNotEquals(29,Months.FEBRUARY.daysInMonth());
        assertNotNull(Months.APRIL.daysInMonth());
        
                 //Examples of wrong result
        //assertNotEquals(28,Months.FEBRUARY.daysInMonth());         
                 
    }
    
    
    
}
