import io.github.wagnerdba.uuid.UUIDGenerator;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        while (true) {

            String uuid = UUIDGenerator.generateV4();

            System.out.print("UUID gerado: ");
            System.out.println(uuid);

            Thread.sleep(1000); // 1 segundo
        }
    }
}
