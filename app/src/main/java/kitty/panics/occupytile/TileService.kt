package kitty.panics.occupytile;

import android.service.quicksettings.Tile
import android.service.quicksettings.TileService

class TileService : TileService() {
    override fun onStartListening() {
        super.onStartListening()
        val tile = qsTile
        tile.label = getString(R.string.app_name)
        tile.state = Tile.STATE_INACTIVE
        tile.updateTile()
    }

    override fun onClick() {
        // 无操作
    }

    // 为每个磁贴创建静态内部类
    class Tile1 : TileService()
    class Tile2 : TileService()
    class Tile3 : TileService()
    class Tile4 : TileService()
    class Tile5 : TileService()
    class Tile6 : TileService()
    class Tile7 : TileService()
    class Tile9 : TileService()
    class Tile10 : TileService()
    class Tile11 : TileService()
    class Tile12 : TileService()
    class Tile13 : TileService()
    class Tile14 : TileService()
    class Tile15 : TileService()
    class Tile16 : TileService()
    class Tile17 : TileService()
    class Tile18 : TileService()
    class Tile19 : TileService()
    class Tile20 : TileService()
    class Tile21 : TileService()
    class Tile22 : TileService()
    class Tile23 : TileService()
    class Tile24 : TileService()
    class Tile25 : TileService()
    class Tile26 : TileService()
    class Tile27 : TileService()
    class Tile28 : TileService()
    class Tile29 : TileService()
    class Tile30 : TileService()
    class Tile31 : TileService()
    class Tile32 : TileService()
}
