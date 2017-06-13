public class Cola {
    long volume;
    double price;


    public Cola(int volume) {
        this.volume = volume;
    }

    public double countPrice(double dollarsForMillilitre) {
        return volume*dollarsForMillilitre;
    }


}
