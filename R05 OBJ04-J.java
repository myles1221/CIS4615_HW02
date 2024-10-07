

public final class MutableClass { //copy contructor
  private final Date date;
 
  public MutableClass(Date d) {
    this.date = d;
  }
 
  public void setDate(Date d) {
    this.date = new Date(d.getTime());  // Make defensive copy
  }
 
  public Date getDate() {
    return (Date) date.clone();
  }
}
