package cc.squiddev.cct.mount;

import org.teavm.classlib.ResourceSupplier;
import org.teavm.classlib.ResourceSupplierContext;

public class Resources implements ResourceSupplier {
    // TODO: Generate this in the build script

    // cd src/main/resources/assets/computercraft/lua/rom
    // find . -type f | sed -e 's/^.\/\(.*\)$/        "\1",/' | sort
    static final String[] FILES = new String[] {
        "apis/colors.lua",
        "apis/colours.lua",
        "apis/command/commands.lua",
        "apis/disk.lua",
        "apis/gps.lua",
        "apis/help.lua",
        "apis/io.lua",
        "apis/keys.lua",
        "apis/paintutils.lua",
        "apis/parallel.lua",
        "apis/peripheral.lua",
        "apis/rednet.lua",
        "apis/settings.lua",
        "apis/term.lua",
        "apis/textutils.lua",
        "apis/turtle/turtle.lua",
        "apis/vector.lua",
        "apis/window.lua",
        "autorun/.ignoreme",
        "help/adventure.txt",
        "help/alias.txt",
        "help/apis.txt",
        "help/bg.txt",
        "help/bit.txt",
        "help/bundled.txt",
        "help/cd.txt",
        "help/changelog.txt",
        "help/chat.txt",
        "help/clear.txt",
        "help/colors.txt",
        "help/colours.txt",
        "help/commandsapi.txt",
        "help/commands.txt",
        "help/copy.txt",
        "help/coroutine.txt",
        "help/craft.txt",
        "help/credits.txt",
        "help/dance.txt",
        "help/delete.txt",
        "help/disk.txt",
        "help/dj.txt",
        "help/drives.txt",
        "help/drive.txt",
        "help/earth.txt",
        "help/edit.txt",
        "help/eject.txt",
        "help/equip.txt",
        "help/events.txt",
        "help/excavate.txt",
        "help/exec.txt",
        "help/exit.txt",
        "help/falling.txt",
        "help/fg.txt",
        "help/fs.txt",
        "help/go.txt",
        "help/gpsapi.txt",
        "help/gps.txt",
        "help/hello.txt",
        "help/helpapi.txt",
        "help/help.txt",
        "help/http.txt",
        "help/id.txt",
        "help/intro.txt",
        "help/io.txt",
        "help/keys.txt",
        "help/label.txt",
        "help/list.txt",
        "help/lua.txt",
        "help/math.txt",
        "help/mkdir.txt",
        "help/modems.txt",
        "help/monitors.txt",
        "help/monitor.txt",
        "help/move.txt",
        "help/multishell.txt",
        "help/os.txt",
        "help/paint.txt",
        "help/paintutils.txt",
        "help/parallel.txt",
        "help/pastebin.txt",
        "help/peripherals.txt",
        "help/peripheral.txt",
        "help/pocket.txt",
        "help/printers.txt",
        "help/programming.txt",
        "help/programs.txt",
        "help/reboot.txt",
        "help/redirection.txt",
        "help/rednet.txt",
        "help/redstoneapi.txt",
        "help/redstone.txt",
        "help/refuel.txt",
        "help/rename.txt",
        "help/repeat.txt",
        "help/rs.txt",
        "help/settings.txt",
        "help/set.txt",
        "help/shellapi.txt",
        "help/shell.txt",
        "help/shutdown.txt",
        "help/speakers.txt",
        "help/string.txt",
        "help/table.txt",
        "help/term.txt",
        "help/textutils.txt",
        "help/time.txt",
        "help/tunnel.txt",
        "help/turn.txt",
        "help/turtle.txt",
        "help/type.txt",
        "help/unequip.txt",
        "help/vector.txt",
        "help/wget.txt",
        "help/whatsnew.txt",
        "help/window.txt",
        "help/workbench.txt",
        "help/worm.txt",
        "modules/command/.ignoreme",
        "modules/main/cc/completion.lua",
        "modules/main/cc/expect.lua",
        "modules/main/cc/shell/completion.lua",
        "modules/main/.ignoreme",
        "modules/turtle/.ignoreme",
        "motd.txt",
        "programs/advanced/bg.lua",
        "programs/advanced/fg.lua",
        "programs/advanced/multishell.lua",
        "programs/alias.lua",
        "programs/apis.lua",
        "programs/cd.lua",
        "programs/clear.lua",
        "programs/command/commands.lua",
        "programs/command/exec.lua",
        "programs/copy.lua",
        "programs/delete.lua",
        "programs/drive.lua",
        "programs/edit.lua",
        "programs/eject.lua",
        "programs/exit.lua",
        "programs/fun/advanced/levels/0.dat",
        "programs/fun/advanced/levels/10.dat",
        "programs/fun/advanced/levels/11.dat",
        "programs/fun/advanced/levels/12.dat",
        "programs/fun/advanced/levels/1.dat",
        "programs/fun/advanced/levels/2.dat",
        "programs/fun/advanced/levels/3.dat",
        "programs/fun/advanced/levels/4.dat",
        "programs/fun/advanced/levels/5.dat",
        "programs/fun/advanced/levels/6.dat",
        "programs/fun/advanced/levels/7.dat",
        "programs/fun/advanced/levels/8.dat",
        "programs/fun/advanced/levels/9.dat",
        "programs/fun/advanced/paint.lua",
        "programs/fun/advanced/redirection.lua",
        "programs/fun/adventure.lua",
        "programs/fun/dj.lua",
        "programs/fun/hello.lua",
        "programs/fun/worm.lua",
        "programs/gps.lua",
        "programs/help.lua",
        "programs/http/pastebin.lua",
        "programs/http/wget.lua",
        "programs/id.lua",
        "programs/label.lua",
        "programs/list.lua",
        "programs/lua.lua",
        "programs/mkdir.lua",
        "programs/monitor.lua",
        "programs/motd.lua",
        "programs/move.lua",
        "programs/peripherals.lua",
        "programs/pocket/equip.lua",
        "programs/pocket/falling.lua",
        "programs/pocket/unequip.lua",
        "programs/programs.lua",
        "programs/reboot.lua",
        "programs/rednet/chat.lua",
        "programs/rednet/repeat.lua",
        "programs/redstone.lua",
        "programs/rename.lua",
        "programs/set.lua",
        "programs/shell.lua",
        "programs/shutdown.lua",
        "programs/time.lua",
        "programs/turtle/craft.lua",
        "programs/turtle/dance.lua",
        "programs/turtle/equip.lua",
        "programs/turtle/excavate.lua",
        "programs/turtle/go.lua",
        "programs/turtle/refuel.lua",
        "programs/turtle/tunnel.lua",
        "programs/turtle/turn.lua",
        "programs/turtle/unequip.lua",
        "programs/type.lua",
        "startup.lua",
    };

    @Override
    public String[] supplyResources(ResourceSupplierContext context) {
        String[] out = new String[FILES.length + 1];
        out[0] = "assets/computercraft/lua/bios.lua";
        for (int i = 0; i < FILES.length; i++) out[i + 1] = "assets/computercraft/lua/rom/" + FILES[i];
        return out;
    }
}
