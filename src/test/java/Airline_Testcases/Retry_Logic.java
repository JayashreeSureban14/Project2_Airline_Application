package Airline_Testcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Logic implements IRetryAnalyzer
{
	int initial_count=0;
	int total_counts=1;

	@Override
	public boolean retry(ITestResult result) {
		
		if(initial_count<total_counts)
		{
			initial_count++;
			return true;
		}
		return false;
	}

}
