package session7;

public class Assignment3 {
@SuppressWarnings("null")
public static String getValueNull(String value)
{
	RuntimeException nullRefrence=null;
	try{
		if(value==null)
			throw nullRefrence;
		else
			return value;
		
	}catch(NullPointerException e)
	{
		return "null refrence exception";
	}
}
public static void main(String[] args)
{
	String val=null;
	System.out.println(getValueNull(val));
}
}
