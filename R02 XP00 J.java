
//hopefully doing this one correctly: 

public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  someFile.delete();
 
}

public class Replace {
  public static void main(String[] args) {
    String original = "insecure";
    original.replace('i', '9');
    System.out.println(original);
  }
}
