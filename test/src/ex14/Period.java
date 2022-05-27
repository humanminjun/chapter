package ex14;

public class Period {
	
	private Day from;
	private Day to;
	
	public Period(Day from, Day to) {
		this.from = from;
		this.to = to;
		
	}

	public Day getFrom() {return new Day(from);}
	
	public Day getTo() {return new Day(to);}
	
	@Override
	public String toString() {
		return"{" + from + "~" +to + "}";
	}
	
}
