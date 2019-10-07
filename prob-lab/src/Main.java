
public class Main {

	public static void main(String args[])
	{
	Book book=new Book("Disea Titanic");
	Author author= new Author("Radu Paul");
	book.addAuthor(author);
	int indexOfChapter=book.CreateChapter("Chapter One");
	Chapter chap=book.getChapter(indexOfChapter);
	int IndexOfSubChapter=chap.CreateSubChapter("Chapter One");
	SubChapter SubChapt=chap.getChapter(IndexOfSubChapter);
	int indexParagrapf=SubChapt.CreateParagraph("Paragraph");
	int indexImage=SubChapt.CreateImage("Image");
	int indexTable=SubChapt.CreateTable("Table");
	}
}
