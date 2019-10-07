import java.util.ArrayList;
import java.util.List;

public class Chapter {
  private String title;

public Chapter(String title) {
	this.title = title;
}
private List<SubChapter> listSubChapter=new ArrayList<SubChapter>();

public  void setChapter(String chapter)
{
	title=chapter;
}

public int CreateSubChapter(String title) {
	SubChapter ch=new SubChapter(title);
	return listSubChapter.indexOf(ch);
	
}

public SubChapter getChapter(int indexOfSubChapter) {
     return listSubChapter.get(indexOfSubChapter);
}
}
