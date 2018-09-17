package if26.tp01.solution2;

/**
 *
 * @author adrian
 */
public class Module extends Element
{   
    public Module(String sigle, String categorie, String parcours, int credit)
    {
        super(sigle, categorie, parcours, credit);
    }  

    @Override
    public boolean isSigleSettable()
    {
        return (true);
    }
}
