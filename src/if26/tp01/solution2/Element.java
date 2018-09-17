package if26.tp01.solution2;

/**
 *
 * @author adrian
 * 
 */
public abstract class Element
{
    private String  sigle;
    private String  categorie;
    private String  parcours;
    private int     credit;

    public void affiche()
    {
        System.out.println(this.toString());
    }

    public Element(String sigle, String categorie, String parcours, int credit)
    {
        this.sigle = sigle;
        this.categorie = categorie;
        this.parcours = parcours;
        this.credit = credit;
    }
    
    @Override
    public String toString()
    {
        return "Module{" + "sigle=" + sigle + ", categorie=" + categorie + ", parcours=" + parcours + ", credit=" + credit + '}';
    }

    public String getSigle()
    {
        return sigle;
    }
    
    public void setSigle(String sigle)
    {
        if (this.isSigleSettable())
            this.sigle = sigle;
        else
            throw new UnsupportedOperationException("Not supported.");
    }
    
    public abstract boolean isSigleSettable();
    
    public String getCategorie()
    {
        return categorie;
    }

    public void setCategorie(String categorie)
    {
        this.categorie = categorie;
    }

    public String getParcours()
    {
        return parcours;
    }

    public void setParcours(String parcours)
    {
        this.parcours = parcours;
    }

    public int getCredit()
    {
        return credit;
    }

    public void setCredit(int credit)
    {
        this.credit = credit;
    }
}
