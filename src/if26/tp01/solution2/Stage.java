package if26.tp01.solution2;

/**
 *
 * @author adrian
 */
public class Stage extends Unite
{
    public Stage(String sigle, Parcours parcours, int credit)
    {
        super(sigle, Categorie.ST, parcours, credit);
    }

    @Override
    public boolean isCategorieSettable()
    {
        return (false);
    }
}