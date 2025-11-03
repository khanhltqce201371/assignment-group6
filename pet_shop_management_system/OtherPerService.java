import java.util.Scanner;

public class OtherPerService extends Service {

    private String description;   // mô tả dịch vụ (ví dụ: "Tắm cho chó", "Cắt móng mèo")
    private int duration;         // thời gian thực hiện (phút)

    // Constructor mặc định
    public OtherPerService() {
        super();
    }

    // Constructor đầy đủ
    public OtherPerService(String serviceId, String serviceName, double price, String description, int duration) {
        super(serviceId, serviceName, price);
        this.description = description;
        this.duration = duration;
    }

    // Nhập thông tin dịch vụ khác
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter service ID: ");
        serviceId = sc.nextLine();

        System.out.print("Enter service name: ");
        serviceName = sc.nextLine();

        System.out.print("Enter service price: ");
        price = Double.parseDouble(sc.nextLine());

        System.out.print("Enter description: ");
        description = sc.nextLine();

        System.out.print("Enter duration (minutes): ");
        duration = Integer.parseInt(sc.nextLine());
    }

    // Hiển thị thông tin dịch vụ
    @Override
    public void output() {
        System.out.printf("%-10s %-20s %-10.2f %-25s %-10d\n",
                serviceId, serviceName, price, description, duration);
    }

    // Getter & Setter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
