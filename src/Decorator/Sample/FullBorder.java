public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {                   // 字符数为被装饰物的字符数加上两侧边框字符数
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {                      // 行数为被装饰物的行数加上上下边框的行数
        return 1 + display.getRows() + 1;
    }

    /**
     * 指定的那一行的字符串
     * @param row
     * @return
     */
    @Override
    public String getRowText(int row) {
        if (row == 0) {
            // 上边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            // 下边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            // 其他边框
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char ch, int count) {         // 生成一个重复count次字符ch的字符串
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
