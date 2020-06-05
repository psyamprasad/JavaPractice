import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SimpleDateFormat smsf=new SimpleDateFormat("dd-MMM-yyyy");
		String dates="7-Jun-2019";
		try
		{
			Date d=smsf.parse(dates);
			System.out.println(d);
			System.out.println(smsf.format(d));
			
		}
		catch(ParseException e)
		{
			e.printStackTrace();
			
		}

	}

}
