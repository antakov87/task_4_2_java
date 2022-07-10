public class BmiService {
    public double bodyMassIndex(double height, int weight) {

        double bodyMassIndex1 = height * height;
        double bodyMassIndex = weight / bodyMassIndex1;
        return bodyMassIndex;

        }
}
