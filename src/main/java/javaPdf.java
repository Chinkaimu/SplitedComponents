/**
 * Created by chm on 12/22/15.
 */

    import java.awt.*;
    import java.awt.geom.Rectangle2D;
    import java.io.FileOutputStream;
    import java.io.IOException;

    import com.itextpdf.text.*;
    import com.itextpdf.text.Font;
    import com.itextpdf.text.pdf.*;

    import org.jfree.chart.ChartFactory;
    import org.jfree.chart.JFreeChart;
    import org.jfree.chart.StandardChartTheme;
    import org.jfree.chart.plot.CategoryPlot;
    import org.jfree.chart.plot.PlotOrientation;
    import org.jfree.data.category.CategoryDataset;
    import org.jfree.data.general.DatasetUtilities;

/**
     * 描述：TODO 【JAVA生成PDF】
     * <p>
     *
     * @title GeneratePDF
     * @author SYJ
     * @email songyanjun_stars@126.com
     * @date 2013-4-6
     * @version V1.0
     */
    public class javaPdf {

        public static void main(String[] args) {

//            调用第一个方法，向C盘生成一个名字为ITextTest.pdf 的文件
//            try {
//                writeSimplePdf();
//            }
//            catch (Exception e) { e.printStackTrace(); }


//            调用第二个方法，向C盘名字为ITextTest.pdf的文件，添加章节。
            try {
                writeCharpter();
            }
            catch (Exception e) { e.printStackTrace(); }


//            try{
//                writeChart();
//            }catch (Exception e){e.printStackTrace();}
        }

        public static void writeSimplePdf() throws Exception {

            // 1.新建document对象
            // 第一个参数是页面大小。接下来的参数分别是左、右、上和下页边距。
            Document document = new Document(PageSize.A4, 50, 50, 50, 50);

            // 2.建立一个书写器(Writer)与document对象关联，通过书写器(Writer)可以将文档写入到磁盘中。
            // 创建 PdfWriter 对象 第一个参数是对文档对象的引用，第二个参数是文件的实际名称，在该名称中还会给出其输出路径。
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("/home/chm/temp/ITextTest.pdf"));

            // 3.打开文档
            document.open();

            // 4.向文档中添加内容
            // 通过 com.lowagie.text.Paragraph 来添加文本。可以用文本及其默认的字体、颜色、大小等等设置来创建一个默认段落
            document.add(new Paragraph("First page of the document."));
            document.add(new Paragraph("Some more text on the  first page with different color and font type."));

            // 5.关闭文档
            document.close();
        }

        /**
         * 添加含有章节的pdf文件
         *
         * @throws Exception
         */
        public static void writeCharpter() throws Exception {

            // 新建document对象 第一个参数是页面大小。接下来的参数分别是左、右、上和下页边距。
            Document document = new Document(PageSize.A4, 20, 20, 20, 20);

            // 建立一个书写器(Writer)与document对象关联，通过书写器(Writer)可以将文档写入到磁盘中。
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("/home/chm/temp/ITextTest.pdf"));

            // 打开文件
            document.open();

            // 标题
            document.addTitle("Hello mingri example");

            // 作者
            document.addAuthor("wolf");

            // 主题
            document.addSubject("This example explains how to add metadata.");
            document.addKeywords("iText, Hello mingri");
            document.addCreator("My program using iText");

            // document.newPage();
            // 向文档中添加内容
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));
            // 创建中文字体
            BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",
                    BaseFont.NOT_EMBEDDED);
            Font FontChinese = new Font(bfChinese, 12, Font.NORMAL);
             // 设置为中文
            Paragraph pragraph=new Paragraph("你好,这是中文", FontChinese);
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));
            document.add(pragraph);
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Second page of the document."));
            document.add(new Paragraph("Some more text on the first page with different color and font type."));

            Paragraph title1 = new Paragraph("Chapter 1",FontFactory.getFont
                    (FontFactory.COURIER, 12, Font.BOLDITALIC));

            // 新建章节
            Chapter chapter1 = new Chapter(title1, 1);
            chapter1.setNumberDepth(0);
            Paragraph title11 = new Paragraph("This is Section 1 in Chapter 1");
            Section section1 = chapter1.addSection(title11);
            Paragraph someSectionText = new Paragraph("This text comes as part of section 1 of chapter 1.");
            section1.add(someSectionText);
            someSectionText = new Paragraph("Following is a 3 X 2 table.");
            section1.add(someSectionText);


            int width = 600;
            int height = 400;
            PdfContentByte cb = writer.getDirectContent();
            PdfTemplate tp = cb.createTemplate(width, height);
            Graphics2D g2 = tp.createGraphics(width, height);
            Rectangle2D r2D = new Rectangle2D.Double(0, 0, width, height);
            createChart(createDataset()).draw(g2, r2D);
            g2.dispose();
            cb.addTemplate(tp, 0, 0);

            document.add(chapter1);

            // 关闭文档
            document.close();
        }

    public static CategoryDataset createDataset(){
        String[] rowKeys = {"A平台"};
        String[] colKeys = {"0:00","1:00","2:00","7:00","8:00","9:00","10:00","11:00"};

        double[][] data = {{4,3,1,1,1,2,8,1},};

        return DatasetUtilities.createCategoryDataset(rowKeys, colKeys, data);
    }

    public static JFreeChart createChart(CategoryDataset categoryDataset){
        StandardChartTheme standardChartTheme = new StandardChartTheme("name");
        standardChartTheme.setLargeFont(new java.awt.Font("楷体", java.awt.Font.BOLD,12));
        standardChartTheme.setRegularFont(new java.awt.Font("宋体", java.awt.Font.BOLD,8));
        standardChartTheme.setExtraLargeFont(new java.awt.Font("隶书", java.awt.Font.BOLD,20));

        ChartFactory.setChartTheme(standardChartTheme);

        JFreeChart jFreeChart =
                ChartFactory.createLineChart("不同类别按小时计算折线图",
                        "年份","数量",categoryDataset, PlotOrientation.VERTICAL,true,
                        false,false);
        CategoryPlot plot = (CategoryPlot)jFreeChart.getPlot();
        plot.setBackgroundAlpha(0.5f);
        plot.setForegroundAlpha(0.5f);

        return jFreeChart;
    }
        public static void writeChart() throws IOException {
            Document document = new Document(PageSize.A4, 20, 20, 20, 20);
            try {
                int width = 600;
                int height = 400;
                //FontMapper mapper = new AsianFontMapper(AsianFontMapper.ChineseSimplifiedFont, AsianFontMapper.ChineseSimplifiedEncoding_H);

                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("/home/chm/temp/ITextTest.pdf"));
                document.addAuthor("JFreeChart");
                document.addSubject("Demonstration");
                document.open();
                PdfContentByte cb = writer.getDirectContent();
                PdfTemplate tp = cb.createTemplate(width, height);
                Graphics2D g2 = tp.createGraphics(width, height);
                Rectangle2D r2D = new Rectangle2D.Double(0, 0, width, height);
                createChart(createDataset()).draw(g2, r2D);
                g2.dispose();
                cb.addTemplate(tp, 0, 0);

            } catch (DocumentException de) {
                System.err.println(de.getMessage());
            }
            document.close();
        }

    }


