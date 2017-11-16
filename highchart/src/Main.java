public class Main {
    public static void main(String[] args) {
        try{
            String name = "polar";
            Runtime.getRuntime().exec("cmd /c start create.bat "+name);
//            Runtime.getRuntime().exec("cmd /c start highcharts-export-server -infile line.json -outfile line.png");
            Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ;
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
