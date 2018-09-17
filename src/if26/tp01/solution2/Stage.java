package if26.tp01.solution2;

/**
 *
 * @author adrian
 */
public class Stage extends Element
{
    public Stage(String sigle, String parcours, int credit)
    {
        super(sigle, "ST", parcours, credit);
    }

    @Override
    public boolean isSigleSettable()
    {
        return (false);
    }
}