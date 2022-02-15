package data;

import java.util.ArrayList;

import utility.Xls_Reader;

public class DataProviderFile {
	
	 static Xls_Reader xl;

		public static ArrayList<Object[]> testdata() {
			
			ArrayList<Object[]> myData=new ArrayList<Object[]>();
			
			try {
				
				xl=new Xls_Reader("C:\\Users\\JAY SHRI KRISHNA\\Desktop\\Testing Class\\Projectfolder\\Selenium_Workspace\\TestNGMavenWorkingPOM\\src\\main\\java\\data\\AkashTestData.xlsx");
				
			}
			catch(Exception e) {
				System.out.println("File Not Found");
			}
			int numberofRow=xl.getRowCount("RegistrationData");
			
			for(int i=2;i<=numberofRow;i++) {
				
				String firstname=xl.getCellData("Data1","FirstName",i);
				String lastname=xl.getCellData("Data1","LastName",i);
				
				
				Object[] regdata= {firstname,lastname};
				myData.add(regdata);
			}
			
		
			return myData;
			
		}
		

}
