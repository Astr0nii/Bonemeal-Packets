package com.astr0ni.bonepackets;

import com.astr0ni.bonepackets.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class BonemealPackets implements ModInitializer {

	public static final String mod_id = "bmpack";

	@Override
	public void onInitialize() {
		ModItems.RegisterItems();

		System.out.println("Hello Fabric world!");
	}
}
