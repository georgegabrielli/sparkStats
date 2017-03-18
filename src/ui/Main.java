package ui;

import repository.CarFileRepository;
import repository.IRepository;

/**
 * Created by gobi on 3/19/17.
 */
public class Main
{
    public static void main(String[] args)
    {
        IRepository carRepository = new CarFileRepository();
    }
}
