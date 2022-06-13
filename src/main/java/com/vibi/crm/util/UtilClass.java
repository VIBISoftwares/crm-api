package com.vibi.crm.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import org.springframework.stereotype.Repository;

@Repository
public class UtilClass {

	public static String getCurrentDateAndTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		return formatter.format(cl.getTime());
	}

	public List<String> getListofDaysInAMonthForGivenDate(String given_date) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		d1 = sdf.parse(given_date);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d1);
		boolean leap = false;
		int year = calendar.get(Calendar.YEAR);
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			leap = true;
		else
			leap = false;
		calendar.setTime(d1);
		int count = 0;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH);
		if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
			count = 31;
		} else if (month == 3 || month == 5 || month == 8 || month == 10) {
			count = 30;
		} else if (month == 1 && leap) {
			count = 29;

		} else {
			count = 28;
		}
		calendar.add(Calendar.DATE, -day + 1);
		String strDate1 = dateFormat.format(calendar.getTime());
		List<String> strDateList = new ArrayList<>();
		strDateList.add(0, strDate1);
		for (int i = 1; i <= count - 1; i++) {
			calendar.add(Calendar.DATE, 1);
			String strDate7 = dateFormat.format(calendar.getTime());
			strDateList.add(i, strDate7);
		}

		return strDateList;

	}
	
	public static List<String> getDaysBetweenDates(String startdate, String enddate) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1;
		Date d2;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		d1 = sdf.parse(startdate);
		d2 = sdf.parse(enddate);
	    List<String> dates = new ArrayList<String>();
	    Calendar calendar = new GregorianCalendar();
	    calendar.setTime(d1);
	 
	    while (calendar.getTime().before(d2) || calendar.getTime().equals(d2))
	    {
//	        Date result = calendar.getTime();
	        String strDate1 = dateFormat.format(calendar.getTime());
//	        dates.add(result);
	        dates.add(strDate1);
	        calendar.add(Calendar.DATE, 1);
	    }
	    return dates;
	}
	
	public static List<String> getMonthsBetweenDates(String startdate, String enddate) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1;
		Date d2;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		d1 = sdf.parse(startdate);
		d2 = sdf.parse(enddate);
	    List<String> dates = new ArrayList<String>();
	    Calendar calendar_fday = new GregorianCalendar();
	    calendar_fday.setTime(d1);
	    calendar_fday.get(Calendar.MONTH);
	 
	    while (calendar_fday.getTime().before(d2) || calendar_fday.getTime().equals(d2))
	    {
//	        Date result = calendar.getTime();
	        String strDate1 = dateFormat.format(calendar_fday.getTime());
//	        dates.add(result);
	        dates.add(strDate1);
	        calendar_fday.add(Calendar.MONTH, 1);
	    }
	    return dates;
	}
	
	public static List<String> getBussinessDaysBetweenDates(String startdate, String enddate) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1;
		Date d2;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		d1 = sdf.parse(startdate);
		d2 = sdf.parse(enddate);
	    List<String> dates = new ArrayList<String>();
	    Calendar calendar = new GregorianCalendar();
	    calendar.setTime(d1);
	 
	    while (calendar.getTime().before(d2) || calendar.getTime().equals(d2))
	    {
//	        Date result = calendar.getTime();
	        String strDate1 = dateFormat.format(calendar.getTime());
//	        int dayOfWeek = Calendar.DAY_OF_WEEK;
//	        DayOfWeek dayOfWeek = DayOfWeek.valueOf(strDate1);
	        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	        System.out.println(dayOfWeek);
//	        dates.add(result);
	        if(!(dayOfWeek==1 || dayOfWeek==7)) {
	        dates.add(strDate1);
	        calendar.add(Calendar.DATE, 1);
	        }else {
	        calendar.add(Calendar.DATE, 2);
	        }
	    }
	    return dates;
	    
	}
	
	public String formatDate(String given_date, String given, String target) {
		DateFormat originalFormat = new SimpleDateFormat(given);
		DateFormat targetFormat = new SimpleDateFormat(target);
		Date date = null;
		try {
			date = originalFormat.parse(given_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String formattedDate = targetFormat.format(date).toString();
		return formattedDate;
	}
	
	public static String addSecondToGivenDateAndSecond(String given_date, int value) {
		SimpleDateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = originalFormat.parse(given_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.SECOND, value);
		String formattedDate = originalFormat.format(calendar.getTime()).toString();
		return formattedDate;
	}
	
	public static String addDaysToGivenDateAndDays(String given_date, int value) {
		SimpleDateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = originalFormat.parse(given_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, value);
		String formattedDate = originalFormat.format(calendar.getTime()).toString();
		return formattedDate;
	}
	
	public static int compareTwoDates(String first_date, String last_date) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = null;
		Date d2 = null;

		try {
			d1 = sdf.parse(first_date);
			d2 = sdf.parse(last_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d1.compareTo(d2);
//		if (d1.compareTo(d2) < 0) {
//			return -1;
//		} else if (d1.compareTo(d2) > 0) {
//			return 1;
//		} else {
//			return 0;
//		}
	}
	
	public static String getMonthDayYear(String date) {
		LocalDate currentDate = LocalDate.parse(date);		      
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM dd, yyyy");	    
	    String formattedDate = currentDate.format(myFormatObj); 	    
	    return formattedDate;
	}
	
	public static String getCurrentDate() {
		LocalDate currDate = LocalDate.now();        
        String returnDate = currDate.toString();
        return returnDate;
	}
	
	public static String getPreviousDateFolderFormat() {
		LocalDate currDate = LocalDate.now(); 
		LocalDate currDatePre = currDate.minusDays(1);
		String m = String.valueOf(currDatePre.getMonthValue()).length()<2? "0"+String.valueOf(currDatePre.getMonthValue()):String.valueOf(currDatePre.getMonthValue());
		String d = String.valueOf(currDatePre.getDayOfMonth()).length()<2? "0"+String.valueOf(currDatePre.getDayOfMonth()):String.valueOf(currDatePre.getDayOfMonth());
        return m+d+String.valueOf(currDatePre.getYear());
	}
	
	public static String getMonthOfPreviousDate() {
		LocalDate currDate = LocalDate.now(); 
		LocalDate currDatePre = currDate.minusDays(1);
        return String.valueOf(currDatePre.getMonth());
	
	}
	
	public static String getYearOfPreviousDate() {
		LocalDate currDate = LocalDate.now(); 
		LocalDate currDatePre = currDate.minusDays(1);
        return String.valueOf(currDatePre.getYear());
	}
	
	public static Integer getDayOfWeek() {
		LocalDate currDate = LocalDate.now(); 
		DayOfWeek dayOfWeek = currDate.getDayOfWeek();
        return dayOfWeek.getValue();
	}
	
	public static String getPreviousDate(String dateInString) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse(dateInString);
		long previousDayMilliSeconds = date.getTime() - (24 * 60 * 60 * 1000);
		Date previousDate = new Date(previousDayMilliSeconds);
		String previousDateStr = dateFormat.format(previousDate);
		return previousDateStr;
	}
	
	public static int countOfOccurrences(String str, String word) 
	{
		int index = 0, count = 0;
        while (true)
        {
            index = str.indexOf(word, index);
            if (index != -1)
            {
                count ++;
                index += word.length();
            }
            else {
                break;
            }
        } 
        return count;
   }
	
	public static String getCurrentMonth() {
		LocalDate currDate = LocalDate.now();        
        String month = currDate.getMonth().toString();
        return month;
	}
	
	public String getFormatedDate(final Date date) {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return myFormat.format(date);
	}
	
	public static String getCurrentYear() {
		LocalDate currDate = LocalDate.now(); 
        return String.valueOf(currDate.getYear());
	}
	
	public static String getCurrentDateFolderFormat() {
		LocalDate currDate = LocalDate.now(); 
		String m = String.valueOf(currDate.getMonthValue()).length()<2? "0"+String.valueOf(currDate.getMonthValue()):String.valueOf(currDate.getMonthValue());
		String d = String.valueOf(currDate.getDayOfMonth()).length()<2? "0"+String.valueOf(currDate.getDayOfMonth()):String.valueOf(currDate.getDayOfMonth());
        return m+d+String.valueOf(currDate.getYear());
	}

}
