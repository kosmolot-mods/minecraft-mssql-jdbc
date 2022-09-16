package pl.kosma.mssql_jdbc;

import net.minecraftforge.fml.common.Mod;

@Mod(value = "mssql_jdbc", modid = "mssql_jdbc", acceptableRemoteVersions = "*")
public class ForgeMod112
{
    public ForgeMod112() {
        try { new ForgeSetup113(); } catch (Exception e) {}
        try { new ForgeSetup117(); } catch (Exception e) {}
    }
}
