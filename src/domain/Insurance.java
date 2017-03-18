package domain;

import java.util.Date;

/**
 * Created by gobi on 3/19/17.
 */
public class Insurance
{
    private int ID;
    private int carID;
    private String issuer;
    private Date expiration;
    private Date start;

    public Insurance(int ID, int carID, String issuer, Date expiration, Date start)
    {
        this.ID = ID;
        this.carID = carID;
        this.issuer = issuer;
        this.expiration = expiration;
        this.start = start;
    }

    public Insurance()
    {
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public int getCarID()
    {
        return carID;
    }

    public void setCarID(int carID)
    {
        this.carID = carID;
    }

    public String getIssuer()
    {
        return issuer;
    }

    public void setIssuer(String issuer)
    {
        this.issuer = issuer;
    }

    public Date getExpiration()
    {
        return expiration;
    }

    public void setExpiration(Date expiration)
    {
        this.expiration = expiration;
    }

    public Date getStart()
    {
        return start;
    }

    public void setStart(Date start)
    {
        this.start = start;
    }

    @Override
    public String toString()
    {
        return "Insurance{" +
                "carID=" + carID +
                ", issuer='" + issuer + '\'' +
                ", expiration=" + expiration +
                ", start=" + start +
                '}';
    }
}
