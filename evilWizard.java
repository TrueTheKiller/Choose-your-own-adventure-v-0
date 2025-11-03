public class evilWizard
{
    //This will be used for all wizards and bosses, allowing me to use the same class for multiple levels of 'wizard'
    //This is just me declaring some variables
    String wizardName;
    int damage;
    int health;
    
    //this is a simple method that allows me to create a wizard enemy at any time without having to spicify multiple lines of code.
    public evilWizard(String actWizName, int actWizDam)
    {
        wizardName = actWizName;
        damage = actWizDam;
    }
    
    //This allows me to set the damage for a specific wizard later on if needed, I'll likely use this only for bosses butI think I might add buffs and debuffs later. Not sure though
    public int setWizardDamage(int setDmg)
    {
        damage = setDmg;
        return damage;
    }
    
    //This allows me to get the wizards damage, again might use this but not extremely likely.
    public int getWizardDamage()
    {
        return damage;
    }
    
    //This allows me to set the wizards name, this will likely only be used for bosses.
    public String setWizardName(String setName)
    {
        wizardName = setName;
        return wizardName;
    }
    
    //This allows for me to get a specific wizards name with ease.
    public String getWizardName()
    {
        return wizardName;
    }
    
    //This allows form me to get a wizards stat with ease.
    public String getStats()
    {
        return wizardName + "\nDamage: " + damage + "\nHealth: " + health;
    }
}
