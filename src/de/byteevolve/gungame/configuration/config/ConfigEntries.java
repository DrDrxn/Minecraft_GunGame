package de.byteevolve.gungame.configuration.config;

import de.byteevolve.gungame.configuration.ConfigEntry;

public enum ConfigEntries implements ConfigEntry {

    //DEFAULT
    PREFIX(ConfigSections.MESSAGES, "prefix", "&8[&aGun&2Game&8]", "&8[&aGun&2Game&8]", "Text vor jeder Nachricht."),
    NOPERM(ConfigSections.MESSAGES, "noperm", "&7Du bist nicht berechtigt dieses Kommando zu verwenden.", "&7Du bist nicht berechtigt dieses Kommando zu verwenden.", "Nachricht wenn ein Spieler nicht die benötigten Rechte hat."),
    MUSTAPLAYER(ConfigSections.MESSAGES, "mustaplayer", "&7Du musst ein &aSpieler &7sein!", "&7Du musst ein &aSpieler &7sein!", "Nachricht an Entities, welche keine Spieler sind."),
    PLAYERNOTONLINE(ConfigSections.MESSAGES, "playernotonline", "&7Der Angegebene Spieler konnte nicht gefunden werden.", "&7Der Angegebene Spieler konnte nicht gefunden werden.", "Nachricht wenn ein Spieler nicht online ist."),

    //ARENA COMMAND
    PLAYERCREATESARENA(ConfigSections.MESSAGES, "playercreatesarena", "&cDu erstellst schon eine Arena", "&cDu erstellst schon eine Arena", "Nachricht wenn ein Spieler eine Arena erstellen will, aber schon eine erstellt"),
    ARENAEXISTS(ConfigSections.MESSAGES, "arenaexists", "&7Die Arena:&a %ARENANAME% &7gibt es schon.", "&7Die Arena:&a %ARENANAME% &7gibt es schon.", "Nachricht wenn ein Spieler eine Arena erstellen will, welche schon vorhanden ist. \n%ARENANAME% = Platzhalter für den Arenanamen"),
    PLAYERCREATEARENA(ConfigSections.MESSAGES, "playercreatearena", "&7Du erstellst nun die Arena:&a %ARENANAME%&7. (&2/arena edit&7)", "&7Du erstellst nun die Arena:&a %ARENANAME%&7. (&2/arena edit&7)", "Nachricht wenn ein Spieler eine Arena erstellt. \n%ARENANAME% = Platzhalter für den Arenaname"),
    ARENANOTEXISTS(ConfigSections.MESSAGES, "arenanotexists",  "&7Die Arena:&a %ARENANAME% &7gibt es nicht.", "&7Die Arena:&a %ARENANAME% &7gibt es nicht.", "Nachricht wenn es eine Arena nicht gibt. \n%ARENANAME% = Platzhalter für den Arenanamen"),
    PLAYERNOTCREATESARENA(ConfigSections.MESSAGES, "playernotcreatesarena", "&7Du erstellst gerade keine Arena. (&2/arena create Name&7)", "&7Du erstellst gerade keine Arena. (&2/arena create Name&7)", "Nachricht wenn ein Spieler eine Arena mit /arena edit bearbeiten will, aber keine erstellt."),
    ARENAHELP(ConfigSections.MESSAGES, "arenahelp", "&7Nutze &c/arena &7<&ccreate&7,&cedit&7> &7<&cName&7> &7<&cDisplayname&7>", "&7Nutze &c/arena &7<&ccreate&7,&cedit&7> &7<&cName&7> &7<&cDisplayname&7>", "Hilfe Nachricht zum erstellen einer Arena"),
    NOARENAEXISTS(ConfigSections.MESSAGES, "noarenaexists","&cEs wurde noch keine Arena erstellt.", "&cEs wurde noch keine Arena erstellt.", "Nachricht an einen Spieler, wenn keine Arena gefunden wurde."),

    //BUILD COMMAND
    BUILDON(ConfigSections.MESSAGES, "buildon", "&7Du bist nun im &aBuild-Modus&7.","&7Du bist nun im &aBuild-Modus&7.", "Nachricht an einen Spieler, welcher in den Build Modus geht."),
    BUILDOFF(ConfigSections.MESSAGES, "buildoff", "&7Du bist nun &cnicht &7mehr im &aBuild-Modus&7.","&7Du bist nun &cnicht &7mehr im &aBuild-Modus&7.", "Nachricht an einen Spieler, welcher aus dem Build Modus geht."),

    //STATS COMMAND
    STATS(ConfigSections.MESSAGES, "stats", "&m&l&7-------- &aStats&7 -&a %PLAYER% &m&l&7-------- \n &7Kills:&a %KILLS% \n &7Tode:&a %DEAHTS% \n &7Rekord:&a %HIGHSCORE% \n &7Punkte:&a %POINTS% \n &7KD:&a %KD% \n &7Rang:&a #%RANK% \n &7&m&l-------------------------------------", "&m&l&7-------- &aStats&7 -&a %PLAYER% &m&l&7-------- \n &7Kills:&a %KILLS% \n &7Tode:&a %DEAHTS% \n &7Rekord:&a %HIGHSCORE% \n &7Punkte:&a %POINTS% \n &7KD:&a %KD% \n &7Rang:&a #%RANK% \n &7&m&l-------------------------------------", "Nachrichten welche bei dem Command /stats kommen. \n %PLAYER% = Spielername \n %KILLS% = Kills von dem Spieler \n %DEAHTS% = Tode von dem Spieler \n %POINTS% = Punkte von dem Spieler \n %HIGHSCORE% = Rekord von dem Spieler \n %KD% = KD von dem Spieler \n %RANK% = Rang von dem Spieler"),

    //TEMAS COMMAND
    NOTEAMALLOWED(ConfigSections.MESSAGES, "noteamallowed", "&7Bei dieser &aMap &7kannst du diesen Command §cnicht &7benutzen.", "&7Bei dieser &aMap &7kannst du diesen Command &cnicht &7benutzen.", "Nachricht an einen Spieler, welcher ein Team eröffnen will, bei einer Map, welche keine Teams erlaubt."),
    PLAYERINTEAM(ConfigSections.MESSAGES, "playerinteam", "&cDer Spieler ist schon in einem Team", "&cDer Spieler ist schon in einem Team", "Nachricht wenn ein Spieler versucht jemanden in ein Team einzuladen, welcher schon in einem ist."),
    PLAYERTEAMINVITE(ConfigSections.MESSAGES, "playerteaminvite", "&7Du hast&a %TARGET% &7zu einem Team eingeladen.", "&7Du hast&a %TARGET% &7zu einem Team eingeladen.", "Nachricht an den Spieler, der einen anderen in ein Team eingeladen hat. \n %TARGET% = Eingeladener Spielername"),
    PLAYERCANTINVITETEAMMEMBER(ConfigSections.MESSAGES,"playercantinviteteammember", "&cEs kann nur der Team-Inhaber andere einladen.", "&cEs kann nur der Team-Inhaber andere einladen.", "Nachricht an einen Spieler, welcher einen anderen Spieler zu einem Team einladen will, wo er nicht der Inhaber von ist."),
    TEAMCREATE(ConfigSections.MESSAGES, "teamcreate" , "&7Du hast ein &aTeam &7erstellt.", "&7Du hast ein &aTeam &7erstellt.", "Nachricht an einen Spieler, wenn er ein Team erstellt."),
    TEAMJOIN(ConfigSections.MESSAGES, "teamjoin", "&a%PLAYER% &7ist dem Team &2beigetreten§7.", "&a%PLAYER% &7ist dem Team &2beigetreten§7.", "Nachricht an alle Spieler im Team, wenn ein neuer das Team betritt. \n%PLAYER% = Spielername"),
    TEAMSIZE(ConfigSections.SETTINGS, "teamsize", 2, 2, "Team Größe ohne Inhaber"),
    TEAMFULL(ConfigSections.MESSAGES, "teamisfull", "&cDas Team ist schon voll.", "&cDas Team ist schon voll.", "Nachricht an einen Spieler, welcher ein Team betreten will, welches voll ist."),
    TEAMJOINPLAYER(ConfigSections.MESSAGES, "teamjoinplayer", "&7Du bist dem Team von&a %OWNER% &2beigetreten&7.", "&7Du bist dem Team von&a %OWNER% &2beigetreten&7.", "Nachricht an den Spieler, welcher ein Team betritt. \n %OWNER% = Inhabername des Teams"),
    PLAYERHASNOTEAMINVITE(ConfigSections.MESSAGES,"playerhasnoinvite", "&cDu wurdest zu keinem Team eingeladen.", "&cDu wurdest zu keinem Team eingeladen.", "Nachricht an einen Spieler, welcher in kein Team eingeladen wurde."),
    PLAYERISINTEAM(ConfigSections.MESSAGES, "playerisinteam", "&cDu bist schon in einem Team.", "&cDu bist schon in einem Team.", "Nachricht an einen Spieler, welcher in ein Team will, obwohl er schon in einem ist."),

    //MYSQL
    MYSQL_HOST(ConfigSections.MYSQL, "host", "localhost", "localhost", "Hostname deiner MySQl Datenbank"),
    MYSQL_PASSWORD(ConfigSections.MYSQL, "password", "password", "password", "Passwort deiner MySQl Datenbank"),
    MYSQL_DATABASE(ConfigSections.MYSQL, "database", "gungame", "gungame", "Zu benutzende Datenbank von MySQl"),
    MYSQL_PORT(ConfigSections.MYSQL, "port", 3306, 3306, "Port deiner MySQl Datenbank"),
    MYSQL_USERNAME(ConfigSections.MYSQL, "username", "root", "root", "Username deiner MySQl Datenbank");



    private ConfigSections section;
    private String path,desc;
    private Object value, defaultValue;
    ConfigEntries(ConfigSections section, String path, Object value, Object defaultValue, String desc){
        this.section = section;
        this.path = path;
        this.value = value;
        this.defaultValue = defaultValue;
        this.desc = desc;
    }

    public int getAsInt(){
        return (int) getValue();
    }

    public String getAsString(){
        return getValue().toString().replaceAll("&", "§");
    }

    @Override
    public String getPath() {
        return this.path;
    }

    @Override
    public Object getValue() {
        return this.value;
    }

    @Override
    public Object getDefaultValue() {
        return this.defaultValue;
    }

    @Override
    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public ConfigSections getSection() {
        return this.section;
    }

    @Override
    public String getDescription() {
        return this.desc;
    }
}
