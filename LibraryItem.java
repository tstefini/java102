package java102;

public class LibraryItem {
    public final String title;
    public final String itemId;
    
    protected boolean isCheckedOut = false;

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    

	public boolean available() {
		return !isCheckedOut;
	}

    public void checkOut() {
        isCheckedOut = true;
        System.out.println(title + " was not checked out.");

    }

    public void returnItem() {
        isCheckedOut = false;
        System.out.println(title + " has been returned.");

    }

    public void printStatus() {
        String status = isCheckedOut ? "Checked out" : "Returned";
        System.out.println(title + ": " + status);
    }
}

