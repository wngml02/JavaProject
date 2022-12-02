package concert;

public class cafe extends concertmove {
	public enum hallLocation {
		olympicpark, skydome, jamsil, suwon, sangam, jangchung, kintex
	}
	
	@Override
	public void view() {
		System.out.println("카페리스트");
	}
}
