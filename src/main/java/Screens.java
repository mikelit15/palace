public enum Screens 
{
    START("Start"),
    SETTINGS("Settings"),
    GAME("Game");

    private String name = null;

    private Screens(String screenName)
    {
        name = screenName;
    }

    public String getName()
    {
        return name;
    }
}
