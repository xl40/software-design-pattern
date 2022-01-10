/**
 * @author xuelin
 */
public class StringDisplay extends Display {
    /**
     * 要显示的字符串
     */
    private final String string;

    public StringDisplay(String string) {           // 通过参数传入要显示的字符串
        this.string = string;
    }

    @Override
    public int getColumns() {                       // 字符数
        return string.getBytes().length;
    }

    @Override
    public int getRows() {                          // 行数是1
        return 1;
    }

    @Override
    public String getRowText(int row) {             // 仅当row为0时返回值
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
