package ui;

import repository.CarFileRepository;
import repository.IRepository;
import repository.InsuranceFileRepository;

/**
 * Created by gobi on 3/19/17.
 */
public class Main
{
    public static void main(String[] args)
    {
        IRepository carRepository = new CarFileRepository();
        IRepository insuranceRepository = new InsuranceFileRepository();
    }
}
