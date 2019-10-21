
public class Image extends Element{
    private String Title;
    public Image(String title) {Title=title;}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public void print() {
		
		System.out.println("Title Image"+Title);
	}
}
