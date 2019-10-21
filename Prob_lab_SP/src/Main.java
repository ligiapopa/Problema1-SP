
public class Main {
	
	public static void main(String args[]) {
  /* Book book=new Book("Disea Titanic");
    Author author=new Author("Radu Paul");
    book.addAuthor(author);
    int indexOfChapter=book.CreateChapter("Chapter1");
    Chapter chapt=book.getChapter(indexOfChapter);
   */
    /*
    int indexOfSubChapter=chapt.CreateSubChapter("Chapter one");
    SubChapter Subchapt=chapt.getChapter(indexOfChapter);
    int indexParagraph=Subchapt.CreateParagraph("Paragraph");
    int indexImage=Subchapt.CreateImage("Image");
    int indexTable=Subchapt.CreateTable("Table");  
    */
   /* int indexSubChapterOneOne =chapt.CreateSubChapter("Subcahpter1.1.");
    SubChapter scOneOne =chapt.getSubChapter(indexSubChapterOneOne);
    scOneOne.CreateParagraph("Paragraph 1");
    scOneOne.CreateParagraph("Paragraph 2");
    scOneOne.CreateParagraph("Paragraph 3");
    scOneOne.CreateImage("Image 1");
    scOneOne.CreateParagraph("Paragraph 4");
    scOneOne.CreateTable("Table 1");
    scOneOne.CreateParagraph("Paragraph 5");
    chapt.print();
    
    */
	Book noapteBuna =new Book("Noapte buna,copii");
	Author rpGheo =new Author("Radu Pavel Gheo");
	noapteBuna.addAuthor(rpGheo);
	
	Section cap1=new Section("Capitol 1");
	Section cap11=new Section("Capitol 1.1");
	Section cap111=new Section("Capitol 1.1.1");
	Section cap1111= new Section("Subchapter 1.1.1.1");
	noapteBuna.addContent(new Paragraph("Multumesc celor ce au facut posibila ..."));
	noapteBuna.addContent(cap1);
	 cap1.add(new Paragraph("Moto capitol"));
	 cap1.add(cap11);
	 cap11.add(new Paragraph("Text from subchapter 1.1"));
	 cap11.add(cap111);
	 cap111.add(new Paragraph("Text from subchapter 1.1.1"));
	 cap111.add(cap1111);
	 cap111.add(new Image("Image subchapter 1.1.1.1"));
	 noapteBuna.print();
    }
    
}
