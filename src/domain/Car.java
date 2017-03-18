package domain;

/**
 * Created by gobi on 3/19/17.
 */
public class Car
{
    private int ID;
    private String make;
    private String model;
    private int year;
    private String plate;
    private String chassisCode;

    public Car(int ID, String make, String model, int year, String plate, String chassisCode)
    {
        this.ID = ID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.plate = plate;
        this.chassisCode = chassisCode;
    }

    public Car()
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

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getPlate()
    {
        return plate;
    }

    public void setPlate(String plate)
    {
        this.plate = plate;
    }

    public String  getChassisCode()
    {
        return chassisCode;
    }

    public void setChassisCode(String chassisCode)
    {
        this.chassisCode = chassisCode;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "ID=" + ID +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", plate=" + plate +
                ", chassisCode=" + chassisCode +
                '}';
    }
}
