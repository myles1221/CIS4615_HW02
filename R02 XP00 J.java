
//hopefully doing this one correctly: 

public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  if(!someFile.delete()){
   //handle failure to delete the file
  }

 //It is especially important to process the return values of immutable object methods
 //Although many methods of mutable objects operate by changing some internal state of the object, methods of immutable objects
 // cannot change the object and often return a mutated new object, leaving the original object unchanged.
}

public class Replace {
  public static void main(String[] args) {
    String original = "insecure";
    original = original.replace('i', '9');
    System.out.println(original);
  }
}
