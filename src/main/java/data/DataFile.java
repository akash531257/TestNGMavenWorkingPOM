package data;


import utility.Xls_Reader;
public class DataFile {

	
	  Xls_Reader xl=new Xls_Reader("C:\\Users\\JAY SHRI KRISHNA\\Desktop\\Testing Class\\Projectfolder\\Selenium_Workspace\\TestNGMavenWorkingPOM\\src\\main\\java\\data\\AkashTestData.xlsx");
	 
	 
		public String wrongEmail = xl.getCellData("Data1", "username",2);
		public String wrongPassword = xl.getCellData("Data1", "password",2);
		public String ExpectedError="Epic sadface: Username and password do not match any user in this service";
	 
}
