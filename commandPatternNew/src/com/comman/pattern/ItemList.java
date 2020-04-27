package com.comman.pattern;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ItemList {
	
	Item item;
	final String FILENAME;
	
	public ItemList() {
		this.item= item;
		this.FILENAME= "";
	}

public boolean saveItems(Context context) {
   try {
       FileOutputStream fos = context.openFileOutput(FILENAME, 0);
       OutputStreamWriter osw = new OutputStreamWriter(fos);
       Json gson = new Json();
       gson.toJson(item, osw);
       osw.flush();
       fos.close();
   } catch (FileNotFoundException e) {
       e.printStackTrace();
       return false;
   } catch (IOException e) {
       e.printStackTrace();
       return false;
   }
   return true;
}

	public void addItem(Item item) {
		this.item= item;
	
	
}

}
