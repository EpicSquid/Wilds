package dev.epicsquid.wilds

import dev.epicsquid.squidink.registry.SquidInkRegistrate
import net.minecraftforge.fml.common.Mod

@Mod(Wilds.MODID)
class Wilds {
	companion object {
		const val MODID = "wilds"

		val REGISTRATE by lazy { SquidInkRegistrate.create(MODID) }
	}
}