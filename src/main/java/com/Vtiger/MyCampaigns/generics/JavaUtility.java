package com.Vtiger.MyCampaigns.generics;

	import java.util.Date;
	import java.util.Random;

	public class JavaUtility {
		
		/** 
		 * @author Monica
		 * To generate a random number till 10000
		 * @return random number
		 */
		public int createRandomNum()
		{
			Random r = new Random();
			int rand = r.nextInt(10000);
			return rand;
		}
		    
		/**
		 * @author Monica
		 * Generate current system date
		 * @return current system date
		 */
		public String getCurrentSystemDate()
		{
			Date obj = new Date();
			String currentSysDate = obj.toString();
			return currentSysDate;
		}
		
		/**
		 * Generate current month
		 * @return current month
		 */
		@SuppressWarnings("deprecation")
		public int getCurrentMonth()
		{
			Date obj = new Date();
			return obj.getMonth();
		}
		
		/**
		 * @author Monica
		 * Gives current date
		 * @return date
		 */
		public String getDate()
		{
			Date obj = new Date();
			String currentSysDate = obj.toString();
			String arr[] = currentSysDate.split(" ");
			return arr[2];
		}

	}



