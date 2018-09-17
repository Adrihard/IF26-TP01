package if26.tp01.solution1;

/**
 * C'est aussi du mauvais travail !
 * @author adrian
 */
public class Stage
{
    private String  sigle;
    private String  categorie;
    private String  parcours;
    private int     credit;
    
    public Stage()
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

    public Stage(String sigle, String categorie, String parcours, int credit)
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
    
    public Module toModule()
    {
        return (new Module(this.sigle, this.categorie, this.parcours, this.credit));
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
