package ex14;

public class Day {
	private int year = 1;
	private int month = 1;
	private int date = 1;
	
	//������
	public Day()				                    {}
	public Day(int year)		                    { this.year = year;}
	public Day(int year, int month)	            	{ this(year); this.month = month;}
	public Day(int year, int month, int date)		{ this(year,month); this.date = date;}
	public Day(Day d)                               { this(d.year, d.month, d.date);}
	
	//��, ��, �� �ҷ�����
	public int getYear()  { return year;  }
	public int getMonth() { return month; }	
	public int getDate()  { return date;  }
	
	//��, ��, �� ����
	public void setYear(int year)   { this.year = year;   }
	public void setMonth(int month) { this.month = month; }
	public void setDate(int date)   { this.date = date;   }
	
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	//���� ã��
	public int dayOfWeek() {     // 0�Ͽ��� 1������ ....5�ݿ��� 6�����
		int y = year;
		int m = month;
		if (m ==1 || m == 2) {
			y--;
			m += 12;
		}
		return (y+y/4 - y / 100 + y / 400 + (13 * m + 8)/ 5 + date) % 7;
	}
	//��¥ d�� ������?
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}
	
	//���ڿ� ǥ�� ��ȯ
	public String toString() {
		String[] wd = {"��", "��", "ȭ", "��", "��", "��", "��"};
		return String.format("%04d�� %02d�� %02d��(%s)", 
				year,month,date,wd[dayOfWeek()]);
	}
}