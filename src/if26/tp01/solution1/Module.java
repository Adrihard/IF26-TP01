package if26.tp01.solution1;

/**
 *
 * @author adrian
 */
public class Module
{
    private String  sigle;
    private String  categorie;
    private String  parcours;
    private int     credit;
    
    public Module()
    {
        this.sigle      = "";
        this.categorie  = "";
        this.parcours   = "";
        this.credit     = 0;
    }

    public void affiche()
    {
        System.out.println(this.toString());
    }

    public Module(String sigle, String categorie, String parcours, int credit)
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
        this.sigle = sigle;
    }

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
