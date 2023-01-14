public class Main {
    public static void main(String[] args) {
		long start = System.currentTimeMillis();
        // Printable p = new PrinterProxy("Alice");
		Printable p = new Printer("Alice");
        System.out.println("名前は現在" + p.getPrinterName() + "です。");
        p.setPrinterName("Bob");
        System.out.println("名前は現在" + p.getPrinterName() + "です。");
		long lap1 = System.currentTimeMillis();
		System.out.println("ここまでの所要時間：" + (lap1 - start) + "ms");
        p.print("Hello, world.");
		long lap2 = System.currentTimeMillis();
		System.out.println("ここまでの所要時間：" + (lap2 - start) + "ms");
    }
}
