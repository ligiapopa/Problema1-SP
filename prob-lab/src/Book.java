import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Book {
 private String titlu;
 private List<Chapter> listChapter=new ArrayList<Chapter>();
public Book(String titlu) {
	//super();
	this.titlu = titlu;
}

private List<Author> listAuthor=new ArrayList<Author>(); 

public int  CreateChapter(String chapterNew)
{
Chapter chp =new Chapter(chapterNew);
listChapter.add(chp);
return listChapter.indexOf(chp);

}
public void addAuthor(Author author)
{
	listAuthor.add(author);
}
public Chapter getChapter(int indexOfChapter) {
	return listChapter.get(indexOfChapter);
	
}


}
