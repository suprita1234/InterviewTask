package Task;

public class RecentList {
	public String[] Rearrange(String[] recent, String play) {

		for (int j = 1; j < recent.length - 1; j++) {
			if (!(recent[j].equals(play))) {
				recent[j - 1] = recent[j];
				recent[j] = recent[j + 1];
			} else {
				String temp = recent[j];
				recent[j] = recent[j + 1];
				recent[j + 1] = temp;
			}
		}
		recent[recent.length - 1] = play;
		return recent;

	}
}
