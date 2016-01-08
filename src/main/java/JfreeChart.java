import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;

/**
 * Created by chm on 12/22/15.
 */
public class JfreeChart {

    public static CategoryDataset createDataset(){
        String[] rowKeys = {"A平台"};
        String[] colKeys = {"0:00","1:00","2:00","7:00","8:00","9:00","10:00","11:00"};

        double[][] data = {{4,3,1,1,1,2,8,1},};

        return DatasetUtilities.createCategoryDataset(rowKeys, colKeys, data);
    }

    public static JFreeChart createChart(CategoryDataset categoryDataset){
        StandardChartTheme standardChartTheme = new StandardChartTheme("name");
        standardChartTheme.setLargeFont(new Font("楷体", Font.BOLD,12));
        standardChartTheme.setRegularFont(new Font("宋体",Font.BOLD,8));
        standardChartTheme.setExtraLargeFont(new Font("隶书",Font.BOLD,20));

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

    /**
     * 生成饼状图
     * @return
     */
    public static JFreeChart PieChart() {
        JFreeChart chart = null;
        try{
            //设置数据集
            DefaultPieDataset dataset = new DefaultPieDataset();

            dataset.setValue("test1",7);
            dataset.setValue("test2",3);
            dataset.setValue("test3",5);
            dataset.setValue("test4",7);

            //通过工厂类生成JFreeChart对象ls
            chart = ChartFactory.createPieChart3D("栏目文章发布分布图",
                    dataset, true, false, false);

            TextTitle textTitle = chart.getTitle();
            textTitle.setFont(new Font("黑体",Font.BOLD,15));

            PiePlot pieplot = (PiePlot) chart.getPlot();
            pieplot.setLabelFont(new Font("宋体", 0, 12));
            StandardPieSectionLabelGenerator standarPieIG = new StandardPieSectionLabelGenerator("{0}:({1},{2})", NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance());
            pieplot.setLabelGenerator(standarPieIG);

            //没有数据的时候显示的内容
            pieplot.setNoDataMessage("无数据显示");
            pieplot.setCircular(false);
            pieplot.setLabelGap(0.02D);

            chart.getLegend().setItemFont(new Font("黑体",Font.BOLD,15));
//            XYPlot xyPlot=(XYPlot)chart.getPlot();
//            xyPlot.getRangeAxis().setLabelFont(new Font("黑体",Font.BOLD,15));

        }catch(Exception e){
            e.printStackTrace();
        }
        return chart;
    }

    public static void saveAsFile(JFreeChart chart,String outputPath,int weight,int height){
        FileOutputStream out = null;
        try{
            File outFile = new File(outputPath);
            if(!outFile.getParentFile().exists()){
                outFile.getParentFile().mkdirs();
            }
            out = new FileOutputStream(outputPath);
            ChartUtilities.writeChartAsJPEG(out,chart,weight,height);
            out.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (out != null){
                try{
                    out.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String args[]){
//        CategoryDataset dataset = createDataset();
        JFreeChart freeChart = PieChart();
        saveAsFile(freeChart,"/home/chm/temp/piechart.jpg",600,400);
    }

}
