package com.astr0ni.bonepackets.registry;

import com.astr0ni.bonepackets.BonemealPackets;
import com.astr0ni.bonepackets.base.PacketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MINI_BONEMEAL_PACKET = new PacketItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1).maxDamage(7));
    public static final Item BONEMEAL_PACKET = new PacketItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1).maxDamage(63));
    public static final Item BIG_BONEMEAL_PACKET = new PacketItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1).maxDamage(511));
    public static final Item LARGE_BONEMEAL_PACKET = new PacketItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1).maxDamage(4095));

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(BonemealPackets.mod_id, "mini_bone_meal_packet"), MINI_BONEMEAL_PACKET);
        Registry.register(Registry.ITEM, new Identifier(BonemealPackets.mod_id, "bone_meal_packet"), BONEMEAL_PACKET);
        Registry.register(Registry.ITEM, new Identifier(BonemealPackets.mod_id, "big_bone_meal_packet"), BIG_BONEMEAL_PACKET);
        Registry.register(Registry.ITEM, new Identifier(BonemealPackets.mod_id, "large_bone_meal_packet"), LARGE_BONEMEAL_PACKET);
    }
}
