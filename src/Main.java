public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.74;
        int weight = 65;
        double result = service.bodyMassIndex(height, weight);
        System.out.println(result);
        System.out.println();
        System.out.println("20-25 – норма, нет факторов, угрожающих здоровью\n" +
                "25-30 – присутствует избыточный вес, необходимо снизить массу тела, чтобы улучшить состояние здоровья (при этом для мужчин, занимающихся спортом, ИМТ до 27 является нормой)\n" +
                "30-35 – ожирение, высокий уровень угрозы здоровью\n" +
                "35 и более – ожирение 3 и более степени, требуется обращение к специалисту и снижение массы тела.");
    }
}
