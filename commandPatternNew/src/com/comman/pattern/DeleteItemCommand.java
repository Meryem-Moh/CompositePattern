package com.comman.pattern;

public class DeleteItemCommand {private ItemList item_list;
private Item item;
private Context context;

public DeleteItemCommand(ItemList item_list, Item item, Context context) {
    this.item_list = item_list;
    this.item = item;
    this.context = context;
}

public void execute() {
    item_list.deleteItem();
    setIsExecuted(item_list.saveItems(context));
}


	public boolean deleteItem(Item item) {
		DeleteItemCommand delete_item_command = new DeleteItemCommand(item_list, item, context);
		delete_item_command.execute();
		 
		boolean success = delete_item_command.isExecuted();
		if (!success){
		   return true;
		}
		return true;
}


}
