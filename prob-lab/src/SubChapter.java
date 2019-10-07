import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SubChapter {
 private String title;
 public SubChapter(String title) {

	this.title = title;
}
private List<Paragraph> listParagraph=new ArrayList<Paragraph>();
 private List<Table> listTable=new ArrayList<Table>();
 private   List<Image> listImage=new ArrayList<Image>();
public int CreateParagraph(String string) {
	Paragraph ch=new Paragraph(title);
	return listParagraph.indexOf(ch);
}
public int CreateImage(String string) {
   Image ch=new Image(string);
	return listImage.indexOf(ch);
}
public int CreateTable(String string) {
	 Table ch=new Table(string);
		return listTable.indexOf(ch);
}
 
}
