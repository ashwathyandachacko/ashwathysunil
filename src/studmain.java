//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.ArrayList;
//
///**
// * Created by expert on 13/8/18.
// */
//public class studmain {
//    public static void main(String[] args) throws Exception {
//        ArrayList<stud> li=new ArrayList<>();
//        BufferedReader br=new BufferedReader(new FileReader("mark.txt"));
//        String str;
//        while((str=br.readLine())!=null)
//        {
//            String x[] =str.split(",");
//            li.add(new stud(Integer.parseInt(x[0]),x[1],Integer.parseInt(x[2])));
//
//
//        }
//        for(stud st:li){
//            System.out.println(st.id+" "+st.name+" "+st.marks);
//        }
//
//    }
//}
