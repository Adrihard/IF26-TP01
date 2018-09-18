package if26.tp01.solution2;

/**
 *
 * @author adrian
 */
public class Stage extends Element
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