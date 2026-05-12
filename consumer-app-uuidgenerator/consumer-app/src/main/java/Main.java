import io.github.wagnerdba.uuid.UUIDGenerator;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        while (true) {

            String uuidV4 = UUIDGenerator.generateV4();
            String uuidV7 = UUIDGenerator.generateV7();

            System.out.print("UUID V4: ");
            System.out.println(uuidV4);

            System.out.print("UUID V7: ");
            System.out.println(uuidV7);
            System.out.println();

            Thread.sleep(3000); // 3 segundos
        }
    }
}
