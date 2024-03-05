
public class str_buffer {

	public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("This is StringBuffer");
        
        // 1. Adds the string "- This is a sample program" to the existing string and display it.
        stringBuffer.append(" - This is a sample program");
        System.out.println("1. " + stringBuffer);
        
        // 2. Inserts the string "Object" into the existing string at the 21st position and display it.
        stringBuffer.insert(20, "Object");
        System.out.println("2. " + stringBuffer);
        
        // 3. Reverses the entire string and displays it.
        stringBuffer.reverse();
        System.out.println("3. " + stringBuffer);
        
        // 4. Replaces the word "Buffer" with "Builder" and display it.
        stringBuffer.replace(stringBuffer.indexOf("Buffer"), stringBuffer.indexOf("Buffer") + "Buffer".length(), "Builder");
        System.out.println("4. " + stringBuffer);
    }
}

