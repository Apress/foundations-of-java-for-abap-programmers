/*
 * Created on Sep 14, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.sap.examples.calculator.beans;

import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

import com.sap.examples.calculator.Calculator;
import com.sap.examples.calculator.CalculatorHome;

/**
 * @author arooney
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class CalcProxy
{
   private Calculator calc;
   public CalcProxy() throws Exception 
   {
      init();
   }


public void init() throws Exception 
{
   //Lookup the enterprise bean
   try 
   {
      InitialContext ctx = new InitialContext();
      Object ob = ctx.lookup("java:comp/env/ejb/CalculatorBean");
      CalculatorHome home = ( CalculatorHome ) PortableRemoteObject.narrow( ob, CalculatorHome.class );
 //Initialize the enterprise bean
      calc = home.create();
   } catch ( Exception e ) 
   {
      throw new Exception("Error instantiating Calculator EJB" + e.toString());
   }

   }
public float getResult( String firstNumber, String secondNumber, String expression ) throws Exception 
{
   float result = 0;
   try
   {
     if ( firstNumber != null && secondNumber != null ) 
     {
      //Parse the input parameters
       float first = Float.parseFloat( firstNumber );
       float second = Float.parseFloat( secondNumber );
       int expr = Integer.parseInt( expression );

      //Invoke the relevant method of the enterprise bean
       switch ( expr ) 
       {
       case 1:
       result = calc.multiply( first, second );
       break;
       case 2:
       result = calc.divide( first, second );
       break;
       case 3:
       result = calc.add( first, second );
       break;
       case 4:
       result = calc.subtract( first, second );
       break;
       }
     }
   }catch (Exception re)
   {

       throw new Exception("Fill in all required fields with appropriate values!");

   }
//Return the result of the calculation
      return result;

   }

}
