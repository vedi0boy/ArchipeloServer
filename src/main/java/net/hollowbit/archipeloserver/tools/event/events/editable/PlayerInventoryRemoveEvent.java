package net.hollowbit.archipeloserver.tools.event.events.editable;

import net.hollowbit.archipeloserver.entity.living.Player;
import net.hollowbit.archipeloserver.entity.living.player.PlayerInventory;
import net.hollowbit.archipeloserver.items.Item;
import net.hollowbit.archipeloserver.tools.event.EditableEvent;
import net.hollowbit.archipeloserver.tools.event.EventType;
import net.hollowbit.archipeloserver.tools.inventory.Inventory;

public class PlayerInventoryRemoveEvent extends EditableEvent {

	private Player player;
	private Item item;
	
	public PlayerInventoryRemoveEvent (Player player, Item item) {
		super(EventType.PlayerInventoryRemove);
		this.player = player;
		this.item = item;
	}

	public Item getItem () {
		return item;
	}

	public void setItem (Item item) {
		if (editingPrevented)
			return;
		
		this.item = item;
	}

	public Player getPlayer () {
		return player;
	}
	
	public PlayerInventory getPlayerInventory () {
		return player.getInventory();
	}
	
	public Inventory getInventory () {
		return player.getInventory().getMainInventory();
	}

}
