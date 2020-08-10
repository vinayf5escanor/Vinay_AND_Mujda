/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * @author VINAY
 */
public class PassValidTest {
    
    public PassValidTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    

    @Test
    public void testValidateLengthGood() {
        System.out.println("validateLength");
        String password = "Abc1234@a";
        boolean expResult = true;
        boolean result = PassValid.validateLength(password);
        assertEquals("nope",expResult, result);
      
    }
    @Test
    public void testValidateLengthBad() {
        System.out.println("validateLength");
        String password = "Abc12";
        boolean expResult = false;
        boolean result = PassValid.validateLength(password);
        assertEquals("nope",expResult, result);
       
    }
    @Test
    public void testValidateLengthBIn() {
        System.out.println("validateLength");
        String password = "Abc1234";
        boolean expResult = false;
        boolean result = PassValid.validateLength(password);
        assertEquals("nope",expResult, result);
    }
    @Test
    public void testValidateLengthBOut() {
        System.out.println("validateLength");
        String password = "Abc1234";
        boolean expResult = false;
        boolean result = PassValid.validateLength(password);
        assertEquals("nope",expResult, result);
    }

    @Test
    public void testValidateUppergood() {
        System.out.println("validateUpper");
        String password = "Abc1234@a";
        boolean expResult = true;
        boolean result = PassValid.validateUpper(password);
        assertEquals(expResult, result);
     
    }
     public void testValidateUpperBad() {
        System.out.println("validateUpper");
        String password = "abc1234@a";
        boolean expResult = false;
        boolean result = PassValid.validateUpper(password);
        assertEquals(expResult, result);
       
    }
      public void testValidateUpperIn() {
        System.out.println("validateUpper");
        String password = "Abc1234@a";
        boolean expResult = false;
        boolean result = PassValid.validateUpper(password);
        assertEquals(expResult, result);
    
    }
       public void testValidateUpperOut() {
        System.out.println("validateUpper");
        String password = "Abc1234@a";
        boolean expResult = false;
        boolean result = PassValid.validateUpper(password);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testValidateCharGood() {
        System.out.println("validateChar");
        String password = "Abc1234a";
        boolean expResult = true;
        boolean result = PassValid.validateChar(password);
        assertEquals(expResult, result);
        
    }

     @Test
    public void testValidateCharBad() {
        System.out.println("validateChar");
        String password = "bc1234a";
        boolean expResult = true;
        boolean result = PassValid.validateChar(password);
        assertEquals(expResult, result);
        
    }

     @Test
    public void testValidateCharIn() {
        System.out.println("validateChar");
        String password = "Abc123@a";
        boolean expResult = true;
        boolean result = PassValid.validateChar(password);
        assertEquals(expResult, result);
        
    }

     @Test
    public void testValidateCharOut() {
        System.out.println("validateChar");
        String password = "Abc12340po@";
        boolean expResult = true;
        boolean result = PassValid.validateChar(password);
        assertEquals(expResult, result);

    }

    @Test
    public void testValidateGood() {
        System.out.println("validate");
        String password = "Abc1234@a";
        boolean expResult = true;
        boolean result = PassValid.validate(password);
        assertEquals(expResult, result);

     
    }
    public void testValidateBad() {
        System.out.println("validate");
        String password = "Abc123";
        boolean expResult = false;
        boolean result = PassValid.validate(password);
        assertEquals(expResult, result);
      
    }
    public void testValidateIn() {
        System.out.println("validate");
        String password = "Abc1234@a";
        boolean expResult = false;
        boolean result = PassValid.validate(password);
        assertEquals(expResult, result);

     
    }
    public void testValidateOut() {
        System.out.println("validate");
        String password = "Abc1234@a";
        boolean expResult = false;
        boolean result = PassValid.validate(password);
        assertEquals(expResult, result);
        
     
    }
 
    
    @Test
    public void testValidateLengthGood1() {
        System.out.println("validateLength");
        String password = "Abc1234@a";
        boolean expResult = true;
        boolean result = PassValid.validateLength(password);
        assertEquals("nope",expResult, result);
      
    }
    @Test
    public void testValidateLengthBad1() {
        System.out.println("validateLength");
        String password = "Abc12";
        boolean expResult = false;
        boolean result = PassValid.validateLength(password);
        assertEquals("nope",expResult, result);
       
    }
    @Test
    public void testValidateLengthBIn1() {
        System.out.println("validateLength");
        String password = "Abc1234";
        boolean expResult = false;
        boolean result = PassValid.validateLength(password);
        assertEquals("nope",expResult, result);
    }
    @Test
    public void testValidateLengthBOut1() {
        System.out.println("validateLength");
        String password = "Abc1234";
        boolean expResult = false;
        boolean result = PassValid.validateLength(password);
        assertEquals("nope",expResult, result);
    }

    @Test
    public void testValidateUppergood1() {
        System.out.println("validateUpper");
        String password = "Abc1234@a";
        boolean expResult = true;
        boolean result = PassValid.validateUpper(password);
        assertEquals(expResult, result);
     
    }
     public void testValidateUpperBad1() {
        System.out.println("validateUpper");
        String password = "abc1234@a";
        boolean expResult = false;
        boolean result = PassValid.validateUpper(password);
        assertEquals(expResult, result);
       
    }
      public void testValidateUpperIn1() {
        System.out.println("validateUpper");
        String password = "Abc1234@a";
        boolean expResult = false;
        boolean result = PassValid.validateUpper(password);
        assertEquals(expResult, result);
    
    }
       public void testValidateUpperOut1() {
        System.out.println("validateUpper");
        String password = "Abc1234@a";
        boolean expResult = false;
        boolean result = PassValid.validateUpper(password);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testValidateCharGood1() {
        System.out.println("validateChar");
        String password = "Abc1234a";
        boolean expResult = true;
        boolean result = PassValid.validateChar(password);
        assertEquals(expResult, result);
        
    }

     @Test
    public void testValidateCharBad1() {
        System.out.println("validateChar");
        String password = "bc1234a";
        boolean expResult = true;
        boolean result = PassValid.validateChar(password);
        assertEquals(expResult, result);
        
    }

     @Test
    public void testValidateCharIn1() {
        System.out.println("validateChar");
        String password = "Abc123@a";
        boolean expResult = true;
        boolean result = PassValid.validateChar(password);
        assertEquals(expResult, result);
        
    }

     @Test
    public void testValidateCharOut1() {
        System.out.println("validateChar");
        String password = "Abc12340po@";
        boolean expResult = true;
        boolean result = PassValid.validateChar(password);
        assertEquals(expResult, result);

    }

    @Test
    public void testValidateGood1() {
        System.out.println("validate");
        String password = "Abc1234@a";
        boolean expResult = true;
        boolean result = PassValid.validate(password);
        assertEquals(expResult, result);

     
    }
    public void testValidateBad1() {
        System.out.println("validate");
        String password = "Abc123";
        boolean expResult = false;
        boolean result = PassValid.validate(password);
        assertEquals(expResult, result);
      
    }
    public void testValidateIn1() {
        System.out.println("validate");
        String password = "Abc1234@a";
        boolean expResult = false;
        boolean result = PassValid.validate(password);
        assertEquals(expResult, result);

     
    }
    public void testValidateOut1() {
        System.out.println("validate");
        String password = "Abc1234@a";
        boolean expResult = false;
        boolean result = PassValid.validate(password);
        assertEquals(expResult, result);
        
     
    }
    
}
