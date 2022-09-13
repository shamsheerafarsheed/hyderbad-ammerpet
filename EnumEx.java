package StringEx;

public class EnumEx {
public enum Day
{
	
		JANUARY(0),FEBRUARY(1),MARCH(2),APRIL(3),MAY(4),JUNE(5),JULY(6),AUGUST(7),SEPTEMPER(8),OCTOBER(9),NOVEMBER(10),DECEMBER(11);
	private  int dayIndex;
	Day(int name)
	{
		this.dayIndex=name;
	}

	public static void main(String[] args) {
		System.out.println(Day.MARCH.getDayIndex());
		System.out.println(Day.APRIL);
	}
	
		public int getDayIndex()
		{
			return dayIndex;
		}
	}

}
