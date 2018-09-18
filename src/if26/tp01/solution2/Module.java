package if26.tp01.solution2;

/**
 *
 * @author adrian
 */
public class Module extends Unite
{   
    public Module(String sigle, Categorie categorie, Parcours parcours, int credit)
    {
        super(sigle, categorie, parcours, credit);
    }  

    @Override
    public boolean isCategorieSettable()
    {
        return (true);
    }
}
