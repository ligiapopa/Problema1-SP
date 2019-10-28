
public class ImageProxy extends Image {
  private String imageName;
  
  private Image realImage;
  //doar cand faci print atunci trebuie obiectul real 
  public void print() {
	  if(realImage==null)
		realImage=new Image(imageName);
		System.out.println("Title Image"+imageName);
		
	}
public ImageProxy(String imageName) {
	super( imageName);
	//this.realImage = realImage;
}

}
