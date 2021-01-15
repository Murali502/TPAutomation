package pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtil;

public class Verify_for_all {

	public Object[][] getData()
	{
		Object[][]value=ExcelUtil.getTestData("Sheet1");
		return value;
	}
	
	@Test(dataProvider ="getData")
	public void CreateAll(String Tname,String ExecutionStatus,String ProductType)
	{
		if(ExecutionStatus.equalsIgnoreCase("Y"))
		{
			try {
				if(ProductType.equals("ECC"))
				{
					Verify_create_flow_Export.Create();
				}
				else if(ProductType.equals("ECC"))
				{
					
				}
				else if(ProductType.equals("ECC"))
				{
					
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				Assert.fail();
			}finally {}
		}
	}
}