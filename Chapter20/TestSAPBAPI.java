import com.sap.mw.jco.*;
//import java.util.*;

/**
 * @author Alistair Rooney
 *
 * Execute the BAPI to fetch the Companies from SAP
 * Alistair Rooney (c) 2002 2003
 * 
 */
public class TestSAPBAPI
{

  JCO.Client mConnection;
  JCO.Repository mRepository;
  
  
  public TestSAPBAPI() 
  {
     Object[] [] data;
     try 
     {
     // Change the logon information to your own system/user
      mConnection =
      JCO.createClient("005", // SAP client
      "arooney",            // userid
      "********",           // password (Fill in your real password)
      null,                 // language
      "Goofy",             // application server host name
      "00");                // system number
      mConnection.connect();
      mRepository = new JCO.Repository("ARAsoft", mConnection);
    }
    catch (Exception ex) 
    {
      ex.printStackTrace();
      System.exit(1);
    }
    JCO.Function function = null;
    JCO.Table codes = null;
    try 
    {
      function = this.createFunction("BAPI_COMPANYCODE_GETLIST");
      if (function == null) 
      {
        System.out.println("BAPI_COMPANYCODE_GETLIST" +
                           " not found in SAP.");
        System.exit(1);
      }
      mConnection.execute(function);
      JCO.Structure returnStructure =
        function.getExportParameterList().getStructure("RETURN");
      if (! (returnStructure.getString("TYPE").equals("") ||
             returnStructure.getString("TYPE").equals("S")) ) 
      {
        System.out.println(returnStructure.getString("MESSAGE"));
        System.exit(1);
      }
      codes =
        function.getTableParameterList().getTable("COMPANYCODE_LIST");
      data = new Object[codes.getNumRows()] [2];  
      for (int i = 0; i < codes.getNumRows(); i++) 
      {
        codes.setRow(i);
        data[i][0] = codes.getString("COMP_CODE"); 
        data[i][1] = codes.getString("COMP_NAME");
      }
      DisplayFrame df = new DisplayFrame(data);
    }
    catch (Exception ex) 
    {
      ex.printStackTrace();
      System.exit(1);
    }
    try 
    {
      codes.firstRow();
      for (int i = 0; i < codes.getNumRows(); i++, codes.nextRow())
       {
        function = this.createFunction("BAPI_COMPANYCODE_GETDETAIL");
        if (function == null) 
        {
          System.out.println("BAPI_COMPANYCODE_GETDETAIL" +
                             " not found in SAP.");
          System.exit(1);
        }
        function.getImportParameterList().
          setValue(codes.getString("COMP_CODE"), "COMPANYCODEID");
        function.getExportParameterList().setActive(false, "COMPANYCODE_ADDRESS");
        mConnection.execute(function);
        JCO.Structure returnStructure =
          function.getExportParameterList().getStructure("RETURN");
        if (! (returnStructure.getString("TYPE").equals("") ||
               returnStructure.getString("TYPE").equals("S") ||
               returnStructure.getString("TYPE").equals("W")) ) 
        {
          System.out.println(returnStructure.getString("MESSAGE"));
        }
        JCO.Structure detail =
          function.getExportParameterList().
          getStructure("COMPANYCODE_DETAIL");
          System.out.println(detail.getString("COMP_CODE") + '\t' +
          detail.getString("COUNTRY") + '\t' +
          detail.getString("CHRT_ACCTS") + '\t' +
          detail.getString("CITY"));
       }
       
    }
    catch (Exception ex) 
    {
      ex.printStackTrace();
      System.exit(1);
    }
    finally
    {
       mConnection.disconnect();
    }
  }
  public JCO.Function createFunction(String name) throws Exception 
  {
    try 
    {
      IFunctionTemplate ft = mRepository.getFunctionTemplate(name.toUpperCase());
      if (ft == null)
        return null;
      return ft.getFunction();
    }
    catch (Exception ex) 
    {
      throw new Exception("Problem retrieving JCO.Function object.");
    }
  }
  public static void main (String args[]) 
  {
    TestSAPBAPI app = new TestSAPBAPI();
  }
}
