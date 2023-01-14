public class Printer implements Printable {
    private String name; // 名前
    private String internalState = ""; // プリンタの内部状態

    // コンストラクタ
    public Printer() {
        checkInternalState("Printerのインスタンスを生成中");
    }

    // コンストラクタ（名前指定）
    public Printer(String name) {
        this.name = name;
        checkInternalState("Printerのインスタンス(" + name + ")を生成中");
    }

    // 名前の設定
    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    // 名前の取得
    @Override
    public String getPrinterName() {
        return name;
    }
    
    @Override
    public String getInternalState() {
    	return internalState;
    }

    // 名前付きで表示
    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    // 重い作業(のつもり)
    private void checkInternalState(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
            internalState += i;
        }
        System.out.println("完了。");
    }
}
